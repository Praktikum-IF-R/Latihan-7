//author @mfrhn18
package polymorfismeVII;
public class Persegi extends BangunGeo {
    private double sisi, luas, keliling;
    public Persegi(double s){
        sisi = s;
    }
    public double getSisi(){
        return sisi;
    }
    public double getLuas(){
        return sisi*sisi;
    }
    public double getKeliling(){
        return 4*sisi;
    }
    public void boom(){
        System.out.println("Luas Persegi    : "+getLuas());
        System.out.println("Keliling Persegi: "+getKeliling());
    }
}
//Latihan-7