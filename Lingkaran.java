//author @mfrhn18
package polymorfismeVII;
public class Lingkaran extends BangunGeo {
    private double jari, luas, keliling;
    public Lingkaran(double r){
        jari = r;
    }
    public double getJari(){
        return jari;
    }
    public void setLuas(){
        luas = Math.PI * 2 * jari;
    }
    public void setKeliling(){
        keliling = Math.PI * Math.pow(2, jari);
    }
    public double getLuas(){
        return luas;
    }
    public double getKeliling(){
        return keliling;
    }
    public void boom(){
        System.out.println("Luas Lingkaran      : "+getLuas());
        System.out.println("Keliling Lingkaran  : "+getKeliling());
    }
}
