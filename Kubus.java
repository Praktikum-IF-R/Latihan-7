package Tugas7;

/**
 *
 * @author wahyuridiansyah
 */
public class Kubus extends Bangun {

    public double sisi;

    Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return 6 * sisi * sisi;
    }
}
