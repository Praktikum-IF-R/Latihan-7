package geometri;
public class DuaDimensi extends Bangunan {
    private int panjang;
    private int lebar;
    public DuaDimensi(int a , int b){
        this.panjang = a;
        this.lebar = b;
    }
    public int keliling(){
        int c = this.panjang + this.panjang + this.lebar + this.lebar;
        return c;
    }
    
    public int luas(){
        int c = this.panjang * this.lebar;
        return c;
    }
    
    public int volume(){
        return panjang;
    }
    
    public int getlebar(){
        return lebar;
    }
}
