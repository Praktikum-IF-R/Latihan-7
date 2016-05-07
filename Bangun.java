package Bab7LT;

public abstract class Bangun {
    private double panjang, lebar;
    
    public Bangun (double p, double l){
        this.panjang = p;
        this.lebar = l;
    }
    
    public double GetPanjang(){
        return panjang;
    }
    
    public double GetLebar(){
        return lebar;
    }
    
    
}
