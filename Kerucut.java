/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author yudi hermawan
 */
public class Kerucut extends Lingkaran {
    public double tinggi1;
    public Kerucut(String w, int n, double r, double t1) {
        super(w, n, r);
        setTinggiKerucut(t1);
    }    
    public void setTinggiKerucut(double t1){
        tinggi1=t1;
    }
    public double getTinggiKerucut(){
        return tinggi1;
    }
    public double getVolume(){
        return super.getLuas()*getTinggiKerucut()/3;
    }
    public void displayMessage(){
        System.out.println("Bangun Ruang Kerucut ");
        System.out.println("Bangun ruang no"+super.getNoBangunRuang()+" Memiliki warna "+super.getWarna());
        System.out.println("Memiliki Luas Alas :"+super.getLuas());
        System.out.println("Memiliki Tinggi Kerucut :"+getTinggiKerucut());
        System.out.println("Memiliki Volume :"+getVolume());
    }
    
}
