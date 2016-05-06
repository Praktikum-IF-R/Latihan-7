package latihan7;
public class Balok extends BangunGeometri{
    private double panjang, lebar, tinggi;
    private String warna;
    public void Balok(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        System.out.println("Bangun balok memiliki panjang: "+panjang);
        System.out.println("Bangun balok memiliki lebar: "+lebar);
        System.out.println("Bangun balok memiliki tinggi: "+tinggi);
    }
    public void Balok(String warna){
        this.warna = warna;
    }
    public double Luas(){
        return 0;
    }
    public double Keliling(){
        return 0;
    }
    public double Volume(){
        return panjang*lebar*tinggi;
    }
    public String color(){
        return warna;
    }
}
