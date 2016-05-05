/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latpolimorphism;

/**
 *
 * @author ANITA
 */
public class Lingkaran extends bidang2{
    private double jari;
    //private String warna;

    @Override
    public double Luas() {
        return 3.14*jari*jari;
    }

    @Override
    public double Keliling() {
        return 3.14*2*jari;
    }
    
    public Lingkaran(double j){
        jari = j;
    }
    
    public Lingkaran(){
        
    }
    
    public void setjari(double ja){
        jari = ja;
    }
    
    public double getjari(){
        return jari;
    }
    
    
    
}
