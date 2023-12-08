// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    kubus volume1 = new kubus(15);
    System.out.println("Volme kubus adalah: " + volume1.volumeKubus());

    balok volume2 = new balok(15,10, 5);
    System.out.println("Volume balok adalah: " + volume2.volumeBalok());

    tabung volume3 = new tabung(3.14, 10, 5);
    System.out.println("Volume tabung adalah: " + volume3.volumeTabung());
    }
}