package bangunan;
public class Lingkaran extends Bangunan{
    private double jejari;
    public Lingkaran(){
        jejari = 0;
    }
    public Lingkaran(double r){
        jejari = r;
    }
    public double Luas(){
        return Math.PI*Math.pow(jejari,2);
    }
    public double Keliling(){
        return 2*Math.PI*jejari;
    }
    @Override
    public double Volume() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void Display(){
        System.out.println("Luas Lingkaran     : "+Luas());
        System.out.println("Keliling Lingkaran : "+Keliling());
    }
}