package Tugas7;

/**
 *
 * @author wahyuridiansyah
 */
public class Persegi extends Bangun {

    public double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }
}
