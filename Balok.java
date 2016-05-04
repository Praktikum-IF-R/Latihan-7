package Latihan7;

public class Balok extends PersegiPanjang {

    private double Volume;
    public Balok(double p, double l, double t){
        super(p,l);
        super.setTinggi(t);   
    }

    public double getVolume() {
        Volume = getPanjang() * getTinggi() * getLebar();
        return Volume;
    }

}
