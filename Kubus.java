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
public class Kubus extends Persegi{

    public Kubus(String w, int n, double s) {
        super(w, n, s);
        setSisi(sisi);
    }
    public double getVolume(){
        return super.getLuas()*sisi;
    }
    public void displayMessage(){
        System.out.println("Bangun Ruang Kubus");
        System.out.println("Bangun ruang no"+super.getNoBangunRuang()+" Memiliki warna "+super.getWarna());
        System.out.println("Memiliki sisi :"+getSisi());
        System.out.println("Memiliki Volume :"+getVolume());
    }
    
}
