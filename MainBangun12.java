/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB7;
import java.util.*;
/**
 *
 * @author Deltaviyahya
 */
public class MainBangun12 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        boolean status = true;
        System.out.println("");
        System.out.println("========== Program Hitung Bangun ==========");
         while(status){
         System.out.println("============= Pilih Bangun ===============");
         System.out.println("1.Persegi Panjang");
         System.out.println("2.Lingkaran");
         System.out.println("3.Kubus");
         System.out.println("4.Tabung");
         System.out.println("5.Exit");
         System.out.print("Input(angka) : ");
         int pilihan = c.nextInt();
         switch(pilihan){
             case 1  :   System.out.print("Masukkan Panjang : "); 
                         int p = c.nextInt();
                         System.out.print("Masukkan Lebar   : ");
                         int l = c.nextInt();
                         persegipanjang persegi = new persegipanjang(p,l); 
                         persegi.Display();
                         break;
             case 2  :   System.out.print("Masukkan Jari-jari : "); 
                         int j = c.nextInt();
                         lingkaran lingkaran = new lingkaran(j); 
                         lingkaran.Display();
                         break;
             case 3  :   System.out.print("Masukkan Sisi : "); 
                         int s = c.nextInt();
                         Kubus kubus = new Kubus(s); 
                         kubus.Display();
                         break;
             case 4  :   System.out.print("Masukkan Jari-jari: "); 
                         int jr = c.nextInt();
                         System.out.print("Masukkan Tinggi   : "); 
                         int t = c.nextInt();
                         tabung tabung = new tabung(jr,t);
                         tabung.Display();
                         break;
             case 5  :   status = false; 
                         break;
             default :   System.out.println("Maaf Pilihan Anda Tidak Ditemukan.");
         }
     }
    }
    
}
