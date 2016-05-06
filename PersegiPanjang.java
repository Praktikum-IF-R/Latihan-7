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
public class PersegiPanjang extends BangunRuang {
protected double panjang;
protected double lebar;
    public PersegiPanjang(String w, int n, double p, double l) {
        super(w, n);
        setPanjang(p);
        setLebar(l);
    }
    public void setPanjang(double p){
    panjang=p;
}
    public double getPanjang(){
        return panjang;
    }
    public void setLebar(double l){
     lebar=l;   
    }
    public double getLebar(){
        return lebar;
    }
    public double getLuas(){
        return panjang*lebar;
    }
    public double getKeliling(){
        return (2*panjang)+(2*lebar);
    }
    public double getVolume(){
        return 0;
    }
    public void displayMessage(){
        System.out.println("Bangun Ruang Persegi Panjang");
        System.out.println("Bangun ruang no"+super.getNoBangunRuang()+" Memiliki warna "+super.getWarna());
        System.out.println("Memiliki Lebar :"+getLebar());
        System.out.println("Memiliki Luas :"+getLuas());
        System.out.println("Memiliki Panjang :"+getPanjang());
        System.out.println("Memiliki Keliling :"+getKeliling());
    }
}
