public class persegiPanjang {
    int panjang;
    int lebar;

    public persegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int luasPersegiPanjang(){
        int luas = (this.panjang * this.lebar);
        return luas;
    }

    public int kelilingPersegiPanjang() {
        int keliling = ((2*panjang) + (2*lebar));
        return keliling;
    }
}
