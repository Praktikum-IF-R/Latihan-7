package bangunangeometri;
public class Balok extends Bidang3 {
    private double panjang,lebar,tinggi,Volume;
    
    public Balok(){
        
    }
    public Balok(double panjang,double lebar,double tinggi){
        this.panjang=panjang;
        this.lebar=lebar;
        this.tinggi=tinggi;
    }
    public double getpanjang(){
        return panjang;    
    }
    public void setpanjang(double panjang){
        panjang=panjang;
    }
    public double getlebar(){
        return lebar;    
    }
    public void setlebar(double lebar){
        lebar=lebar;
    }
    public double gettinggi(){
        return panjang;    
    }
    public void settinggi(double tinggi){
        tinggi=tinggi;
    }
    @Override
    public double Volume() {
        Volume=panjang*lebar*tinggi;
        System.out.println("Volume Balok    :"+Volume);
        return Volume;
    }
}
