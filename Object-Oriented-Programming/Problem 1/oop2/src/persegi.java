public class persegi {
    int sisi;

    public persegi(int sisi) {
        this.sisi = sisi;
    }

    public int luasPersegi(){
        int luas = (this.sisi * this.sisi);
        return luas;
    }

    public int kelilingPersegi() {
        int keliling = (this.sisi * 4);
        return keliling;
    }
}

