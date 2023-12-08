import static java.lang.Math.pow;

public class tabung {
    double phi;
    double r;
    double t;

    public tabung(double phi, double r, double t) {
        this.phi = phi;
        this.r = r;
        this.t = t;
    }

    public double volumeTabung(){
        double volume = (this.phi * Math.pow(this.r,2) * this.t);
        return volume;
    }
}
