import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan nilai alas");
        float alas = input.nextFloat();
        System.out.println("masukkan nilai Tinggi");
        float Tinggi = input.nextFloat();
        System.out.println();

        float Luas = (alas * Tinggi) / 2;
        System.out.println("Luas Segitiga = " + Luas);

    }
}