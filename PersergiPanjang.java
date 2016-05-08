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
public class PersergiPanjang extends dua_dim {

    public double panj, leb, Luas, Keliling;

    public PersergiPanjang(double p, double l) {
        panj = p;
        leb = l;
    }

    public double getLuas() {
        Luas = panj * leb;
        return Luas;
    }

    public double getKeliling() {
        Keliling = 2 * (panj + leb);
        return Keliling;
    }

    void hasil() {
        System.out.println("Luas = " + getLuas());
        System.out.println("Keliling = " + getKeliling());
    }
}
