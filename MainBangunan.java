package bangunan;
import java.util.Scanner;
public class MainBangunan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan1;
        do {
            System.out.println("--------------------------------");
            System.out.println("    Program Bangun Geometri");
            System.out.println("--------------------------------");
            System.out.println("1. Geometri 2D");
            System.out.println("2. Geometri 3D");
            System.out.println("3. Keluar");
            System.out.print("Pilihan : ");
            pilihan1 = input.nextInt();
            System.out.println("--------------------------------");
            switch (pilihan1) {
                case 1:
                    System.out.println("1. Persegi");
                    System.out.println("2. Lingkaran");
                    System.out.println("3. Kembali");
                    System.out.print("Pilihan : ");
                    int pilihan2 = input.nextInt();
                    switch (pilihan2) {
                        case 1:
                            System.out.print("Masukkan Rusuk Persegi : ");
                            double ru = input.nextDouble();
                            Persegi persegi = new Persegi(ru);
                            persegi.Luas();
                            persegi.Keliling();
                            persegi.Display();
                            break;
                        case 2:
                            System.out.print("Masukkan Panjang Jejari : ");
                            double r = input.nextDouble();
                            Lingkaran lingkaran = new Lingkaran(r);
                            lingkaran.Luas();
                            lingkaran.Keliling();
                            lingkaran.Display();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1. Kubus");
                    System.out.println("2. Tabung");
                    System.out.println("3. Kembali");
                    System.out.print("Pilihan : ");
                    int pilihan3 = input.nextInt();
                    switch (pilihan3) {
                        case 1:
                            System.out.print("Masukkan Rusuk Kubus : ");
                            double ru = input.nextDouble();
                            Kubus kubus = new Kubus(ru);
                            kubus.Volume();
                            kubus.Display();
                            break;
                        case 2:
                            System.out.print("Masukkan Jejari Tabung : ");
                            double r = input.nextDouble();
                            System.out.print("Masukkan Tinggi Tabung : ");
                            double t = input.nextDouble();
                            Tabung tabung = new Tabung(r,t);
                            tabung.Volume();
                            tabung.Display();
                            break;
                    }
                    break;
            }
        }while(pilihan1 <3);
    }
}