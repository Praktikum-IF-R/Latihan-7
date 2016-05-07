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
public class Kerucut extends Lingkaran {

    public Kerucut(double j, double t) {
        super(j);
        Tinggi = t;
    }

    public double Volume() {
        return 0.33 * Math.PI * Jari2 * Jari2 * Tinggi;
    }
}
