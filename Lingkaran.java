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
public class Lingkaran extends Bidang {

    private double r;
    public Lingkaran(String a, double b) {
        super(a);
        setJari2(b);
    }
    public void setJari2(double b){
        r = b;
    }
    public double getJari2(){
        return r;
    }

    public double Luas() {
        return Math.PI*getJari2()*getJari2(); 
    }

    public double Kell() {
        return Math.PI*getJari2()*2; 
    }

    public double Volume() {
        return 0; 
    }
    public void Display(){
        System.out.println("Luas\t\t: "+Luas()+" cm2");
        System.out.println("Keliling\t: "+Kell()+" cm");
    }
}
