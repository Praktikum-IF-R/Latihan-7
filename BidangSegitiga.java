package Polimorfisme;
public class BidangSegitiga extends Bidang {
    private double Alas;
    private double Tinggi;
    private double Miring;
    private double Luas;
    private double Keliling;
    
    
    public void setAlas(double Alas){
        this.Alas = Alas;
    }
    public double getAlas(){
        return Alas;
    }
    public void setTinggi(double Tinggi){
        this.Tinggi = Tinggi;
    }
    public double getTinggi(){
        return Tinggi;
    }
    @Override
    public void setLuas(){
        Luas = (Alas*Tinggi) * 0.5;
    }
    @Override
    public double getLuas(){
        return Luas;
    }
    public void setMiring(){
        Miring = Math.sqrt ((Alas*Alas))+(Tinggi*Tinggi);
    }
    public double getMiring(){
        return Miring;
    }
    @Override
    public void setKeliling(){
        Keliling = Miring + Tinggi + Alas;
    }
    @Override
    public double getKeliling(){
        return Keliling;
    }

}
