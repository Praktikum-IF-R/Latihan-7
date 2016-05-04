package Latihan7;

public abstract class Bangunan {

    private double panjang;
    private double lebar;
    private double tinggi;
    public Bangunan(double p, double l, double t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }



    public void setPanjang(double p) {
        this.panjang = p;
    }

    public void setLebar(double l) {
        this.lebar = l;
    }

    public void setTinggi(double t) {
        this.tinggi = t;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public abstract double getLuas();

    public abstract double getKeliling();

    public abstract double getVolume();

}
