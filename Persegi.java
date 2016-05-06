package Latihan;
public class Persegi extends DuaD{
    private int panjang;
    private int lebar;

    public Persegi(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    public double getKeliling(){
        keliling = 2*(panjang+lebar);
        return keliling;
    }
    public  double getLuas(){
        return lebar*panjang;
    }
    public void Info(){
        System.out.println("Luas: "+getLuas());
        System.out.println("Keliling: "+getKeliling());
        System.out.println("========================");
    }
}
