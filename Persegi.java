package bidang;

public class Persegi extends Bidang {
    private int sisi;
    
    public Persegi(String w){
        super(w);
    }
    
    public void setSisi(int s){
        sisi = s;
    }
    
    public int getSisi(){
        return sisi;
    }

    @Override
    public double Luas() {
        int Luas = sisi*sisi;
        return Luas;
    }

    @Override
    public double Keliling() {
        int Keliling = 4*sisi;
        return Keliling;
    }
    
    @Override
    public void display(){
        System.out.println("Bidang 2D    :Persegi");
        System.out.println("Warna        :"+getWarna());
        System.out.println("Panjang sisi :"+sisi);
        System.out.println("Luas         :"+Luas());
        System.out.println("Keliling     :"+Keliling());
    }
    
}
