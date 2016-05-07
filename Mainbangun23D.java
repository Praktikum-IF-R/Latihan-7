package bab7;

import java.util.*;

public class Mainbangun23D {
    private static int jarijari;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean status = true;
        System.out.println("");
        System.out.println("--------- Program Hitung Bangun -----------");
         while(status){
         System.out.println("--------- Pilih Bangun ------------------");
        System.out.println("1.Persegi");
         System.out.println("2.Lingkaran");
         System.out.println("3.Bola");
         System.out.println("4.Tabung");
         System.out.println("5.Exit");
         System.out.print("Input(angka) : ");
         int pilihan = scn.nextInt();
         switch(pilihan){
             case 1  :   System.out.print("Masukkan Sisinya : "); 
                         int s= scn.nextInt();
                         persegi psg = new persegi(s); 
                         psg.print();
                         break;
             case 2  :   System.out.print("Masukkan Jari-jari : "); 
                         int j = scn.nextInt();
                         lingkaran ling = new lingkaran(j); 
                         ling.print();
                         break;
             case 3  :   System.out.print("Masukkan jarijari : "); 
                         int jr = scn.nextInt();
                         bola bl = new bola(jarijari); 
                         bl.print();
                         break;
             case 4  :   System.out.print("Masukkan Jari-jari: "); 
                         int jari = scn.nextInt();
                         System.out.print("Masukkan Tinggi   : "); 
                         int tinggi = scn.nextInt();
                         tabung tbg = new tabung(jari,tinggi);
                         tbg.print();
                         break;
             case 5  :   status = false; 
                         break;
             default :   System.out.println("Maaf Pilihan Anda Tidak Ditemukan.");
         }
     }
    }
    
}
