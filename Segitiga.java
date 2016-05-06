package bangunangeometri;
public class Segitiga extends Bidang2 {
    private double alas,tinggi,sisi,Luas,Keliling;
    
    public Segitiga(){
       
    }
    public Segitiga(double alas,double tinggi,double sisi){
        this.alas=alas;
        this.tinggi=tinggi;
        this.sisi=sisi;
    }
    public double getalas(){
        return alas;
    }
    public void setalas(double alas){
        alas=alas;
    }
    public double gettinggi(){
        return tinggi;
    } 
    public void settinggi(double tinggi){
        tinggi=tinggi;
    }
     public double getsisi(){
        return sisi;
    }
    public void setsisi(double sisi){
        sisi=sisi;
    }
 @Override
    public double Luas() {
        Luas=0.5*alas*tinggi;
        System.out.println("Luas Segitiga       :"+Luas);
        return Luas;
    }

    @Override
    public double Keliling() {
        Keliling=sisi*sisi*sisi;
        System.out.println("Keliling Segitiga   :"+Keliling);
        return Keliling;
    }
    }
