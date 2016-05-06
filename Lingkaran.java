package latihan7;
public class Lingkaran extends BangunGeometri {
    private double r;
    private String warna;
    public void Lingkaran(double r){
        this.r = r;
        System.out.println("Bangun lingkaran memiliki jari-jari: "+r);
    }
    public void Lingkaran(String warna){
        this.warna = warna;
    }
    public double Luas(){
        return Math.PI * r *r;
    }
    public double Keliling(){
        return Math.PI*(r+r);
    }
    public double Volume(){
        return 0;
    }
    public String color(){
        return warna;
    }
}
