package Latihan;
public class Tabung extends TigaD{
    private int r;
    private int tinggi;

    public Tabung(int r, int tinggi) {
        this.r = r;
        this.tinggi = tinggi;
    }
    public void setR(int r) {
        this.r = r;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    public double getLuas(){
        luas = 2*Math.PI*(r*r)+(2*Math.PI*r*tinggi);
        return luas;
    }
    public double getVolume(){
        volume = 2*Math.PI*(r*r)+tinggi;
        return volume;
    }
    public void Info(){
        System.out.println("Luas: "+getLuas());
        System.out.println("Volume: "+getVolume());
        System.out.println("========================");
    }
}
