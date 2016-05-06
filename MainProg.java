/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_enam;
import java.util.Scanner;
/**
 *
 * @author Rexy
 */
public class MainProg {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean stat = true;
        System.out.println("-------Program Menghitung Bangun Geometri--------");
        while(stat){
            System.out.println("Menu Penghitungan Bangun");
            System.out.println("1.Persegi (2D)");
            System.out.println("2.Lingkaran(2D)");
            System.out.println("3.Tabung (3D)");
            System.out.println("4.Kubus (3D)");
            System.out.println("Pilihan anda : ");
            int x = scn.nextInt();
            System.out.println("Kami Harap Pilihan anda tidak salah :)");
            switch (x){
                case 1:
                    System.out.println("Anda Memilih Persegi!");
                    System.out.println("Masukkan sisi Persegi : ");
                    int a = scn.nextInt();
                    Persegi bidang1 = new Persegi(a);
                    bidang1.getLuasPer();
                    
                    break;
                case 2:
                System.out.println("Anda Memilih Lingkaran!");
                    System.out.println("Masukkan Jari-Jari Lingkaran : ");
                    int b = scn.nextInt();
                    Lingkaran bidang2 = new Lingkaran(b);
                    bidang2.getLuasLing();
                    
                    
            
            
            
            }
        }
    }
    
}
