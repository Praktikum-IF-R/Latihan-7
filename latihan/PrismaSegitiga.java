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
public class PrismaSegitiga extends Segitiga {

    public PrismaSegitiga(double a, double t, double tb) {
        super(a, t);
        TinggiBidang = tb;
    }

    public double Volume() {
        return 0.5 * Alas * Tinggi * TinggiBidang;
    }
}
