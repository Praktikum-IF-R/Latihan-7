/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class classtest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x=0;
        do{
            System.out.println("===========Program Penghitung Luas dan Volume===========\n"
                    + "1.  Penghitung Luas dan Keliling Persegi\n"
                    + "2.  Penghitung Luas dan Keliling Persegi Panjang\n"
                    + "3.  Penghitung Luas dan Keliling Segitiga\n"
                    + "4.  Penghitung Luas dan Keliling Lingkaran\n"
                    + "5.  Penghitung Volume Kubus\n"
                    + "6.  Penghitung Volume Balok\n"
                    + "7.  Penghitung Volume Prisma Segitiga\n"
                    + "8.  Penghitung Volume Limas Segitiga\n"
                    + "9.  Penghitung Volume Tabung\n"
                    + "10. Penghitung Volume Bola");
            System.out.println("=========================================================");
            System.out.print("Masukkan pilihan (nomor): ");
            int pil = in.nextInt();
            Kubus a = new Kubus();
            Balok b = new Balok();
            Prisma c = new Prisma();
            Limas_Segitiga e = new Limas_Segitiga();
            Tabung d = new Tabung();
            Bola f = new Bola();
            switch(pil){
                case 1:
                    System.out.print("Masukkan sisi: ");
                    int s= in.nextInt();
                    a.setSisi1(s);
                    a.setSisi2(s);
                    a.setLuas();
                    a.setKeliling();
                    System.out.println("Luas persegi adalah "+a.getLuas());
                    System.out.println("Keliling persegi adalah: "+a.getKeliling());
                    break;
                case 2:
                    System.out.print("Masukkan sisi 1: ");
                    int s1= in.nextInt();
                    b.setSisi1(s1);
                    System.out.print("Masukkan sisi 2: ");
                    int s2= in.nextInt();
                    b.setSisi2(s2);
                    b.setLuas();
                    b.setKeliling();
                    System.out.println("Luas persegi adalah "+b.getLuas());
                    System.out.println("Keliling Persegi adalah: "+b.getKeliling());
                    break;
                case 3:
                    System.out.print("Masukkan alas segitiga: ");
                    int al=in.nextInt();
                    System.out.print("Masukkan tinggi segitiga: ");
                    int tg=in.nextInt();
                    c.setAlas(al);
                    c.setTinggi(tg);
                    c.setLuas();
                    c.setKeliling();
                    System.out.println("Luas segitiga adalah: "+c.getLuas());
                    System.out.println("Keliling segitiga adalah: "+c.getKeliling());
                    break;
                case 4:
                    System.out.print("Masukkan jari jari lingkaran: ");
                    int j = in.nextInt();
                    d.setJari(j);
                    d.setLuas();
                    d.setKeliling();
                    System.out.println("Luas lingkaran adalah: "+d.getLuas());
                    System.out.println("Keliling lingkaran adalah: "+d.getKeliling());
                    break;
                case 5:
                    System.out.print("Masukkan sisi kubus: ");
                    int sk = in.nextInt();
                    a.setSisi1(sk);
                    a.setSisi2(sk);
                    a.setLuas();
                    a.setVolum();
                    System.out.println("Volume Kubus adalah: "+a.getVolum());
                    break;
                case 6:
                    System.out.print("Masukkan panjang balok: ");
                    int p = in.nextInt();
                    System.out.print("Masukkan lebar balok: ");
                    int l = in.nextInt();
                    System.out.print("Masukkan tinggi balok: ");
                    int t = in.nextInt();
                    b.setSisi1(p);
                    b.setSisi2(l);
                    b.setTinggi(t);
                    b.setLuas();
                    b.setVolum();
                    System.out.println("Volume Balok adalah: "+b.getVolum());
                    break;
                case 7:
                    System.out.print("Masukkan alas segitiga: ");
                    int as = in.nextInt();
                    System.out.print("Masukkan tinggi segitiga: ");
                    int ts = in.nextInt();
                    System.out.print("Masukkan tinggii prisma: ");
                    int tp = in.nextInt();
                    c.setAlas(as);
                    c.setTinggi(ts);
                    c.setTinggip(tp);
                    c.setVolum();
                    System.out.println("Volume prisma segitiga adalah: "+c.getVolum());
                    break;
                case 8:
                    System.out.print("Masukkan alas segitiga: ");
                    int as2 = in.nextInt();
                    System.out.print("Masukkan tinggi segitiga: ");
                    int ts2 = in.nextInt();
                    System.out.print("Masukkan tinggi limas: ");
                    int tl = in.nextInt();
                    e.setAlas(as2);
                    e.setTinggi(ts2);
                    e.setTinggiL(tl);
                    e.setVolum();
                    System.out.println("Volume Limas segitiga adalah: "+e.getVolum());
                    break;
                case 9:
                    System.out.print("Masukkan jari jari alas tabung: ");
                    int at = in.nextInt();
                    System.out.print("Masukan tinggi tabung: ");
                    int tt = in.nextInt();
                    d.setJari(at);
                    d.setTinggi(tt);
                    d.setVolum();
                    System.out.println("Volume tabung adalah: "+d.getVolum());
                    break;
                case 10:
                    System.out.println("Masukkan jari jari bola: ");
                    int jb = in.nextInt();
                    f.setJari(jb);
                    f.setLuas();
                    f.setVolum();
                    System.out.println("Volume bola adalah: "+f.getVolum());
                    break;
                default:
                    System.out.println("Menu tidak tersedia!");
            }
            System.out.print("Apakah ingin menghitung lagi?(y/n) ");
            String loop = in.next();
            System.out.println("=========================================================");
            if(loop.equalsIgnoreCase("y")){
                x=0;}
            else{
                System.out.println("======================Terimakasih!=======================");
                x=1;}
        }
        while(x==0);
    }
    
}
