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
public class persegi extends duaDimensi {

    persegi(double a, double b) {
        super(a, b);

    }

    @Override
    double getLuas() {
        return getA() * getB();
    }

    double getPanjang() {
        return super.getA();
    }

    double getLebar() {
        return super.getB();
    }

    @Override

    double getKeliling() {
        return (getPanjang() + getLebar()) * 2;
    }

    @Override
    double getPerhitungan2() {
        return getKeliling();
    }

    @Override
    double getPerhitungan1() {
        return getLuas();
    }

}
