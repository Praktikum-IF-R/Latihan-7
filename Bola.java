package latihan7;
public class Bola extends BangunGeometri {
    private double r;
    private String warna;
    public void Bola(double r){
        this.r = r;
        System.out.println("Bangun bola memiliki jari-jari: "+r);
    }
    public void Bola(String warna){
        this.warna = warna;
    }
    public double Luas(){
        return 0;
    }
    public double Keliling(){
        return 0;
    }
    public double Volume(){
        return (4*Math.PI*r*r*r)/3;
    }
    public String color(){
        return warna;
    }
}
