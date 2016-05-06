package Latihan;
public class Segitiga extends DuaD{
    private int alas;
    private int tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public int getAlas() {
        return alas;
    }
    public void setAlas(int alas) {
        this.alas = alas;
    }
    public int getTinggi() {
        return tinggi;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    public double getLuas(){
        luas = (alas*tinggi)/2;
        return luas;
    }
    public double getKeliling(){
        double hitung = (alas*alas)+(tinggi*tinggi);
        double sisi = Math.sqrt(hitung);
        keliling = alas+tinggi+sisi;
        return keliling;
    }
    public void Info(){
        System.out.println("Luas: "+getLuas());
        System.out.println("Keliling: "+getKeliling());
        System.out.println("========================");
    }
}
