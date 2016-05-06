/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Segitiga extends Bangunan{
    private double Luas;
    private double keliling;
    private int alas;
    private int tinggi;
    public void setLuas() {
        this.Luas=alas*tinggi/2;
    }
    public double getLuas() {
        return Luas;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    public void setKeliling() {
        double m=Math.sqrt((alas*alas)+(tinggi*tinggi));
        this.keliling=alas+tinggi+m;
    }
    public double getKeliling() {
        return keliling;
    }
    
}
