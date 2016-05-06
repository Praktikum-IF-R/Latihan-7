package Polimorfisme;
public class Kubus extends Dimensi3 {
    public void setLuas(double a){
        sisi = a;
        luas = 6*sisi*sisi;
    }
    public double getLuas(){
        return luas;
    }
    public void setVolume(double a){
        sisi = a;
        vol = sisi*sisi*sisi;
    }
    public double getVolume(){
        return vol;
    }
}
