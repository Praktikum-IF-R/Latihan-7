package bangungeometri;
public class LimasSegitiga extends Segitiga {
    public LimasSegitiga(double r,double a,double t,double p, double l){
        super(r,a,t,p,l);
    }
    public double Volume(){
        double volume=(int)(getPanjang()*getLebar()*getTinggi()*1/2)/3;
        return volume;
    }
}
