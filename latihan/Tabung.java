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
public class Tabung extends Lingkaran {

    public Tabung(double j, double t) {
        super(j);
        Tinggi = t;
    }

    public double Volume() {
        return Math.PI * Jari2 * Jari2 * Tinggi;
    }
}
