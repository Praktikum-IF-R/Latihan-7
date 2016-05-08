/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poly;

/**
 *
 * @author imgeek
 */
public class Bola extends tiga_dim {

    public double jari, Luas, Volume;

    public Bola(double r) {
        jari = r;

    }

    public double getLuas() {
        Luas = 4 * 3.13 * (jari * jari);
        return Luas;
    }

    public double getVolume() {
        Volume = 4 / 3 * 3.14 * (jari * jari * jari);
        return Volume;
    }

    void hasil() {
        System.out.println("Luas = " + getLuas());
        System.out.println("Volume = " + getVolume());
    }

}
