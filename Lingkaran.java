package latihan7;

public class Lingkaran extends Perhitungan{
    
    private double r;
    public Lingkaran(String a, double b){
        super(a);
        setJarijari(b);
    }
    public void setJarijari(double b){
        r = b;
    }
    public double getJarijari(){
        return r;
    }
    public double Luas(){
        return Math.PI*getJarijari()*getJarijari();
    }
    public double Keliling(){
        return Math.PI*getJarijari()*2;
    }
    public double Volume(){
        return 0;
    }
    public void Display(){
        System.out.println("Luas\t\t : "+Luas()+" cm2");
        System.out.println("Keliling\t : "+Keliling()+" cm");
    }
    
    
}
