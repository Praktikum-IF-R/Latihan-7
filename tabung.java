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
public class tabung extends Lingkaran {
    private double tinggi;
    public tabung(double a,double b) {
        super(a);
        tinggi=b;
    }
    public double volume(){
        return getluas()*tinggi;
    }
    public void tampil(){
        System.out.println("volume: "+this.volume());
    }
    
}
