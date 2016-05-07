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
public class Bola extends Lingkaran {

    public Bola(double j) {
        super(j);
    }

    public double Volume() {
        return 1.33 * Math.PI * Math.pow(Jari2, 3);
    }
}
