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
public class Persegi extends Bangunan {

    public Persegi(double s) {
        Sisi = s;
    }

    public double Luas() {
        return Sisi * Sisi;
    }

    public double Keliling() {
        return Sisi * 4;
    }

    public double Volume() {
        return 0;
    }
}
