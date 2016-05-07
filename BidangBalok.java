package Polimorfisme;
public class BidangBalok extends BidangPersegiPanjang {
    private double Volume;
    private double Tinggi;
    
    public void setTinggi(double Tinggi){
        this.Tinggi = Tinggi;
    }
    public double getTinggi(){
        return Tinggi;
    }
    public void setVolume(){
        Volume = super.getPanjang()*super.getLebar()*Tinggi ;
    }
    public double getVolume(){
        return Volume;
    }
}
