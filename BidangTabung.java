package Polimorfisme;
public class BidangTabung extends BidangLingkaran {
    private double Tinggi;
    private double Volume;
    
    public void setTinggi(double Tinggi){
        this.Tinggi = Tinggi;
    }
    public double getTinggi(){
        return Tinggi;
    }
    public void setVolume(){
        Volume = ((super.getJari()*super.getJari())*(3.14)) * Tinggi;
    }
    public double getVolume(){
        return Volume;
    }
    
    
}
