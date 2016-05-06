/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

public class LimasSegitiga extends Segitiga{
public double tinggi1;
    public LimasSegitiga(String w, int n, double a, double t, double t1) {
        super(w, n, a, t);
        setTinggiLimas(t1);
    } 
    public void setTinggiLimas(double t1){
        tinggi1=t1;
    }
    public double getTinggiLimas(){
        return tinggi1;
    }
    public double getVolume(){
        return super.getLuas()*getTinggiLimas()/3;
    }
    public void displayMessage(){
        System.out.println("Bangun Ruang Limas Segitiga");
        System.out.println("Bangun ruang no"+super.getNoBangunRuang()+" Memiliki warna "+super.getWarna());
        System.out.println("Memiliki Luas Alas :"+super.getLuas());
        System.out.println("Memiliki Tinggi limas :"+getTinggiLimas());
        System.out.println("Memiliki Volume :"+getVolume());
    }
}
