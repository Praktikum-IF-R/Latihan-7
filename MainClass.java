package latihan7;
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PersegiPanjang pp = new PersegiPanjang();
        Balok b = new Balok();
        Lingkaran lingkaran = new Lingkaran();
        Bola bola = new Bola();
        System.out.println("==============================================================");
        System.out.println("Program Penghitungan Luas, Keliling dan Volume Bangun Geometri");
        System.out.println("==============================================================");
        System.out.println("1. Hitung luas Persegi Panjang");
        System.out.println("2. Hitung keliling Persegi Panjang");
        System.out.println("3. Hitung volume Balok");
        System.out.println("4. Hitung luas Lingkaran");
        System.out.println("5. Hitung keliling Lingkaran");
        System.out.println("6. Hitung volume Bola");
        System.out.print("Pilihan anda: ");
        int x = in.nextInt();
        System.out.println("==============================================================");
        switch(x){
            case 1:
                System.out.print("Masukan panjang: ");
                double p = in.nextDouble();
                System.out.print("Masukan lebar: ");
                double l = in.nextDouble();
                System.out.print("Pilihan warna untuk persegi panjang: ");
                String w = in.next();
                System.out.println("==============================================================");
                pp.PersegiPanjang(p, l);
                pp.PersegiPanjang(w);
                System.out.println("Persegi panjang memiliki luas: "+pp.Luas());
                System.out.println("Persegi panjang memiliki warna: "+pp.color());
                break;
            case 2:
                System.out.print("Masukan panjang: ");
                double p2 = in.nextDouble();
                System.out.print("Masukan lebar: ");
                double l2 = in.nextDouble();
                System.out.print("Pilihan warna untuk persegi panjang: ");
                String w2 = in.next();
                System.out.println("==============================================================");
                pp.PersegiPanjang(p2, l2);
                pp.PersegiPanjang(w2);
                System.out.println("Persegi panjang memiliki keliling: "+pp.Keliling());
                System.out.println("Persegi panjang memiliki warna: "+pp.color());
                break;
            case 3:
                System.out.print("Masukkan panjang: ");
                double pan = in.nextDouble();
                System.out.print("Masukkan lebar: ");
                double leb = in.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double t = in.nextDouble();
                System.out.print("Pilihan warna untuk persegi panjang: ");
                String w3 = in.next();
                b.Balok(pan,leb,t);
                b.Balok(w3);
                System.out.println("==============================================================");
                System.out.println("Balok memiliki volume: "+b.Volume());
                System.out.println("Balok memiliki warna: "+b.color());
                break;
            case 4:
                System.out.print("Masukkan jari-jari: ");
                double r = in.nextDouble();
                System.out.print("Pilihan warna untuk lingkaran: ");
                String w4 = in.next();
                lingkaran.Lingkaran(r);
                lingkaran.Lingkaran(w4);
                System.out.println("==============================================================");
                System.out.printf("Lingkaran memiliki luas: %.2f"+lingkaran.Luas());
                System.out.println();
                System.out.println("Lingkaran memiliki warna: "+lingkaran.color());
                break;
            case 5:
                System.out.print("Masukkan jari-jari: ");
                double r2 = in.nextDouble();
                System.out.print("Pilihan warna untuk lingkaran: ");
                String w5 = in.next();
                lingkaran.Lingkaran(r2);
                lingkaran.Lingkaran(w5);
                System.out.println("==============================================================");
                System.out.printf("Lingkaran memiliki keliling: %.2f"+lingkaran.Keliling());
                System.out.println();
                System.out.println("Lingkaran memiliki warna: "+lingkaran.color());
                break;
            case 6:
                System.out.print("Masukkan jari-jari: ");
                double r3 = in.nextDouble();
                System.out.print("Pilihan warna untuk bola: ");
                String w6 = in.next();
                bola.Bola(r3);
                bola.Bola(w6);
                System.out.println("==============================================================");
                System.out.printf("Bola memiliki volume: %.2f",bola.Volume());
                System.out.println();
                System.out.println("Bola memiliki warna: "+bola.color());
                break;
        }
}
}