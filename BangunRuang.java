package bangunruang;
public abstract class BangunRuang {
protected String warna;
protected int nomor;
public BangunRuang(String w, int n){
    warna=w;
    nomor=n;
}
public String getWarna(){
    return warna;
}
public int getNoBangunRuang(){
    return nomor;
}
public abstract void displayMessage();
abstract public double getLuas();
abstract public double getKeliling();
abstract public double getVolume();
}
    

