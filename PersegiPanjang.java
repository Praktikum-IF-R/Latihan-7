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
public class PersegiPanjang extends DuaDimensi {

    public void setKeliling(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        keliling = 2 * (panjang + lebar);
    }

    @Override
    public double getKeliling() {
        return keliling;
    }

    public void setLuas(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        luas = panjang * lebar;

    }

    @Override
    public double getLuas() {
        return luas;
    }

}
