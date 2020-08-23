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
        char[][] alpha = new char[96][96];
        for (int j = 0; j < 96; j++) {
            for (int i = 0; i < 96; i++) {
                if (i > 95 - j) {
                    int count = j;
                    int idx = 0;
                    while (count != -1) {
                        alpha[j][95 - count] = (char) (31 + idx);
                        count--;
                        idx++;
                    }
                    System.out.print(alpha[j][i] + " ");
                } else {
                    alpha[j][i] = (char) (32 + j + i);
                    System.out.print(alpha[j][i] + " ");
                }
            }
            System.out.println();
        }
        ;
        return alpha;
    }
}