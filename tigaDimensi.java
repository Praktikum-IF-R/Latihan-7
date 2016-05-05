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
public abstract class tigaDimensi extends geometri {

    tigaDimensi(double a, double b, double c) {
        super(a, b, c);
    }

    double getA() {
        return super.getA();
    }

    double getB() {
        return super.getB();
    }

    double getC() {
        return super.getC();
    }

    abstract double getVolume();

    abstract double getLuasPermukaan();

}
