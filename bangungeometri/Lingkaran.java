package bangungeometri;
public class Lingkaran extends BangunGeometri{
    private int luas,keliling,volume;
    public Lingkaran(double r,double a, double t,double p, double l){
        super(r,a,t,p,l);
    }
    public double Luas(){
        double luas=(int)Math.PI*getJari()*getJari();
        return luas;
    }
    public double Keliling(){
        double keliling=(int)Math.PI*getJari()*2;
        return keliling;
    }
    public double Volume(){
        double volume=0;
        return volume;
    }
}
