package Tugas7;

/**
 *
 * @author wahyuridiansyah
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("--------------------------------------");
        System.out.print("Input Sisi: ");
        double s = in.nextDouble();
        Kubus b1 = new Kubus(s);
        Persegi b2 = new Persegi(s);
        System.out.println("--------------------------------------");
        System.out.print("1. Kubus -> ");
        b1.tampilLuas(b1.luas());
        System.out.print("2. Persegi -> ");
        b2.tampilLuas(b2.luas());
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.print("Input Panjang: ");
        double pan = in.nextDouble();
        System.out.print("Input Lebar: ");
        double leb = in.nextDouble();
        System.out.print("Input Tinggi: ");
        double tin = in.nextDouble();
        PersegiPanjang b3 = new PersegiPanjang(pan, leb);
        Balok b4 = new Balok(pan, leb, tin);
        System.out.println("--------------------------------------");
        System.out.print("1. Persegi Panjang -> ");
        b3.tampilLuas(b3.luas());
        System.out.print("2. Balok -> ");
        b4.tampilLuas(b4.luas());
        System.out.println("--------------------------------------");
    }
}
