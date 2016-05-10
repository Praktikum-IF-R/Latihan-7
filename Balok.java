//author @mfrhn18
package polymorfismeVII;
public class Balok extends PersegiPanjang {
    private double tinggi, volume;
    public Balok(double p, double l, double t){
        super(p,l);
        tinggi = p;
    }
    public double getVolume(){
        return getLuas()*tinggi;
    }
    public void boom(){
        System.out.println("Volume Balok    : "+getVolume());
    }
}
//Latihan-7