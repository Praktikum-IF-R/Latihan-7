package Bab7LT;

public class PersegiPanjang extends Bangun {
    
    public PersegiPanjang(double p, double l){
        super(p,l);
    }
    
    public double LuasPersegi(){
        return GetPanjang()*GetLebar();
    }
    
    public double KelilingPersegi(){
        return (GetPanjang()+GetLebar())*2;
    }
    
}
