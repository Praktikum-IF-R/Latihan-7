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
public class Bola extends TigaDimensi {

    public void setLuas(double jari) {
        this.jari = jari;
        luas = 4 * Math.PI * jari * jari;
    }

    @Override
    public double getLuas() {
        return luas;
    }

    public void setVolume(double jari) {
        this.jari = jari;
        volume = (4 * Math.PI * jari * jari * jari) / 3;
    }

    @Override
    public double getVolume() {
        return volume;
    }
}
