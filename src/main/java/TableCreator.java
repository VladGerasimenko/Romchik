import java.util.Objects;

public  class TableCreator{
    static char[][] arr;
    public static char[][] getTable(){
        if(Objects.isNull(arr)){
            arr = createTable();
        }
        return arr;
    }
    public static char[][] createTable() {
        char[][] alpha = new char[26][26];
        for (int j = 0; j < 26; j++) {
            for (int i = 0; i < 26; i++) {
                if (i > 25 - j) {
                    int count = j;
                    int idx = 0;
                    while (count != -1) {
                        alpha[j][25 - count] = (char) (64 + idx);
                        count--;
                        idx++;
                    }
                    System.out.print(alpha[j][i] + " ");
                } else {
                    alpha[j][i] = (char) (65 + j + i);
                    System.out.print(alpha[j][i] + " ");
                }
            }
            System.out.println();
        }
        ;
        return alpha;
    }
}