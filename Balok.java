/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolimorfismeBAB7;

/**
 *
 * @author DS
 */
public class Balok extends TigaDimensi {

    public void setLuas(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        luas = 2 * ((panjang * lebar) + (panjang * tinggi) + (tinggi * lebar));
    }

    @Override
    public double getLuas() {
        return luas;
    }

    public void setVolume(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        volume = panjang * lebar * tinggi;
    }

    @Override
    public double getVolume() {
        return volume;
    }
}
