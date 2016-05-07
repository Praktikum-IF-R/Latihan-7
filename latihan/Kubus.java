/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author Lenovo
 */
public class Kubus extends Persegi {

    public Kubus(double s) {
        super(s);
    }

    public double Volume() {
        return Sisi * Sisi * Sisi;
    }
}
