package Polimorfisme;
public class BidangBola extends BidangLingkaran {
    private double Volume;
    
    public void setVolume(){
        Volume = (4/3) * (super.getJari()*super.getJari()*super.getJari())*(3.14);
    }
    public double getVolume(){
        return Volume;
    }
}
