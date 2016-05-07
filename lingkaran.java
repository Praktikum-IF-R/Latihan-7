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
public class lingkaran extends Bangun1 {
    private int jari;
    
    public lingkaran(int jari){
        this.jari = jari;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }

    public double getLuas() {
        luas = 3.14*jari*jari;
        return luas;
    }

    public double getKeliling() {
        keliling = 2*3.14*jari;
        return keliling;
    }
    public void Display(){
        System.out.println("Luas permukaan : "+getLuas());
        System.out.println("Keliling Bangun: "+getKeliling());
        System.out.println("");
    }
    
    
    
    
}
