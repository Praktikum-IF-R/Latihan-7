/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometri;

/**
 *
 * @author Fauzi Reza Pahlevi
 */
public class Round extends Shape{
    private double tinggi;
    private double jari2;
    
    public Round(double rr){
        jari2=rr;
    }
    public double getJari2(){
        return jari2;
    }
    public double getLuas(){
        return Math.PI*Math.pow(getJari2(),2);
    }
    public double getKeliling(){
        return Math.PI*2*getJari2();
    }
    public void setTinggi(double t){
        tinggi=t;
    }
    public double getTinggi(){
        return tinggi;
    }
    public void tampil(){
        System.out.println("Luas lingkaran adalah "+getLuas());
        System.out.println("Keliling lingkaran adalah "+ getKeliling());
    }
}
