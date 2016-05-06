
package bidang;

import java.util.*;
public class MainBidang {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("        PROGRAM PERHITUNGAN BIDANG           ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        Lingkaran a= new Lingkaran();
        Bola b = new Bola();
        Persegi c= new Persegi();
        Kubus d = new Kubus ();
        PersegiPanjang e= new PersegiPanjang();
        Balok f= new Balok();
        String pil;
        System.out.print("Masukkan pilihan anda 2 Dimensi/ 3 Dimensi :  ");
        pil= in.next();
        if (pil.equalsIgnoreCase("2")){
            System.out.print("Masukkan bangun 2 dimensi : ");
            String pili= in.next();
            if (pili.equalsIgnoreCase("Persegi")){
                System.out.print("Masukkan warna bidang : ");
                String warna = in.next();
                c.setWarna(warna);
                System.out.print("Masukkan sisi persegi : ");
                int sisi = in.nextInt();
                c.setSisi(sisi);
                c.getSisi();
                c.execute();
            }
            else if (pili.equalsIgnoreCase("Lingkaran")){
             System.out.print("Masukkan warna bidang : ");
                String warna = in.next();
                a.setWarna(warna);
                System.out.print("Masukkan jari-jari lingkaran : ");
                double jari  = in.nextInt();
                a.setJari(jari);
                a.getJari();
                a.execute();
        }
            else if (pili.equalsIgnoreCase("PersegiPanjang")){
                System.out.print("Masukkan warna bidang : ");
                String warna = in.next();
                e.setWarna(warna);
                System.out.print("Masukkan panjang persegi panjang : ");
                int p= in.nextInt();
                System.out.print("Masukkan lebar persegi panjang : ");
                int l= in.nextInt();
                e.setPP(p, l);
                e.execute();
            }
        }
            else if (pil.equalsIgnoreCase("3")){
                System.out.print("Masukkan bangun 3 dimensi : ");
                String pilih= in.next();
            if (pilih.equalsIgnoreCase("Kubus")){
                System.out.print("Masukkan warna bidang : ");
                String warna = in.next();
                d.setWarna(warna);
                System.out.print("Masukkan sisi kubus : ");
                int sisi = in.nextInt();
                d.setSisi(sisi);
                d.getSisi();
                d.execute();
            }
            else if (pilih.equalsIgnoreCase("Bola")){
             System.out.print("Masukkan warna bidang : ");
                String warna = in.next();
                b.setWarna(warna);
                System.out.print("Masukkan jari-jari Bola : ");
                double jari  = in.nextInt();
                b.setJari(jari);
                b.getJari();
                b.execute();
        }
            else if (pilih.equalsIgnoreCase("Balok")){
                System.out.print("Masukkan warna bidang : ");
                String warna = in.next();
                f.setWarna(warna);
                System.out.print("Masukkan panjang Balok : ");
                int p= in.nextInt();
                System.out.print("Masukkan lebar Balok : ");
                int l= in.nextInt();
                System.out.print("Masukkan tinggi Balok : ");
                int t = in.nextInt();
                f.setPP(p, l, t);
                f.execute();
            }
            }    
} 
}

