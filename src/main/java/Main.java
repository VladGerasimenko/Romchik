import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[][] table = TableCreator.getTable();
        Encoder encoder = new Encoder("MARAFONEC","ROMAN");
        String encoeded = encoder.encode();
        System.out.println(encoeded);
    }
}
