package Polimorfisme;
public class BidangPersegiPanjang extends Bidang {
    public double Panjang;
    public double Lebar;
    public double Luas;
    public double Keliling;
    
    public void setPanjang(double Panjang){
        this.Panjang = Panjang;
    }
    public double getPanjang(){
        return Panjang;
    }
    public void setLebar (double Lebar){
        this.Lebar = Lebar;
    }
    public double getLebar(){
        return Lebar;
    }
    @Override
    public void setLuas(){
        Luas = Panjang * Lebar;
    }
    @Override
    public double getLuas(){
        return Luas;
    }
    @Override
    public void setKeliling(){
        Keliling = (2*Panjang) + (2*Lebar); 
    }
    @Override
    public double getKeliling(){
        return Keliling;
    }
    
}
