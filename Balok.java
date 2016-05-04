package Tugas7;

/**
 *
 * @author wahyuridiansyah
 */
public class Balok extends Bangun {

    double panjang;
    double lebar;
    double tinggi;

    Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        return (2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi)));
    }
}
