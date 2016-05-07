/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB7;

/**
 *
 * @author Deltaviyahya
 */
public class Kubus extends Bangun2{
    private int sisi;
    public Kubus (int sisi){
        this.sisi = sisi;
    }
    public void setsisi(int sisi){
        this.sisi = sisi;
    }
    public double getLuas(){
        luas = 6*(sisi*sisi);
        return luas;
    }
    public double getVolume(){
        volume = sisi*sisi*sisi;
        return volume;
    }
    public void Display(){
        System.out.println("Luas permukaan : "+getLuas());
        System.out.println("Volume Bangun  : "+getVolume());
        System.out.println("");
    }
    
    
    
}
