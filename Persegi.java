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
public class Persegi extends Dimensi_2 {

    Persegi(int a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public void setLuasPer(double x) {
        double sisi = x;
        luasbangun = x * x;
}
public double getLuasPer(){
    return luasbangun;
}
public void setKelPer(double x){
    double sisi = x;
    keliling = 4*(sisi);
}
public double getKelPer(){
    return keliling;
}
public void tampil(){
     System.out.println("Luas Bidang : "+getLuasPer());
        System.out.println("Keliling : "+getKeliling());
        System.out.println("========================");
}
}

