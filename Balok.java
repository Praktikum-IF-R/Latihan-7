package bangunruang;
public class Balok extends PersegiPanjang{
private double tinggi;
    public Balok(String w, int n, double p, double l, double t) {
        super(w, n, p, l);
        setTinggi(t);
    }
    public void setTinggi(double t){
       tinggi=t;
    }
    public double getTinggi(){
        return tinggi;
    }
    public double getVolume(){
        return super.getLuas()*getTinggi();
    }
    public void displayMessage(){
        System.out.println("Bangun Ruang Balok");
        System.out.println("Bangun ruang no"+super.getNoBangunRuang()+"Memiliki warna"+super.getWarna());
        System.out.println("Memiliki Panjang :"+getPanjang());
        System.out.println("Memiliki Lebar :"+getLebar());
        System.out.println("Memiliki Tinggi :"+getTinggi());
        System.out.println("Memiliki Volume :"+getVolume());
    }    
}
