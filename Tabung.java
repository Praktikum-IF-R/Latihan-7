package bidang;

public class Tabung extends Lingkaran {
    private double t;

    public Tabung(String w) {
        super(w);
    }
    
    public void setT(double t){
        this.t = t;
    }
    
    public double getT(){
        return t;
    }
    
    public double volume(){
        double volume = Luas()*t;
        return volume;
    }
    
    public double luasPermukaan(){
        double luasPermukaan = (2*Luas())+((2*getR())*t);
        return luasPermukaan;
    }
    
    @Override
    public void display(){
        System.out.println("Bidang 3D      :Tabung");
        System.out.println("Warna          :"+getWarna());
        System.out.println("Panjang sisi   :"+getR());
        System.out.println("Volume         :"+volume());
        System.out.println("Luas Permukaan :"+luasPermukaan());
    }
    
    
    
}
