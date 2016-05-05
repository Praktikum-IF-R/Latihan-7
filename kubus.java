/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB7.latihan;

/**
 *
 * @author nugroho
 */
public class kubus extends tigaDimensi {

    kubus(double a) {
        super(a, a, a);
    }

    double getPanjang() {
        return super.getA();
    }

    double getLebar() {
        return super.getB();
    }

    double getTinggi() {
        return super.getC();
    }

    @Override
    double getVolume() {
        return getPanjang() * getLebar() * getTinggi();
    }

    @Override
    double getLuasPermukaan() {
        return getPanjang() * getLebar() * 6;
    }

    @Override
    double getPerhitungan1() {
        return getVolume();
    }

    @Override
    double getPerhitungan2() {
        return getLuasPermukaan();
    }
}
