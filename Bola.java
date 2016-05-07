package bidang;
public class Bola extends Lingkaran{

    public Bola(String w) {
        super(w);
    }
    
    public double volume(){
        double volume = ((4*Math.PI*getR()*getR()*getR())/3);
        return volume;
    }
    
    public double luasPermukaan(){
        double luasPermukaan = 4*Math.PI*getR()*getR();
        return luasPermukaan;
    }
    
    @Override
    public void display(){
        System.out.println("Bidang 3D      :Bola");
        System.out.println("Warna          :"+getWarna());
        System.out.println("Panjang sisi   :"+getR());
        System.out.println("Volume         :"+volume());
        System.out.println("Luas Permukaan :"+luasPermukaan());
    }
    
}
