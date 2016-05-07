/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author Lenovo
 */
public class PersegiPanjang extends Bangunan {

    public PersegiPanjang(double p, double l) {
        Panjang = p;
        Lebar = l;
    }

    public double Luas() {
        return Panjang * Lebar;
    }

    public double Keliling() {
        return 2 * (Panjang + Lebar);
    }

    public double Volume() {
        return 0;
    }
}
