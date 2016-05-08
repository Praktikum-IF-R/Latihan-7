/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poly;

/**
 *
 * @author imgeek
 */
import java.util.*;

public class MainP {

    public static void main(String[] args) {
        Scanner nuel = new Scanner(System.in);
        int menu, menu2dim, menu3dim;
        do {
            System.out.println("======= Bangun 2 Dimensi & 3 Dimensi=======");
            System.out.println("Menu : ");
            System.out.println("1. 2 Dimensi");
            System.out.println("2. 3 Dimensi");
            System.out.println("3. Keluar");

            System.out.print("Input Menu : ");
            menu = nuel.nextInt();
            switch (menu) {
                case 1:
                    do {
                        System.out.println("====Bangun 2 Dimensi====");
                        System.out.println("1. Luas & Keliling Persegi Panjang");
                        System.out.println("2. Luas & Keliling Belah Ketupat");
                        System.out.println("3. Kembali Ke menu Awal ");
                        System.out.print("Input Menu : ");
                        menu2dim = nuel.nextInt();
                        switch (menu2dim) {
                            case 1:
                                System.out.println("Luas & Keliling Persegi Panjang");
                                System.out.print("Input Panjang : ");
                                double panj = nuel.nextDouble();
                                System.out.print("Input Lebar : ");
                                double leb = nuel.nextDouble();
                                PersergiPanjang p = new PersergiPanjang(panj, leb);
                                p.hasil();
                                break;
                            case 2:
                                System.out.println("Luas & Keliling Belah Ketupat");
                                System.out.print("Input Panjang sisi : ");
                                double sisi = nuel.nextDouble();
                                System.out.print("Input panjang diagonal 1 :");
                                double dia1 = nuel.nextDouble();
                                System.out.print("Input panjang diagonal 2 : ");
                                double dia2 = nuel.nextDouble();
                                BelahKetupat b = new BelahKetupat(sisi, dia1, dia2);
                                b.hasil();
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Menu Tidak ada, Input lagi...");
                                break;
                        }
                    } while (menu2dim == 3);

                case 2:
                    do {
                        System.out.println("====Bangun 3 Dimensi====");
                        System.out.println("1. Luas & Volume Bola");
                        System.out.println("2. Luas & Volume Tabung");
                        System.out.println("3. Kembali Ke Menu Awal.");
                        System.out.print("Input Menu : ");
                        menu3dim = nuel.nextInt();
                        switch (menu3dim) {
                            case 1:
                                System.out.println("Luas & Volume Bola");
                                System.out.print("Input Jari-jari : ");
                                double r = nuel.nextDouble();
                                Bola bol = new Bola(r);
                                bol.hasil();
                                break;
                            case 2:
                                System.out.println("Luas & Volume Tabung");
                                System.out.print("Input jari-jari : ");
                                double jari = nuel.nextDouble();
                                System.out.print("Input tinggi : ");
                                double ting = nuel.nextDouble();
                                Tabung t = new Tabung(jari, ting);
                                t.hasil();
                                break;
                            case 3:
                                break;
                        }
                    } while (menu3dim != 3);

            }

        } while (menu != 3);
    }
}
