package Tugas7;

/**
 *
 * @author wahyuridiansyah
 */
public class PersegiPanjang extends Bangun {

    double panjang;
    double lebar;

    PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double luas() {
        return panjang * lebar;
    }
}
