package latihan7;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String lagi;
        do {
            System.out.println("\n\tPROGRAM PENGHITUNGAN GEOMETRI\n");
            System.out.println("1.2 Dimensi\n2.3 Dimensi\n");
            System.out.print("Masukkan pilihan Anda : ");
            int pilihan = in.nextInt();
            System.out.println("");
            if (pilihan == 1) {
                System.out.println("1.Lingkaran\n2.Persegi panjang\n");
                System.out.print("Masukkan pilihan Anda\t: ");
                int dimensi2 = in.nextInt();
                if (dimensi2 == 1) {
                    System.out.print("Masukkan jari-jari : ");
                    double jari = in.nextDouble();
                    dimensi2 a = new lingkaran(3.14, jari, dimensi2);
                    System.out.println("=============================================");
                    a.Show();
                    System.out.println("=============================================");
                } else if (dimensi2 == 2) {
                    System.out.print("Masukkan panjang\t:");
                    double panjang = in.nextDouble();
                    System.out.print("Masukkan lebar\t\t:");
                    double lebar = in.nextDouble();
                    dimensi2 b = new persegipanjang(panjang, lebar, dimensi2);
                    System.out.println("=============================================");
                    b.Show();
                    System.out.println("=============================================");
                } else {
                    System.out.println("Perintah yang Anda masukkan salah\n");
                }
            } else if (pilihan == 2) {
                System.out.println("1.bola\n2.balok\n");
                System.out.print("Masukkan pilihan Anda : ");
                int dimensi3 = in.nextInt();
                if (dimensi3 == 1) {
                    System.out.print("Masukkan jari-jari\t: ");
                    double jari = in.nextDouble();
                    dimensi3 c = new bola(3.14, jari, 1.33, dimensi3);
                    System.out.println("=============================================");
                    c.Show();
                    System.out.println("=============================================");
                } else if (dimensi3 == 2) {
                    System.out.print("Masukkann panjang\t: ");
                    double panjang = in.nextDouble();
                    System.out.print("Masukkan lebar\t\t: ");
                    double lebar = in.nextDouble();
                    System.out.print("Masukkan tinggi\t\t: ");
                    double tinggi = in.nextInt();
                    dimensi3 d = new balok(panjang, lebar, tinggi, dimensi3);
                    System.out.println("=============================================");
                    d.Show();
                    System.out.println("=============================================");
                } else {
                    System.out.println("Perintah yang Anda masukkan salah\n");
                }
            } else {
                System.out.println("Perintah yang Anda masukkan salah\n");
            }
            System.out.print("Apakah Anda ingin menghitung lagi ?\n(ya/tidak) : ");
            lagi = in.next();
        } while (!lagi.equalsIgnoreCase("tidak"));
    }
}
