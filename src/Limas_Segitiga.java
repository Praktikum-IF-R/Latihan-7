/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Limas_Segitiga extends Segitiga {
    private double volum;
    private int tinggiL;

    public double getVolum() {
        return volum;
    }

    public void setVolum() {
        this.volum = super.getLuas()*tinggiL/3;
    }

    public int getTinggiL() {
        return tinggiL;
    }

    public void setTinggiL(int tinggiL) {
        this.tinggiL = tinggiL;
    }
    
}
