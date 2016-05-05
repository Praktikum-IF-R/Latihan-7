/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB7.latihan;

import java.util.*;

public class mainClass {

    static private int k;
    static private int i;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        geometri geo[] = new geometri[4];

        System.out.println("mau menghitung apa ? \n1. kubus \n2. tabung \n3. lingkaran \n4. persegi\n====================");
        i = in.nextInt();

        switch (i) {
            case 1:
                System.out.println("masukan sisi : ");
                double p = in.nextDouble();
                geo[0] = new kubus(p);
                break;
            case 2:
                System.out.println("masukan tinggi : ");
                double t = in.nextDouble();
                System.out.println("masukan jari jari : ");
                double j = in.nextDouble();
                geo[1] = new tabung(t, j);
                break;
            case 3:
                System.out.println("masukkan jari jari : ");
                double k = in.nextDouble();
                geo[2] = new lingkaran(k);
                break;
            case 4:
                System.out.println("masukkan panjang ; ");
                double l = in.nextDouble();
                System.out.println("masukkan lebar : ");
                double h = in.nextDouble();
                geo[3] = new persegi(l, h);
                break;
            default:
                System.out.println("masukkan anda salah, run lagi");
                System.exit(1);

        }
        if (i <= 2) {
            System.out.println("mau menghitung apa \n1. volume \n2. luas permukaan\n===================");
        } else if (i > 2 && i <= 4) {
            System.out.println("mau menghitung apa \n1. luas \n2. keliling\n====================");
        }
        k = in.nextInt();
        if (k == 1) {
            System.out.println("hasilnya : " + geo[i - 1].getPerhitungan1());
        } else if (k == 2) {
            System.out.println("hasilnya : " + geo[i - 1].getPerhitungan2());
        } else {
            System.out.println("what do you meannn ??? ohh... uohhhh.. #justin_bieber");
        }
    }
}
