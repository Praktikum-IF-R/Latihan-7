
package bab7;


public class bola extends Shape3 {
     private double jarijari;
     private int volume ; 

    public int getVolume() {
        return volume;
    }

    public void setvolume(int volume) {
        this.volume = volume;
    }
    public double getJarijari() {
        return jarijari;
    }

    public void setJarijari(double r) {
        jarijari = r;
    }
    public bola (int r){
        jarijari = r;
    }
    public double getluas() {
     return 4 * 3.14 * (jarijari * jarijari);
    }

    public double getvolume() {
        volume = (int) (4/3 * 3.14 * (jarijari*jarijari*jarijari));
        return volume;
    }

    public void show() {
        System.out.println("Luas: " + getluas());
        System.out.println("Volume: " + getvolume());

    }
} 
    

