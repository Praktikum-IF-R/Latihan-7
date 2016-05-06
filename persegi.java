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
public class persegi extends bangunan {
    private double s,luas,keliling;
    public persegi(double a){
        s=a;
    }
    public double getsisi(){
        return s;
    }
    public double getkeliling() {
        return s*4;
    }
    public double getluas() {
        return s*s;
    }
    public void tampil() {
        System.out.println("luas    : "+getluas());
        System.out.println("keliling: "+getkeliling());
    }
    
}
