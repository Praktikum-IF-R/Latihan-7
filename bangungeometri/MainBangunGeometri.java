package bangungeometri;
import java.util.Scanner;
public class MainBangunGeometri {
    public static void main(String[] args) {
    Scanner ddr=new Scanner(System.in);
        int pil;
        do{
        System.out.println("--------------------------------------------------");
        System.out.println("-----------------BANGUN GEOMETRI------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("  1. Lingkaran");
        System.out.println("  2. Segitiga");
        System.out.println("  3. Keluar");
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println(); 
        System.out.print("Masukkan Pilihan : ");
        pil=ddr.nextInt();
        switch(pil){
            case (1) : 
        System.out.println("--------------------------------------------------");
        System.out.println("  Menghitung luas, keliling lingkaran dan volume");
        System.out.println("--------------------------------------------------");
        System.out.print("  Masukkan Jari-jari : ");
        int r = ddr.nextInt();
        Lingkaran L=new Lingkaran(r,0,0,0,0);
        Bola B=new Bola(r,0,0,0,0);
        System.out.println("--------------------------------------------------");
        System.out.println("  Bidang 2 Dimensi");
        System.out.println("  Luas Lingkaran     : "+L.Luas());
        System.out.println("  Keliling Lingkaran : "+L.Keliling());
        System.out.println("--------------------------------------------------");
        System.out.println("  Bidang 3 Dimensi");
        System.out.println("  Volume             : "+B.Volume());
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println(); break;
            case (2) : 
        System.out.println("--------------------------------------------------");
        System.out.println("  Menghitung luas, keliling segitiga dan volume");
        System.out.println("--------------------------------------------------");
        System.out.print("  Masukkan Alas     : ");
        int a=ddr.nextInt();
        System.out.print("  Masukkan Tinggi   : ");
        int t=ddr.nextInt();
        System.out.print("  Masukkan Panjang  : ");
        int p=ddr.nextInt();
        System.out.print("  Masukkan Lebar    : ");
        int l=ddr.nextInt();
        Segitiga S=new Segitiga(0,a,t,p,l);
        LimasSegitiga Ls=new LimasSegitiga(0,a,t,p,l);
        System.out.println("--------------------------------------------------");
        System.out.println("  Bidang 2 Dimensi");
        System.out.println("  Luas Segitiga     : "+S.Luas());
        System.out.println("  Keliling Segitiga : "+S.Keliling());
        System.out.println("--------------------------------------------------");
        System.out.println("  Bidang 3 Dimensi");
        System.out.println("  Volume            : "+Ls.Volume());
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println(); break;
        case (3) : System.out.println("Keluar"); break;
        default : System.out.println("Input yang anda masukkan salah. Program dihentikan . . . ");
        System.exit(0);
        System.out.println();break;
        }
    }
        while(pil!=3);
    }
}
