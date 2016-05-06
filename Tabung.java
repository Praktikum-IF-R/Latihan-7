package bangunan;
public class Tabung extends Lingkaran{
    private double jejari,tinggi;
    public Tabung(){
        jejari = 0;
        tinggi = 0;
    }
    public Tabung(double r, double t){
        jejari = r;
        tinggi = t;
    }
    public double Volume(){
        return Math.PI*Math.pow(jejari,2)*tinggi;
    }
    public void Display(){
        System.out.println("Volume Tabung : "+Volume());
    }
}