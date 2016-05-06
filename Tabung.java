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
public class Tabung extends Lingkaran {

    private int tinggi;
    public Tabung(String a, double b, int c) {
        super(a, b);
        setTinggi(c);
    }
    public void setTinggi(int c){
        tinggi = c;
    }
    public int getTinggi(){
        return tinggi;
    }
    public double Luas(){
        return (super.Luas()*2) +(super.Kell()*getTinggi());
    }
    public double Volume(){
        return super.Luas()*2*getTinggi();
    }
    public double Kell(){
        return 0;
    }
    public void Display(){
        System.out.println("Luas\t\t: "+Luas()+" cm2");
        System.out.println("Volume\t\t: "+Volume()+" cm3");
    }
}
