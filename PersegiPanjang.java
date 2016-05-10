//author @mfrhn18
package polymorfismeVII;
public class PersegiPanjang extends BangunGeo {
    private double panjang, lebar, luas, keliling;
    public PersegiPanjang(double p, double l){
        panjang = p;
        lebar = l;
    }
    public double getLuas(){
        return panjang*lebar;
    }
    public double getKeliling(){
        return 2*(panjang+lebar);
    }
    public void boom(){
        System.out.println("Luas Persegi Panjang    : "+getLuas());
        System.out.println("Keliling Persegi Panjang: "+getKeliling());
    }
}
//Latihan-7