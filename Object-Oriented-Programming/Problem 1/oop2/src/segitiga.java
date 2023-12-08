public class segitiga {
    double alas;
    double tinggi;
    double sisi;

    public segitiga(double alas, double tinggi, double sisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }

    public double luasSegitiga(){
        double luas = (this.alas * this.tinggi) / 2;
        return luas;
    }

    public double kelilingSegitiga(){
        double keliling = (this.sisi * this.sisi * this.sisi);
        return keliling;
    }
}
