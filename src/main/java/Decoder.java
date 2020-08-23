public class Decoder {
    private String encoded;
    private String normalizedKey;

    public Decoder(String encoded, String normalizedKey){
        this.encoded = encoded;
        this.normalizedKey = normalizedKey;
    }

    private char getDecodedCharacter(int idx){
        char[][] table = TableCreator.getTable();
        for(int i = 0; i< 96; i++){
            if (table[i][0] == normalizedKey.charAt(idx)) {
                for(int j =0; j < 96; j++){
                    if(table[i][j] == encoded.charAt(idx)){
                        return table[0][j];
                    }
                }
            }
        }
        throw new NullPointerException();
    }

    public String decode(){
        String result = "";
        for(int i =0; i<normalizedKey.length(); i++){
            result = result.concat(String.valueOf(getDecodedCharacter(i)));
        }
        return result;
    }



}
