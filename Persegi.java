package Polimorfisme;
public class Persegi extends  Dimensi2{
    public void setLuas(double a){
        sisi = a;
        luas = sisi*sisi;
    }
    public double getLuas(){
        return luas;
    }
    public void setKeliling(double a){
        sisi = a;
        kel = sisi * 4;
    }
    public double getKeliling(){
        return kel;
    }
}
