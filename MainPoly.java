
package latihan7;

import java.util.Scanner;

public class MainPoly {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PersegiPanjang p = new PersegiPanjang();
        Balok b = new Balok();
        persegi pp = new persegi();
        Kubus k = new Kubus();
        String pilihan;
        do{
        System.out.println("1. Menghitung Balok");
        System.out.println("2. Menghitung Persegi panjang");
        System.out.println("3. Menghitung Kubus");
        System.out.println("4. Menghitung Persegi");
        System.out.print("Masukkan pilihan anda : ");
        int pil = in.nextInt();
        if (pil == 1){
            System.out.print("Masukkan Panjang : ");
            b.setPanjang(in.nextInt());
            System.out.print("Masukkan lebar   : ");
            b.setLebar(in.nextInt());
            System.out.print("masukkan tinggi  : ");
            b.setTinggi(in.nextInt());
            System.out.println("******BALOK******");
            System.out.println(b.display());
        }
        else if (pil == 2){
            System.out.print("Masukkan Panjang : ");
            p.setPanjang(in.nextInt());
            System.out.print("Masukkan lebar   : ");
            p.setLebar(in.nextInt());
            System.out.println("***PERSEGI PANJANG***");
            System.out.println(p.display());
        }
        else if (pil == 3){
            System.out.print("Masukkan Sisi : ");
            k.setSisi(in.nextInt());
            System.out.println("*****KUBUS*****");
            System.out.println(k.display());
        }
        else if(pil == 4){
            System.out.print("Masukkan sisi : ");
            pp.setSisi(in.nextInt());
            System.out.println("*****PERSEGI*****");
            System.out.println(pp.display());
        }
            System.out.println("*******************");
            System.out.print("Melakukan perhitungan lagi ? (y/t) : ");
            pilihan = in.next();
    }while(!pilihan.equalsIgnoreCase("t"));
        }
}
