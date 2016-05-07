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
public class tabung extends Bangun2 {
    private int jari, tinggi;
    
    public tabung (int jari, int tinggi){
        this.jari = jari;
        this.tinggi = tinggi;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public double getLuas() {
        luas = 2*3.14*jari*(jari+tinggi);
        return luas;
    }

    public double getVolume() {
        volume = 3.14*jari*jari*tinggi;
        return volume;
    }
    public void Display(){
        System.out.println("Luas permukaan : "+getLuas());
        System.out.println("Volume Bangun  : "+getVolume());
        System.out.println("");
    }
    
    
}
