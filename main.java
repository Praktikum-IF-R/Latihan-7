package bab7;

import java.util.*;

public class main {
  public static void main(String[] args) {
       Scanner v = new Scanner(System.in);
        boolean pilih= true;
        while(pilih){
         System.out.println("\t\tPilih yang akan di hitung");
         System.out.println("1.Persegi");
         System.out.println("2.Persegi Panjang");
         System.out.println("3.Kubus");
         System.out.println("4.Bola");
         System.out.println("5.out");
         System.out.print("pilih : ");
         int pilihan = v.nextInt();
         switch(pilihan){
             case 1  :   System.out.print("Masukkan sisi : "); 
                         int sisi = v.nextInt();
                         persegi p = new persegi(sisi); 
                         p.show();
                         break;
             case 2  :   System.out.print("Masukkan panjang : "); 
                         int panjang = v.nextInt();
                         System.out.print("Masukkan Lebar :");
                         int lebar = v.nextInt();
                         persegipanjang d = new persegipanjang(p,l); 
                         d.show();
                         break;
             case 3  :   System.out.print("Masukkan Sisi : "); 
                         int s = v.nextInt();
                         kubus k = new kubus(s); 
                         k.show();
                         break;
             case 4  :   System.out.print("Masukkan Jari-jari: "); 
                         int jarijari = v.nextInt();
                         bola b = new bola(jarijari);
                         b.show();
                         break;
             case 5  :   pilih = false; 
                         break;
             default :   System.out.println("tidak ada dalam pilihan ");
         }
     }
    }
    
}    

