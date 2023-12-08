public class kubus {
    int sisi;

    public kubus(int sisi) {
        this.sisi = sisi;
    }

    public int volumeKubus(){
        int volume = (this.sisi * this.sisi * this.sisi);
        return volume;
    }
}
