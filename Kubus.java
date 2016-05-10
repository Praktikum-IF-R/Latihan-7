//author @mfrhn18
package polymorfismeVII;
public class Kubus extends Persegi {
    private double volume;
    public Kubus(double a){
        super(a);
    }
    public double getVolume(){
        return getLuas()*getSisi();
    }
    public void boom(){
        System.out.println("Volume Kubus    : "+getVolume());
    }
}
//Latihan-7