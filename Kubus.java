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
public class Kubus extends TigaDimensi {

    public void setLuas(double sisi) {
        this.sisi = sisi;
        luas = 6 * (sisi * sisi);
    }

    @Override
    public double getLuas() {
        return luas;
    }

    public void setVolume(double sisi) {
        this.sisi = sisi;
        volume = sisi * sisi * sisi;
    }

    @Override
    public double getVolume() {
        return volume;
    }
}
