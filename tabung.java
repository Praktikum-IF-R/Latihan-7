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
public class tabung extends tigaDimensi {

    tabung(double a, double b) {
        super(a, b, 3.14);
    }

    double getTinggi() {
        return super.getA();
    }

    double getJari() {
        return super.getB();
    }

    double getPi() {
        return super.getC();
    }

    @Override
    double getVolume() {
        return getJari() * getJari() * getPi() * getTinggi();
    }

    @Override
    double getLuasPermukaan() {
        return getJari() * 2 * getPi() * getTinggi();
    }

    @Override
    double getPerhitungan1() {
        return getVolume();
    }

    double getPerhitungan2() {
        return getLuasPermukaan();
    }
}
