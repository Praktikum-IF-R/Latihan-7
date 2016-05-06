package polimorfisme;
public class Prisma extends Tiga{
    private int lAlas,keliling,tinggi;
    public Prisma(int LA,int k,int t){
        lAlas=LA;
        keliling=k;
        tinggi=t;
    }
    public int Luas(int L){
        L=(2*lAlas)+(keliling*tinggi);
        return L;
    }
    public int Volum(int V){
        V=lAlas*tinggi;
        return V;
    }
}
