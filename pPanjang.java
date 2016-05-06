package polimorfisme;
public class pPanjang extends Dua{
     private double panjang;
    private double lebar;
    public pPanjang(double p,double l){
        panjang=p;
        lebar=l;
    }
    public double Luas(double L){
        L=panjang*lebar;
        return L;
    }
    public double Keliling(double K){
        K=2*(panjang+lebar);
        return K;
    }
}
