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
public class Cube extends Rectangle{

    public Cube(double s) {
        super(s);
    }

    
    public double getVolume(){
        return Math.pow(getSisi(),3);
    }
    public void display(){
        System.out.println("Volume kubus adalah "+getVolume());
    }
}
