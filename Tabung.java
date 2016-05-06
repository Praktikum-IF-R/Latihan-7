package Polimorfisme;
public class Tabung extends Dimensi3 {
public void setLuas(double a,double t){
        jari = a;
        tinggi = t;
        luas = (2*(3.14*jari*jari))+(tinggi*(2*3.14*jari));
    }
    public double getLuas(){
        return luas;
    }
    public void setVolume(double a,double t){
        jari = a;
        tinggi = t;
        vol = 3.14*jari*jari*tinggi;
    }
    public double getVolume(){
        return vol;
    }    
}
