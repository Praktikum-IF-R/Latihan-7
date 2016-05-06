/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan7;

/**
 *
 * @author Lenovo
 */
public class kubus extends persegi {

    public kubus(double a) {
        super(a);
    }
    public double volume(){
        return getluas()*getsisi();
    }
    public void tampil(){
        System.out.println("volume: "+this.volume());
    }
}
