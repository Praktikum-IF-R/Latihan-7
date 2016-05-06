package latihan7;

public class Balok extends Polymorphism {
    int panjang, lebar, tinggi, volume;
    
    public void setPanjang(int panjang){
        this.panjang = panjang;
    }
    public int getPanjang(){
        return panjang;
    }
    public void setLebar(int lebar){
        this.lebar = lebar;
    }
    public int getLebar(){
        return lebar;
    }
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    public int getTinggi(){
        return tinggi;
    }
    public int Volume(){
        return volume = 4*(panjang + lebar + tinggi);
    }
    @Override
    public int luas(){
        return luas = 2* ((panjang * lebar) + (panjang*tinggi)+(lebar*tinggi));
    }
    @Override
    public int keliling(){
        return keliling = 2* (panjang + lebar+tinggi);
    }
    @Override
    public String display(){
        return super.display()+"\nVolume \t : "+Volume();
    }
}
