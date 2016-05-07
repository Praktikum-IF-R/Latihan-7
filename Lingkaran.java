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
public class Lingkaran extends DuaDimensi {

    public void setLuas(double jari) {
        this.jari = jari;
        luas = Math.PI * jari * jari;
    }

    @Override
    public double getLuas() {
        return luas;
    }

    public void setKeliling(double jari) {
        this.jari = jari;
        keliling = 2 * Math.PI * jari;
    }

    @Override
    public double getKeliling() {
        return keliling;
    }
}
