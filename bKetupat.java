package polimorfisme;
public class bKetupat extends Dua{
    private double sisi;
    private double d1,d2;
    public bKetupat(double s,double d1,double d2){
        sisi=s;
        this.d1=d1;
        this.d2=d2;
    }
    public double Luas(double L){
        L=(d1*d2)/2;
        return L;
    }
    public double Keliling(double K){
        K=4*sisi;
        return K;
    }
}
