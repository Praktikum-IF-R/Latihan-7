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
public class Tabung extends tiga_dim {

    public double jari, tinggi, Luas, Volume, alas, selimut;

    public Tabung(double j, double t) {
        jari = j;
        tinggi = t;
    }

    public double getAlas() {
        alas = 3.14 * (jari * jari);
        return alas;
    }

    public double getSelimut() {
        selimut = 2 * 3.14 * jari * tinggi;
        return selimut;
    }

    public double getLuas() {
        Luas = 2 * (getAlas() + getSelimut());
        return Luas;
    }

    public double getVolume() {
        Volume = 3.14 * jari * jari * tinggi;
        return Volume;
    }

    void hasil() {
        System.out.println("Luas = " + getLuas());
        System.out.println("Volume = " + getVolume());
    }
}
