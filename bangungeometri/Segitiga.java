package bangungeometri;
public class Segitiga extends BangunGeometri {
    private double luas,keliling,volume;
    public Segitiga(double r, double a, double t, double p, double l){
        super(r,a,t,p,l);
    }
    public double Luas(){
        double luas=(int)(getAlas()*getTinggi())/2;
        return luas;
    }
    public double Keliling(){
        double keliling=(int)Math.sqrt(getAlas()*getAlas()+getTinggi()*getTinggi())+getAlas()+getTinggi();
        return keliling;
    }
    public double Volume(){
        double volume=0;
        return volume;
    }
}
