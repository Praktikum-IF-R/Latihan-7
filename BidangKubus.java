package Polimorfisme;
public class BidangKubus extends BidangPersegi {
    private double Volume;
    
    public void setVolume(){
        Volume = super.getSisi()*super.getSisi()*super.getSisi();
    }
    public double getVolume(){
        return Volume;
    }
}
