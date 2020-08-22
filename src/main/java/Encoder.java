import com.sun.org.apache.regexp.internal.RE;

public class Encoder {
    private String message;
    private String key;
    private String normalizedKey;

    public Encoder(String message, String key){
        this.message = message;
        this.key = key;
        this.normalizedKey = normalizeKey();
    }

    public String normalizeKey(){
        int messageL = message.length();
        int keyL = key.length();
        int idx = 0;
        char[] c = new char[messageL];
        for(int i = 0; i<messageL; i++){
            if(idx == keyL){
                idx = 0;
            }
            c[i] = key.charAt(idx);
            idx++;
        }
        return String.valueOf(c);
    }

    private char getEncoderCharacter(char rowIdx, char tableIdx){
        char[][] table = TableCreator.getTable();
        for(int i = 0; i< table[0].length; i++){
            if (table[0][i] == rowIdx){
                rowIdx = (char) i;
            }
            if(table[0][i] == tableIdx) {
                tableIdx = (char) i;
            }
        }
        return table[rowIdx][tableIdx];
    }

    public String encode(){
        String result = "";
        for(int i = 0; i<normalizedKey.length(); i++){
            result = result.concat(String.valueOf(getEncoderCharacter(normalizedKey.charAt(i),message.charAt(i))));
        }
        return result;
    }
}
