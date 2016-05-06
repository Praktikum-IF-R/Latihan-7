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
public class Persegi extends Bidang {

    private int sisi;
    public Persegi(String a, int b) {
        super(a);
        setSisi(b);
    }
    public void setSisi(int b){
        sisi = b;
    }
    public int getSisi(){
        return sisi;
    }
    
    public double Luas() {
        return getSisi()*getSisi(); 
    }

    public double Kell() {
        return getSisi()*4; 
    }

    public double Volume() {
        return 0; 
    }
    public void Display(){
        System.out.println("Luas\t\t: "+Luas()+" cm2");
        System.out.println("Keliling\t: "+Kell()+" cm");
    }
    
}
