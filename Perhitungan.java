package latihan7;

public abstract class Perhitungan  {
    
    private String warna;
    
    public Perhitungan (String a){
        warna = a;
    }
    public abstract double Luas();
    public abstract double Keliling();
    public abstract double Volume();
    
}
