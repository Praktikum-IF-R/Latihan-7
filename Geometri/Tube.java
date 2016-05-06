/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometri;

/**
 *
 * @author Fauzi Reza Pahlevi
 */
public class Tube extends Round{
private double tinggi;
    public Tube(double rr, double t) {
        super(rr);
        tinggi=t;
    }
    
    public double getVolume(){
        return getLuas()*getTinggi();
    }
    public void display(){
        System.out.println("Volume tabung adalah "+getVolume());
    }
}
