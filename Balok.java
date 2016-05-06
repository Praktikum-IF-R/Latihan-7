package polimorfisme;
public class Balok extends Tiga{
    private int panjang,lebar,tinggi;
    public Balok(int p,int l,int t){
        panjang=p;
        lebar=l;
        tinggi=t;
    }
    public int Luas(int L){
        L=2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
        return L;
    }
    public int Volum(int V){
        V=panjang*lebar*tinggi;
        return V;
    }
}
