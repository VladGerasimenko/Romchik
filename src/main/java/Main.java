
public class Main {
    public static void main(String[] args) {
        char[][] table = TableCreator.getTable();
        Encoder encoder = new Encoder("MARAFONEC","ROMCHIK");
        String encoeded = encoder.encode();
        Decoder decoder = new Decoder(encoeded, encoder.normalizeKey());
        System.out.println(encoeded);
        System.out.println(decoder.decode());
    }
}
