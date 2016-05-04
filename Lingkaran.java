package Latihan7;

public class Lingkaran extends Bangunan {

    private double Luas;
    private double Keliling;
    private double jarijari;

    public Lingkaran(double r) {
        super(0, 0, 0);
        jarijari = r;
    }

    public void setJarijari(double r) {
        jarijari = r;
    }

    public double getJarijari() {
        return jarijari;

    }
    public double getVolume() {
        return 0;
    }

    public double getLuas() {
        Luas += 3.14 * (getJarijari() * getJarijari());
        return Luas;
    }

    public double getKeliling() {
        Keliling += 3.14 * (getJarijari() * 2);
        return Keliling;
    }

}
