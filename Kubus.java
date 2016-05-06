package Latihan;
public class Kubus extends TigaD{
    private int sisi;

    public Kubus(int sisi) {
        this.sisi = sisi;
    }
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    public double getLuas(){
        luas = 6*(sisi*sisi);
        return luas;
    }
    public double getVolume(){
        volume = sisi*sisi*sisi;
        return volume;
    }
    public void Info(){
        System.out.println("Luas Permukaan: "+getLuas());
        System.out.println("Volume: "+getVolume());
        System.out.println("========================");
    }
}
