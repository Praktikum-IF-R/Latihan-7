package latihan7;

public class Persegi extends Perhitungan {
    
    private int sisi;
    public Persegi(String a, int b){
        super(a);
        setSisi(b);
    }
    public void setSisi(int b){
        sisi = b;
    }
    public int getSisi(){
        return sisi;
    }
    public double Luas(){
        return getSisi()*getSisi();
    }
    public double Keliling(){
        return getSisi()*4;
    }
    public double Volume(){
        return 0;
    }
    public void Display(){
        System.out.println("Luas\t\t : "+Luas()+" cm2");
        System.out.println("Keliling\t : "+Keliling()+" cm");
    }
}
