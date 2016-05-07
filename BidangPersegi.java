package Polimorfisme;
public class BidangPersegi extends Bidang {
    private double sisi;
    private double Luas;
    private double Keliling;
    
    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    public double getSisi(){
        return sisi;
    }
    @Override
    public void setLuas(){
        Luas = sisi * sisi;
    }
    @Override
    public double getLuas(){
        return Luas;
    }
    @Override
    public void setKeliling(){
        Keliling = 4 * sisi;
    }
    @Override
    public double getKeliling(){
        return Keliling;
    }
}
