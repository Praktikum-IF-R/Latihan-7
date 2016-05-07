package Polimorfisme;
public class BidangLimasSegitiga extends BidangSegitiga {
    private double Volume;
    private double tinggi;
    
    public void setTinggiLimas(double tinggi){
        this.tinggi = tinggi;
    }
    public double getTinggiLimas(){
        return tinggi;
    }
    public void setVolume(){
        Volume = ((super.getAlas()*super.getTinggi()*1/2))*(tinggi* 1/3);
    }
    public double getVolume(){
        return Volume;
    }
    
}
