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
public class Rectangle extends Shape{
private double rusuk;
private double sisi;
public Rectangle(double s){
    sisi=s;
}
public void setSisi(double s){
    sisi=s;
}
public double getSisi(){
    return sisi;
}
public double getLuas(){
    return Math.pow(getSisi(),2);
}
public double getKeliling(){
    return 4*getSisi();
}
public void tampil (){
    System.out.println("Luas persegi adalah "+getLuas());
    System.out.println("Keliling persegi adalah "+getKeliling());
}
}
