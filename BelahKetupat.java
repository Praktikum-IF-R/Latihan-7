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
public class BelahKetupat extends dua_dim {

    public double sisi1, diago1, diago2;
    public double Keliling, Luas;

    public BelahKetupat(double ab, double diag1, double diag2) {
        sisi1 = ab;
        diago1 = diag1;
        diago2 = diag2;
    }

    public double getKeliling() {
        Keliling = 4 * sisi1;
        return Keliling;
    }

    public double getLuas() {
        Luas = 0.5 * (diago1 * diago2);
        return Luas;
    }

    void hasil() {
        System.out.println("Luas = " + getLuas());
        System.out.println("Keliling = " + getKeliling());
    }

}
