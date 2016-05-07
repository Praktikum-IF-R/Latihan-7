package bidang;

public class Kubus extends Persegi {

    public Kubus(String w) {
        super(w);
    }
    
    public int volume(){
        int volume = getSisi()*getSisi()*getSisi();
        return volume;
    }
    
    public int luasPermukaan(){
        int luasPermukaan = 6 * (getSisi()^2);
        return luasPermukaan;
    }
    
    @Override
    public void display(){
        System.out.println("Bidang 3D      :Kubus");
        System.out.println("Warna          :"+getWarna());
        System.out.println("Panjang sisi   :"+getSisi());
        System.out.println("Volume         :"+volume());
        System.out.println("Luas Permukaan :"+luasPermukaan());
    }
    
    
    
}
