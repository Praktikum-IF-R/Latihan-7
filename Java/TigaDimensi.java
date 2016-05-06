package geometri;
public class TigaDimensi extends Bangunan {

    private int panjang;
    private int lebar;
    private int tinggi;
    
    public TigaDimensi(int a , int b , int c){
        this.panjang = a;
        this.lebar = b;
        this.tinggi = c;
    }
    @Override
    public int luas() {
        return panjang;
    }

    @Override
    public int keliling() {
        return lebar;
    }

    @Override
    public int volume() {
        int x = panjang * lebar * tinggi;
        return x;
    }
    
    public int gettinggi(){
        return tinggi;
    }
    
}
