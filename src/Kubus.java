/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Kubus extends Persegi{
    private double volum;

    public double getVolum() {
        return volum;
    }

    public void setVolum() {
        this.volum = super.getLuas()*super.getSisi1();
    }
    
    
}
