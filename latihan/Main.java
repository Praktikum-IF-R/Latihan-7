/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean menu = true;
        int in;
        double a, b, c;
        System.out.println("       PROGRAM HITUNG BANGUN RUANG DAN BANGUN DATAR");
        System.out.println("\n                     DAFTAR PILIHAN");
        System.out.println("1. PERSEGI          5. KUBUS              9. LIMAS SEGIEMPAT");
        System.out.println("2. PERSEGI PANJANG  6. BALOK             10. LIMAS SEGITIGA");
        System.out.println("3. SEGITIGA         7. PRISMA SEGITIGA   11. KERUCUT");
        System.out.println("4. LINGKARAN        8. TABUNG            12. BOLA\n");
        System.out.println("TEKAN 0 UNTUK MENGAKHIRI PROGRAM");
        System.out.println("NOTE : Segitiga Siku-siku\n");
        while (menu) {
            System.out.print("MASUKKAN PILIHAN : ");
            in = scan.nextInt();
            switch (in) {
                case 0:
                    menu = false;
                    System.out.println("\n              PROGRAM SELESAI DIJALANKAN");
                    System.out.println("                    TERIMA KASIH");
                    System.out.println("NIM : 155150201111334");
                    break;
                case 1:
                    System.out.println("KELILING DAN LUAS PERSEGI");
                    System.out.print("Sisi(cm) : ");
                    a = scan.nextDouble();
                    Persegi p = new Persegi(a);
                    System.out.println("\n    Menampilkan Hasil");
                    System.out.println("Keliling : " + p.Keliling() + " cm");
                    System.out.println("Luas     : " + p.Luas() + " cm2");
                    System.out.println("------------------------------------------------------------\n");
                    break;
                case 2:
                    System.out.println("KELILING DAN LUAS PERSEGI PANJANG");
                    System.out.print("Panjang(cm) : ");
                    a = scan.nextDouble();
                    System.out.print("Lebar(cm)   : ");
                    b = scan.nextDouble();
                    PersegiPanjang pp = new PersegiPanjang(a, b);
                    System.out.println("\n    Menampilkan Hasil");
                    System.out.println("Keliling    : " + pp.Keliling() + " cm");
                    System.out.println("Luas        : " + pp.Luas() + " cm2");
                    System.out.println("------------------------------------------------------------\n");
                    break;
                case 3:
                    System.out.println("KELILING DAN LUAS SEGITIGA");
                    System.out.print("Alas(cm)   : ");
                    a = scan.nextDouble();
                    System.out.print("Tinggi(cm) : ");
                    b = scan.nextDouble();
                    Segitiga s3 = new Segitiga(a, b);
                    System.out.println("\n    Menampilkan Hasil");
                    System.out.println("Keliling   : " + s3.Keliling() + " cm");
                    System.out.println("Luas       : " + s3.Luas() + " cm2");
                    System.out.println("------------------------------------------------------------\n");
                    break;
                case 4:
                    System.out.println("KELILING DAN LUAS LINGKARAN");
                    System.out.print("Jari-jari(cm) : ");
                    a = scan.nextDouble();
                    Lingkaran l = new Lingkaran(a);
                    System.out.println("\n    Menampilkan Hasil");
                    System.out.println("Keliling      : " + l.Keliling() + " cm");
                    System.out.println("Luas          : " + l.Luas() + " cm2");
                    System.out.println("------------------------------------------------------------\n");
                    break;
                case 5:
                    System.out.println("VOLUME KUBUS");
                    System.out.print("Sisi(cm) : ");
                    a = scan.nextDouble();
                    Kubus k = new Kubus(a);
                    System.out.println("\n    Menampilkan Hasil");
                    System.out.println("Volume   : " + k.Volume() + " cm3");
                    System.out.println("------------------------------------------------------------\n");
                    break;
                case 6:
                    System.out.println("VOLUME BALOK");
                    System.out.print("Panjang(cm) : ");
                    a = scan.nextDouble();
                    System.out.print("Lebar(cm)   : ");
                    b = scan.nextDouble();
                    System.out.print("Tinggi(cm)  : ");
                    c = scan.nextDouble();
                    Balok bal = new Balok(a, b, c);
                    System.out.println("\n    Menampilkan Hasil");
                    System.out.println("Volume      : " + bal.Volume() + " cm3");
                    System.out.println("------------------------------------------------------------\n");
                    break;
                case 7:
                    System.out.println("VOLUME PRISMA SEGITIGA");
                    System.out.print("Panjang Alas(cm)  : ");
                    a = scan.nextDouble();
                    System.out.print("Lebar Alas(cm)    : ");
                    b = scan.nextDouble();
                    System.out.print("Tinggi Prisma(cm) : ");
                    c = scan.nextDouble();
                    Balok p3 = new Balok(a, b, c);
                    System.out.println("\n    Menampilkan Hasil");
                    System.out.println("Volume            : " + p3.Volume() + " cm3");
                    System.out.println("------------------------------------------------------------\n");
                    break;
                case 8:
                    System.out.println("VOLUME TABUNG");
                    System.out.print("Jari-jari Alas(cm) : ");
                    a = scan.nextDouble();
                    System.out.print("Tinggi Tabung(cm)  : ");
                    b = scan.nextDouble();
                    Tabung t = new Tabung(a, b);
                    System.out.println("\n    Menampilkan Hasil");
                    System.out.println("Volume             : " + t.Volume() + " cm3");
                    System.out.println("------------------------------------------------------------\n");
                    break;
                case 9:
                    System.out.println("VOLUME LIMAS SEGIEMPAT");
                    System.out.print("Panjang Alas(cm) : ");
                    a = scan.nextDouble();
                    System.out.print("Lebar Alas(cm)   : ");
                    b = scan.nextDouble();
                    System.out.print("Tinggi Limas(cm) : ");
                    c = scan.nextDouble();
                    LimasSegiEmpat l4 = new LimasSegiEmpat(a, b, c);
                    System.out.println("\n    Menampilkan Hasil");
                    System.out.println("Volume           : " + l4.Volume() + " cm3");
                    System.out.println("------------------------------------------------------------\n");
                    break;
                case 10:
                    System.out.println("VOLUME LIMAS SEGITIGA");
                    System.out.print("Panjang Alas(cm) : ");
                    a = scan.nextDouble();
                    System.out.print("Lebar Alas(cm)   : ");
                    b = scan.nextDouble();
                    System.out.print("Tinggi Limas(cm) : ");
                    c = scan.nextDouble();
                    LimasSegiTiga l3 = new LimasSegiTiga(a, b, c);
                    System.out.println("\n    Menampilkan Hasil");
                    System.out.println("Volume           : " + l3.Volume() + " cm3");
                    System.out.println("------------------------------------------------------------\n");
                    break;
                case 11:
                    System.out.println("VOLUME KERUCUT");
                    System.out.print("Jari-jari Alas(cm) : ");
                    a = scan.nextDouble();
                    System.out.print("Tinggi Kerucut(cm) : ");
                    b = scan.nextDouble();
                    Kerucut ko = new Kerucut(a, b);
                    System.out.println("\n    Menampilkan Hasil");
                    System.out.println("Volume             : " + ko.Volume() + " cm3");
                    System.out.println("------------------------------------------------------------\n");
                    break;
                case 12:
                    System.out.println("VOLUME BOLA");
                    System.out.print("Jari-jari Bola(cm) : ");
                    a = scan.nextDouble();
                    Bola o = new Bola(a);
                    System.out.println("\n    Menampilkan Hasil");
                    System.out.println("Volume             : " + o.Volume() + " cm3");
                    System.out.println("------------------------------------------------------------\n");
                    break;
            }
        }
    }
}
