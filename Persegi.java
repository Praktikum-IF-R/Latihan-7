package bangunan;
public class Persegi extends Bangunan {
    private double rusuk;
    public Persegi(){
        rusuk = 0;
    }
    public Persegi(double r){
        rusuk = r;
    }
    public double Luas(){
        return Math.pow(rusuk,2);
    }
    public double Keliling(){
        return 4*rusuk;
    }
    @Override
    public double Volume() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void Display(){
        System.out.println("Luas Persegi     : "+Luas());
        System.out.println("Keliling Persegi : "+Keliling());
    }
}