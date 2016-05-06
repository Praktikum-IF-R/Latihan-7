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
public class Kubus extends Persegi{

    public Kubus(String a, int b) {
        super(a, b);
    }
    public double Luas(){
        return super.Luas()*6;
    }
    public double Volume(){
        return super.Luas()*super.getSisi();
    }
    public double Kell(){
        return 0;
    }
    public void Display(){
        System.out.println("Luas\t\t: "+Luas()+" cm2");
        System.out.println("Volume\t\t: "+Volume()+" cm3");
    }
}
