package Polimorfisme;
public class Lingkaran extends Dimensi2 {
    public void setLuas(double a){
        jari = a;
        luas = 3.14*jari*jari;
    }
    public double getLuas(){
        return luas;
    }
    public void setKeliling(double a){
        jari = a;
        kel = 2*3.14*jari;
    }
    public double getKeliling(){
        return kel;
    }
}
