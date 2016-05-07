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
public class Lingkaran extends Bangunan {

    public Lingkaran(double j) {
        Jari2 = j;
    }

    public double Luas() {
        return Math.PI * Jari2 * Jari2;
    }

    public double Keliling() {
        return 2 * Math.PI * Jari2;
    }

    public double Volume() {
        return 0;
    }
}
