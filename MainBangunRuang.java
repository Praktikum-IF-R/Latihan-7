package bangunruang;
import java.util.Scanner;

public class MainBangunRuang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Persegi p=new Persegi("Merah",1,10);
        Kubus k =new Kubus("Kuning",2,8);
        PersegiPanjang pp =new PersegiPanjang("Pink",3,8,10);
        Balok b = new Balok("Hijau",4,8,10,6);
        Segitiga s=new Segitiga("Biru",5,10,6);
        LimasSegitiga ls = new LimasSegitiga("magenta",6,8,10,12);
        Lingkaran l=new Lingkaran("Oranye",7,7);
        Kerucut ke=new Kerucut("Hitam",8,10,12);
        BangunRuang BR[]=new BangunRuang[8];
        BR[0]=p;
        BR[1]=k;
        BR[2]=pp;
        BR[3]=b;
        BR[4]=s;
        BR[5]=ls;
        BR[6]=l;
        BR[7]=ke;
        for(int i=0;i<BR.length;i++){
        BR[i].displayMessage();
    }
    }
}
