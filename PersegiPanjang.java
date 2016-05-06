package latihan7;
public class PersegiPanjang extends BangunGeometri {
    private double panjang, lebar;
    private String warna;
    public void PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        System.out.println("Bangun persegi panjang memiliki panjang: "+panjang);
        System.out.println("Bangun persegi panjang memiliki lebar: "+lebar);
    }
    public void PersegiPanjang(String warna){
        this.warna = warna;
    }
    public double Luas(){
        return panjang*lebar;
    }
    public double Keliling(){
        return 2*(panjang+lebar);
    }
    public double Volume(){
        return 0;
    }
    public String color(){
        return warna;
    }
}
