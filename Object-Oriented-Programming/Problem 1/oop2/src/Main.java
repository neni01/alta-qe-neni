// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        persegi persegi1 = new persegi(10);
        System.out.println("Luas persegi = " + persegi1.luasPersegi());
        System.out.println("Keliling persegi = " + persegi1.kelilingPersegi());

        persegiPanjang panjang1 = new persegiPanjang(10, 5);
        System.out.println("Luas persegi panjang = " + panjang1.luasPersegiPanjang());
        System.out.println("Keliling persegi panjang= " + panjang1.kelilingPersegiPanjang());

        segitiga segitiga1 = new segitiga(10, 25, 10);
        System.out.println("Luas segitiga adalah " + segitiga1.luasSegitiga());
        System.out.println("Keliling segitiga sama sisi adalah " + segitiga1.kelilingSegitiga());
    }
}