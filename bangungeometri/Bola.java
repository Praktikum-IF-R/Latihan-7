package bangungeometri;
public class Bola extends Lingkaran{
    public Bola(double r, double a, double t, double p, double l){
        super(r, a, t, p, l);
    }
    public double Volume(){
        double volume=(int)(Math.PI*4*getJari()*getJari()*getJari())/4;
        return volume;
    }
}
