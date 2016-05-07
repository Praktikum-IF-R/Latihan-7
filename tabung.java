
package bab7;


public class tabung extends bangun3d {
    private int jari, tinggi;
    
    public tabung (int jari, int tinggi){
        this.jari = jari;
        this.tinggi = tinggi;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public double getluas() {
        luas = 2*3.14*jari*(jari+tinggi);
        return luas;
    }

    public double getvolume() {
        volume = 3.14*jari*jari*tinggi;
        return volume;
    }
    
    
    public void print() {
        System.out.println("Luas: " + getluas());
        System.out.println("Volume: " + getvolume());

    }
}
