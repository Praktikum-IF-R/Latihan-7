/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan7;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class mainbangun {
    public static void main(String[] args) {
        String jwb;
        Scanner masuk=new Scanner(System.in);
        do {
            System.out.print("program perhitungan bangun\n1. 2D\n2. 3D\nmasukan pilihan anda: ");
            int pil=masuk.nextInt();
            switch(pil){
                case 1: System.out.println("====================================");
                    System.out.print("program perhitungan bangun 2D\n1. persegi\n2. lingkaran\nmasukan pilihan anda: ");
                    int pul=masuk.nextInt();
                    switch(pul){
                        case 1:System.out.print("masukan panjang sisi: ");
                            double sisi=masuk.nextDouble();
                            persegi d=new persegi(sisi);
                            d.tampil();break;
                        case 2:System.out.print("masukan jari jari: ");
                            double r=masuk.nextDouble();
                            Lingkaran a=new Lingkaran(r);
                            a.tampil();break;
                    }break;
                case 2:System.out.println("===================================="); 
                    System.out.print("program perhitungan bangun 3D\n1. kubus\n2. tabung\n3. kerucut\nmasukan pilihan anda: ");
                    int pal=masuk.nextInt();
                    switch(pal){
                        case 1:System.out.print("masukan panjang sisi: ");
                            double sisi=masuk.nextDouble();
                            kubus e=new kubus(sisi);;
                            e.tampil();break;
                        case 2:System.out.print("masukan jari jari: ");
                            double r=masuk.nextDouble();
                            System.out.print("masukan tinggi: ");
                            double t=masuk.nextDouble();
                            tabung c=new tabung(r,t);
                            c.tampil();break;
                        case 3: System.out.print("masukan jari jari: ");
                            double rr=masuk.nextDouble();
                            System.out.print("masukan tinggi: ");
                            double tt=masuk.nextDouble();
                            kerucut b=new kerucut(rr,tt);
                            b.tampil();break;
                    }
            } 
            System.out.print("apakah ingin mengulang program(y/n)? ");
            jwb=masuk.next();
            System.out.println("====================================");
        }while (jwb.equalsIgnoreCase("y"));
    }
}
    
