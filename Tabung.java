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
public class Tabung extends Dimensi_3 {
    public void setLuasTab(double x,double y){
        sisi = x;
        tinggi = y;
        luasbangun = (2 * (3.14 * r * r) + (tinggi * (2 * 3.14 * r)));
    }

    public double getLuasTab() {
        return luasbangun;
    }

    public void setVolTab(double x, double y) {
        double jari = x;
        tinggi = y;
        volume = (3.14 * jari * jari) * tinggi;

    }

    public double getVolTab() {
        return volume;
    }
public void tampil(){
     System.out.println("Luas Permukaan : "+getLuasTab());
        System.out.println("Volume      : "+getVolTab());
        System.out.println("--------------------------");
}}
