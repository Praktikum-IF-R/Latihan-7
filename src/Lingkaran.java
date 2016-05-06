/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Lingkaran extends Bangunan {
    private double Luas;
    private double jari;
    private double keliling;
    public double getJari() {
        return jari;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }
    
    public void setLuas(){
        this.Luas=Math.PI*jari*jari;
    }    
    public double getLuas() {
        return Luas;
    }
    public void setKeliling() {
        this.keliling=Math.PI*jari*2;
    }
    public double getKeliling() {
     return keliling;
    }
}
