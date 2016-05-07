package bidang;

public class Lingkaran extends Bidang {
    private double r;
    
    public Lingkaran(String w){
        super(w);
    }
    
    public void setR(double r){
        this.r = r;
    }
    
    public double getR(){
        return r;
    }

    @Override
    public double Luas() {
        double luas = Math.PI*r*r;   
        return luas;
    }

    @Override
    public double Keliling() {
        double keliling = 2*Math.PI*r;
        return keliling;
    }
    
    @Override
    public void display(){
        System.out.println("Bidang 2D :Lingkaran");
        System.out.println("Warna     :"+getWarna());
        System.out.println("Jari-jari :"+r);
        System.out.println("Luas      :"+Luas());
        System.out.println("Keliling  :"+Keliling());
    }
    
}
