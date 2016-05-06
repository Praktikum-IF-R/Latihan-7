/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometri;
import java.util.Scanner;
/**
 *
 * @author Fauzi Reza Pahlevi
 */
public class MainGeometri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int pilih;  
        do {  
            System.out.println("================================");  
            System.out.println(" Welcome to Geometri Programme");  
            System.out.println("================================");
            System.out.println("1. 2 Dimension");  
            System.out.println("2. 3 Dimension");  
            System.out.println("3. Exit");  
            System.out.print("Choose : ");  
            pilih = input.nextInt();  
            System.out.println("================================");
            switch (pilih) {  
                case 1:  
                    System.out.println("1. Rectangle");  
                    System.out.println("2. Round");  
                    System.out.println("3. Back");  
                    System.out.print("choose : ");  
                    int pilih2 = input.nextInt();  
                    switch (pilih2) {  
                        case 1:  
                            System.out.print("Masukkan sisi Persegi : ");  
                            double s = input.nextDouble();
                            Rectangle persegi = new Rectangle(s);
                            persegi.tampil();
                            break;  
                        case 2:  
                            System.out.print("Masukkan  jari-jari : ");  
                            double rr = input.nextDouble();
                            Round lingkaran = new Round(rr);
                            lingkaran.tampil();  
                            break;  
                    }  
                    break;  
                case 2:  
                    System.out.println("1. Kubus");  
                    System.out.println("2. Tabung");  
                    System.out.println("3. Kembali");  
                    System.out.print("Pilihan : ");  
                    int pilih3 = input.nextInt();  
                    switch (pilih3) {  
                        case 1:  
                            System.out.print("Masukkan Rusuk Kubus : ");  
                            double ru = input.nextDouble();
                            Cube kubus = new Cube(ru);
                            kubus.getVolume();  
                            kubus.display();  
                            break;  
                        case 2:  
                            System.out.print("Masukkan Jari - jari Tabung : ");  
                            double rr = input.nextDouble();  
                            System.out.print("Masukkan Tinggi Tabung      : ");  
                            double t = input.nextDouble();  
                            Tube tabung = new Tube(rr,t);
                            tabung.setTinggi(t);
                            tabung.display();                              break;  
                    }  
                    break;  
            }  
        }while(pilih <3);  
     } 

}