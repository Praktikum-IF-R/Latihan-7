/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Bola extends Lingkaran{
    private double volum;
    public void setVolum() {
        this.volum=super.getLuas()*super.getJari()*4/3;
    }
    public double getVolum() {
        return volum;
    }
    
}
