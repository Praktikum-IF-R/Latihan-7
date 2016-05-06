/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan7;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("\tProgram Aritmatika");
        System.out.println("1. Bangun 2 Dimensi");
        System.out.println("2. Bangun 3 Dimensi");
        System.out.print("Masukkan pilihan : ");
        int c = x.nextInt();
        System.out.println();
        if(c==1){
            System.out.println("Pilihan Bangun");
            System.out.println("1. Persegi");
            System.out.println("2. Lingkaran");
            System.out.print("Masukkan pilihan : ");
            int a = x.nextInt();
            switch(a){
                case 1 : System.out.print("Warna bangun : ");
                         String w = x.next();
                         System.out.print("Panjang sisi : ");
                         int s = x.nextInt();
                         Persegi p1 = new Persegi(w,s);
                         p1.Kell();
                         p1.Luas();
                         p1.Display();break;
                case 2 : System.out.print("Warna bangun : ");
                         String d = x.next();
                         System.out.print("Panjang jari2 : ");
                         double r = x.nextDouble();
                         Lingkaran l1 = new Lingkaran(d,r);
                         l1.Kell();
                         l1.Luas();
                         l1.Display();break;
                default : System.exit(0);break;
            }
        }else if(c==2){
            System.out.println("Pilihan Bangun");
            System.out.println("1. Kubus");
            System.out.println("2. Tabung");
            System.out.print("Masukkan pilihan : ");
            int b = x.nextInt();
            switch(b){
                case 1 : System.out.print("Warna bangun : ");
                         String w = x.next();
                         System.out.print("Panjang sisi : ");
                         int s = x.nextInt();
                         Kubus k1 = new Kubus(w,s);
                         k1.Luas();
                         k1.Volume();
                         k1.Display();break;
                case 2 : System.out.print("Warna bangun : ");
                         String d = x.next();
                         System.out.print("Panjang jari2 : ");
                         double r = x.nextDouble();
                         System.out.print("Tinggi Tabung : ");
                         int v = x.nextInt();
                         Tabung t1 = new Tabung(d,r,v);
                         t1.Luas();
                         t1.Volume();
                         t1.Display();break;
                default : System.exit(0);break;
            }
        }
    }
}
