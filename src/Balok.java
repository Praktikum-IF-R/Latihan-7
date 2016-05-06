/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Balok extends Persegi{
    private double volum;
    private double tinggi;

    public double getVolum() {
        return volum;
    }
    public void setVolum() {
        this.volum=super.getLuas()*tinggi;
    }
    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
