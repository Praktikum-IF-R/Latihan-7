package Polimorfisme;
public class BidangLingkaran extends Bidang {
    private double jarijari;
    private double Luas;
    private double Keliling;
    
    public void setJari(double jarijari){
        this.jarijari = jarijari;
    }
    public double getJari(){
        return jarijari;
    }
    public void setLuas(){
        Luas = (jarijari * jarijari) * 3.14;
    }
    public double getLuas(){
        return Luas;
    }
    public void setKeliling(){
        Keliling = (jarijari*2) * 3.14;
    }
    public double getKeliling(){
        return Keliling;
    }
    
}
