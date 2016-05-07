package Bab7LT;

public class Balok extends Bangun{
    private double tinggi;
    
    public Balok(double p, double l, double t){
        super(p,l);
        this.tinggi = t;
    }
    
    public double GetTinggi(){
        return tinggi;
    }
    
    public double VolumeBalok(){
        return GetPanjang()*GetLebar()*GetTinggi();
    }
    
    public double LuasPBalok(){
        return ((GetPanjang()+GetLebar())*2)+((GetPanjang()+GetTinggi())*2)+((GetLebar()+GetTinggi())*2);
    }
    
}
