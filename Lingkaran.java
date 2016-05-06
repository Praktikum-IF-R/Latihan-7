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
public class Lingkaran extends Dimensi_2 {

    Lingkaran(int b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public void setLuasLing(double x) {
        double r = x;
        luasbangun = (3.14 * r * r);

    }

    public double getLuasLing() {
        return luasbangun;
    }

    public void setKelLing(double x) {
        r = x;
        keliling = 2 * 3.14 * r;
    }

    public double getKelLing() {
        return keliling;
    }
public void tampil(){
     System.out.println("Luas Bidang : "+getLuasLing());
        System.out.println("Keliling : "+getKelLing());
        System.out.println("========================");

}}
