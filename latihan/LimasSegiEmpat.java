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
public class LimasSegiEmpat extends PersegiPanjang {

    public LimasSegiEmpat(double p, double l, double t) {
        super(p, l);
        Tinggi = t;
    }

    public double Volume() {
        return 0.25 * Panjang * Lebar * Tinggi;
    }
}
