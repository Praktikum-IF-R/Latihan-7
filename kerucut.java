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
public class kerucut extends tabung {
    public kerucut(double a,double b) {
        super(a,b);
    }
    public double volume() {
        return super.volume()/3;
    }

    @Override
    public void tampil() {
        System.out.println(getluas());
        System.out.println("volume: "+this.volume());
    }
    
    
}
