package geometri;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=======");
        System.out.println("3D & 2D");
        System.out.println("=======");
        System.out.println("Kali ini kita akan membahas bangunan persegi panjang");
        System.out.println("Mari kita masukkan panjang dan lebar nya");
        System.out.print("PANJANG : ");
        int a = in.nextInt();
        System.out.print("LEBAR : ");
        int b = in.nextInt();
        DuaDimensi x = new DuaDimensi(a , b);
        System.out.println("DALAM 2 DIMENSI");
        System.out.println("Keliling    : "+x.keliling());
        System.out.println("Rumus       :  1. Panjang + Lebar + Panjang + Lebar ");
        System.out.println("               2. (Panjang x 2) + (Lebar x 2)       ");
        System.out.println("Luas        : "+x.luas());
        System.out.println("Rumus       : Panjang x Lebar");
        System.out.println("");
        System.out.println("");
        System.out.println("Jika Anda Penasaran maka mari kita masukan tingginya maka kita akan melihat dalam benntuk 3 DIMENSI");
        System.out.print("TINGGI        : ");
        int c = in.nextInt();
        TigaDimensi y = new TigaDimensi(a , b , c);
        System.out.println("");
        System.out.println("");
        System.out.println("DALAM 3 DIMENSI");
        System.out.println("Volume      : "+y.volume());
        System.out.println("Rumus       : Panjang x Lebar x Tinggi");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Science without religion is lame, religion without science is blind. "
                + "-Albert Einstein");
        System.out.println("");
        System.out.println("TERIMAKASIH TELAH MENGGUNAKAN PROGRAM 3D & 2D");
    }
}
