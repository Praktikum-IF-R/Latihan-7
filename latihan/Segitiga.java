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
public class Segitiga extends Bangunan {

    public Segitiga(double a, double t) {
        Alas = a;
        Tinggi = t;
    }

    public double Luas() {
        return 0.5 * Alas * Tinggi;
    }

    public double Keliling() {
        return Alas + Tinggi + Math.sqrt((Alas * Alas) + (Tinggi * Tinggi));
    }

    public double Volume() {
        return 0;
    }
}
