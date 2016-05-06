package Latihan;
import java.util.*;
public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        boolean status = true;
        System.out.println("==========||Program Hitung Bangun||==========");
        while(status){
        System.out.println("Ingin menghitung luas/volume bangun yang mana?");
        System.out.println("1.Persegi Panjang\n2.Segitiga");
        System.out.println("3.Kubus\n4.Tabung\n5.Keluar");
        System.out.print("Input: ");
        int a = in.nextInt();
        switch(a){
            case 1  :   System.out.print("Masukkan Panjang: "); int b = in.nextInt();
                        System.out.print("Masukkan Lebar: ");int c = in.nextInt();
                        Persegi bidangA = new Persegi(b,c); bidangA.Info();
                        break;
            case 2  :   System.out.print("Masukkan Alas: "); b = in.nextInt();
                        System.out.print("Masukkan Tinggi: "); c = in.nextInt();
                        Segitiga bidangB = new Segitiga(b,c); bidangB.Info();
                        break;
            case 3  :   System.out.print("Masukkan Sisi: "); b = in.nextInt();
                        Kubus bidangC = new Kubus(b); bidangC.Info();
                        break;
            case 4  :   System.out.print("Masukkan Jari-jari: "); b = in.nextInt();
                        System.out.print("Masukkan Tinggi: "); c = in.nextInt();
                        Tabung bidangD = new Tabung(b,c); bidangD.Info();
                        break;
            case 5  :   status = false; break;
            default :   System.out.println("Maaf Pilihan Anda Tidak Ditemukan.");
        }
    }
    }
}
