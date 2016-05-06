/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_enam;

/**
 *
 * @author Rexy
 */
public class Kubus extends Dimensi_3 {

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    
    public void setLuasPermuka(double x){
        sisi = x;
        luasbangun = 6*(x*x);
    }

    public double getLuasKub() {
        return luasbangun;
    }

    public void setVolKub(double x, double y) {
        double sisi = x;
        volume = sisi*sisi*sisi;
    }

    public double getVolTab() {
        return volume;
    }
public void tampil(){
     System.out.println("Luas Permukaan : "+getLuasKub());
        System.out.println("Volume      : "+getVolTab());
        System.out.println("--------------------------");
}}

