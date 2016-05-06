
package bangunruang;
public class Persegi extends BangunRuang {
    protected double sisi;
    public Persegi(String w, int n, double s){
        super(w, n);
        setSisi(s);
    }
    public void setSisi(double s){
        sisi=s;
    }
    public double getSisi(){
        return sisi;
    }
    public double getLuas(){
        return Math.pow(getSisi(),2);
    }
    public double getKeliling(){
        return 4*getSisi();
    }
    public double getVolume(){
        return 0;
    }
    public void displayMessage(){
        System.out.println("Bangun Ruang Persegi");
        System.out.println("Bangun ruang no"+super.getNoBangunRuang()+"Memiliki warna"+super.getWarna());
        System.out.println("Memiliki Sisi :"+getSisi());
        System.out.println("Memiliki Luas :"+getLuas());
        System.out.println("Memiliki Keliling :"+getKeliling());
    }
    
    
    
}
