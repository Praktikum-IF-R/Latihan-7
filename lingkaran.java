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
public class lingkaran extends duaDimensi {

    private double jari;

    lingkaran(double jari) {
        super(jari, 3.14);
    }

    @Override
    double getLuas() {
        return getJari() * getJari() * getPi();
    }

    @Override
    double getKeliling() {
        return getJari() * 2 * getPi();
    }

    double getJari() {
        return super.getA();
    }

    double getPi() {
        return super.getB();
    }

    @Override
    double getPerhitungan1() {
        return getLuas();
    }

    @Override
    double getPerhitungan2() {
        return getKeliling();
    }
}
