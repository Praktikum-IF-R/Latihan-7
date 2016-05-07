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
public class persegipanjang extends Bangun1{
    private int panjang, lebar;
    
    public persegipanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public double getLuas() {
        luas = panjang*lebar;
        return luas;
    }

    public double getKeliling() {
        keliling = 2*panjang+lebar;
        return keliling;
    }
    public void Display(){
        System.out.println("Luas permukaan : "+getLuas());
        System.out.println("Keliling Bangun: "+getKeliling());
        System.out.println("");
    }
    
    
}
