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
public abstract class duaDimensi extends geometri {

    duaDimensi(double a, double b) {
        super(a, b, 0);
    }

    @Override
    double getA() {
        return super.getA();
    }

    @Override
    double getB() {
        return super.getB();
    }

    abstract double getLuas();

    abstract double getKeliling();
}
