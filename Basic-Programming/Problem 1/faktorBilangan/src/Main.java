public class Main {
    public static void main(String[] args) {
        int angka = 6;

        System.out.println("Faktor bilangan " + angka + " adalah: ");

        for(int i = 1; i <= angka; ++i){
            if (angka % i ==0){
                System.out.println(i + " ");
            }
        }

        System.out.println();
        int bilangan = 20;
        System.out.println("Fakor bilangan " + bilangan + " adalah: ");

        for(int j = 1; j <= bilangan; ++j){
            if (bilangan % j == 0){
                System.out.println(j + " ");
            }
        }

    }
}