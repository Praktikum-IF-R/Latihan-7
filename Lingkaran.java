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
public class Lingkaran extends bangunan {
    private double r,luas,keliling;
    public Lingkaran(double a){
        r=a;
    }
    public double getkeliling() {
        return Math.PI*2*r;
    }
    public double getluas() {
        return Math.PI*Math.pow(r, 2);
    }
    public void tampil() {
        System.out.println("luas    : "+getluas());
        System.out.println("keliling: "+getkeliling());
    }
}
