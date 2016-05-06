package bangunan;
public class Kubus extends Persegi  {
    private double rusuk;
    public Kubus(){
        rusuk = 0;
    }
    public Kubus(double r){
        rusuk = r;
    }
    public double Volume(){
        return Math.pow(rusuk,3);
    }
    public void Display(){
        System.out.println("Volume Kubus : "+Volume());
    }
}