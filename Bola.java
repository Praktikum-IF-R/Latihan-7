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
public class Bola extends bidang3 {
    private double jari;
    private String warna;

    @Override
    public double Volume() {
        return (4*3.14*jari*jari*jari)/3;
    }
    
    public Bola(double j){
        jari = j;
    }
    
    public Bola(){
        
    }
    
    public void setjari(double ja){
        jari = ja;
    }
    
    public double getjari(){
        return jari;
    }
    
}
