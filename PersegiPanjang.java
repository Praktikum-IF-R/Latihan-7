package Latihan7;

public class PersegiPanjang extends Bangunan {

    private double Luas;
    private double Keliling;

    public PersegiPanjang(double p, double l) {
        super(p, l, 0);
    }

    public double getLuas() {
        Luas = super.getPanjang() * super.getLebar();
        return Luas;
    }

    public double getKeliling() {
        Keliling = getPanjang() + getLebar();
        return Keliling;
    }

    public double getVolume() {
        return 0;
    }
}
