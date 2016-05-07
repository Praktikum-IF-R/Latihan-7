
package bab7;


public class kubus extends Shape3 {
    private int sisi;
    private int volume ; 

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public kubus (int s){
        sisi = s;
    }
    public double getluas() {
        return 6 * (sisi * sisi);
    }

    public double getvolume() {
        volume = sisi * sisi * sisi;
        return volume;
    }

    public void show() {
        System.out.println("Luas: " + getluas());
        System.out.println("Volume: " + getvolume());

    }
}
