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
public class Persegi extends DuaDimensi {

    public void setKeliling(double sisi) {
        this.sisi = sisi;
        keliling = sisi * 4;
    }

    @Override
    public double getKeliling() {
        return keliling;
    }

    public void setLuas(double sisi) {
        this.sisi = sisi;
        luas = sisi * sisi;
    }

    @Override
    public double getLuas() {
        return luas;
    }

}
