package bangungeometri;

/**
 *
 * @author DDR
 */
public abstract class BangunGeometri {
    private double jarijari;
    private double alas,tinggi,panjang,lebar;
    
    public BangunGeometri(double r,double a, double t,double p, double l){
        jarijari=r;
        alas=a;
        tinggi=t;
        panjang=p;
        lebar=l;
    }
    
    public void setBangunGeometri(double r, double a, double t,double p, double l){
        jarijari=r;
        alas=a;
        tinggi=t;
        panjang=p;
        lebar=l;
    }
    public double getJari(){
        return jarijari;
    }
    public double getAlas(){
        return alas;
    }
    public double getTinggi(){
        return tinggi;
    }
    public double getPanjang(){
        return panjang;
    }
    public double getLebar(){
        return lebar;
    }
    public abstract double Luas();
    public abstract double Keliling();
    public abstract double Volume();
}