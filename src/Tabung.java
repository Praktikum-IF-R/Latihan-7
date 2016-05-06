/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Tabung extends Lingkaran{
    private int tinggi;
    private double volum;
    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public double getVolum() {
        return volum;
    }

    public void setVolum() {
        this.volum = super.getLuas()*tinggi;
    }
    
}
