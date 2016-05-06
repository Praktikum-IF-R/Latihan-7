package bangunruang;
public class Lingkaran extends BangunRuang{
private double jari;
protected  final double PI =3.14;
    public Lingkaran(String w, int n, double r) {
        super(w, n);
        setJari(r);
    }
    public void setJari(double r){
        jari=r;
    }
public double getJari(){
    return jari;
}
    @Override
    public double getLuas() {
    return PI*Math.pow(getJari(),2);
    }

    @Override
    public double getKeliling() {
    return 2*PI*getJari();
    }
    @Override
    public double getVolume() {
  return 0;
    }
    public void displayMessage(){
        System.out.println("Bangun Ruang Lingkaran");
        System.out.println("Bangun ruang no"+super.getNoBangunRuang()+" Memiliki warna "+super.getWarna());
        System.out.println("Memiliki Jari-jari :"+getJari());
        System.out.println("Memiliki Luas :"+getLuas());
        System.out.println("Memiliki Keliling"+getKeliling());
    }
}
