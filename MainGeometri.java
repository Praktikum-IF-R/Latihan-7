/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolimorfismeBAB7;

import java.util.Scanner;

/**
 *
 * @author DS
 */
public class MainGeometri {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pilihan;
        do {
            System.out.println("#******* PERHITUNGAN GEOMETRI BANGUN *******#");
            System.out.println("------- DUA DIMENSI DAN TIGA DIMENSI --------");
            System.out.println("*********************************************");
            System.out.println("terdapat 2 pilihan dimensi gan");
            System.out.println("1. 2 DIMENSI");
            System.out.println("2. 3 DIMENSI");
            System.out.println();
            System.out.print("Pilih no : ");
            int no = in.nextInt();
            System.out.println("----------------------------------------------");
            switch (no) {
                case 1:
                    System.out.println("Berikut bangun 2 dimensi");
                    System.out.println("1. PERSEGI");
                    System.out.println("2. LINGKARAN");
                    System.out.println("3. PERSEGI PANJANG");
                    System.out.println("ingin menghitung bangun nomor ?");
                    int a = in.nextInt();
                    System.out.println("----------------------------------------------");
                    if (a == 1) {
                        System.out.println("~~~~~~~~~~~~~ PERSEGI ~~~~~~~~~~~~~~~~~~");
                        System.out.print("masukkan sisi = ");
                        Persegi g1 = new Persegi();
                        double sisi = in.nextDouble();
                        g1.setKeliling(sisi);
                        g1.setLuas(sisi);
                        System.out.println("Berikut Hasilnya ");
                        System.out.println("Keliling    = " + g1.getKeliling());
                        System.out.println("Luas        = " + g1.getLuas());
                    } else if (a == 2) {
                        System.out.println("~~~~~~~~~~~~ LINGKARAN ~~~~~~~~~~~~~~~~");
                        System.out.print("Masukkan jari - jari = ");
                        double jari = in.nextDouble();
                        Lingkaran g2 = new Lingkaran();
                        g2.setKeliling(jari);
                        g2.setLuas(jari);
                        System.out.println("Berikut hasilnya ");
                        System.out.println("Keliling    = " + g2.getKeliling());
                        System.out.println("Luas        = " + g2.getLuas());
                    } else if (a == 3) {
                        System.out.println("~~~~~~~~~~ PERSEGI PANJANG ~~~~~~~~~~~~~");
                        System.out.print("Masukkan Panjang = ");
                        double panjang = in.nextDouble();
                        System.out.print("Masukkan lebar   = ");
                        double lebar = in.nextDouble();
                        PersegiPanjang PP = new PersegiPanjang();
                        PP.setKeliling(panjang, lebar);
                        PP.setLuas(panjang, lebar);
                        System.out.println("Berikut hasilnya ");
                        System.out.println("Keliling    = " + PP.getKeliling());
                        System.out.println("Luas        = " + PP.getLuas());
                    }
                    break;
                case 2:
                    System.out.println("berikut bangun 3 dimensi");
                    System.out.println("1. KUBUS");
                    System.out.println("2. BOLA");
                    System.out.println("3. BALOK");
                    System.out.println("ingin menghitung bangun nomor ?");
                    int b = in.nextInt();
                    System.out.println("----------------------------------------------");
                    if (b == 1) {
                        System.out.println("~~~~~~~~~~~~~~~ KUBUS ~~~~~~~~~~~~~~~~~~~~~");
                        System.out.print("masukkan sisi = ");
                        Kubus g3 = new Kubus();
                        double sisi = in.nextDouble();
                        g3.setLuas(sisi);
                        g3.setVolume(sisi);
                        System.out.println("berikut hasilnya");
                        System.out.println("Luas        = " + g3.getLuas());
                        System.out.println("Volume      = " + g3.getVolume());
                    } else if (b == 2) {
                        System.out.println("~~~~~~~~~~~~~~~ BOLA ~~~~~~~~~~~~~~~~~~~~");
                        System.out.print("masukkan jari - jari = ");
                        double jari = in.nextDouble();
                        Bola g4 = new Bola();
                        g4.setLuas(jari);
                        g4.setVolume(jari);
                        System.out.println("Luas        = " + g4.getLuas());
                        System.out.println("Volume      = " + g4.getVolume());

                    } else if (b == 3) {
                        System.out.println("~~~~~~~~~~~~~~~~ BALOK ~~~~~~~~~~~~~~~~~~~~");
                        System.out.print("Masukkan Panjang  = ");
                        double panjang = in.nextDouble();
                        System.out.print("masukkan lebar    = ");
                        double lebar = in.nextDouble();
                        System.out.print("masukkan tinggi   = ");
                        double tinggi = in.nextDouble();
                        Balok B = new Balok();
                        B.setLuas(panjang, lebar, tinggi);
                        B.setVolume(panjang, lebar, tinggi);
                        System.out.println("Luas        = " + B.getLuas());
                        System.out.println("Volume      = " + B.getVolume());
                    }
                    break;
                default:
                    System.out.println("maaf pilihan tidak ada");
                    break;
            }

            System.out.println("----------------------------------------------");
            System.out.println("ingin hitung lagi (y/n)?");
            pilihan = in.next();
        } while (pilihan.equalsIgnoreCase("y"));
        System.out.println("--------------------------------------------------");
        System.out.println("            PERHITUNGAN SELESAI");
        System.out.println("--------------------------------------------------");
    }

}
