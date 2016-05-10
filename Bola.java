//author @mfrhn18
package polymorfismeVII;
public class Bola extends Lingkaran {
    private double jari,volume;

    public Bola(double r) {
        super(r);
    }
    public double getVolume(){
        return (4/3)*(getJari()*getJari()*getJari()*Math.PI);
    }
    public void boom(){
        System.out.println("Volume Bola : "+getVolume());
    }
}
//Latihan-7