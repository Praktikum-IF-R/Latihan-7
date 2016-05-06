package bangunangeometri;
import java.util.Scanner;
public class MainBidang {
    
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        String ulangi;
        do{
        System.out.println("-----------------------------------------------------------");
        System.out.println("<<Penghitungan Luas,keliling Bidang 2 dan Volume Bidang 3>>");
        System.out.println("-----------------------------------------------------------");
        System.out.println("1.Segitiga \n2.Balok \n3.Persegi Panjang \n4.Kubus");
        System.out.print("Mau Menghitung Apa : ");
        int pilihan =input.nextInt();
        
        if (pilihan == 1){
            System.out.println("--------------------------");
            System.out.println("Luas Dan Keliling Segitiga");
            System.out.println("--------------------------");
            System.out.print("Masukan alas      : ");
            int alas=input.nextInt();
            System.out.print("Masukan tinggi    : ");
            int tinggi=input.nextInt();
            System.out.print("Masukan Sisi      : ");
            int sisi=input.nextInt();
            System.out.println("------------------------------");
            Bidang2 segi3=new Segitiga(alas,tinggi,sisi);
            System.out.println("Warna Segitiga : "+segi3.getWarna());
            segi3.Luas();
            segi3.Keliling();
            System.out.println("------------------------------------");
            System.out.println("Segitiga Termaksud di dalam Bidang 2");
            System.out.println("------------------------------------");
        } else if(pilihan == 2){
            System.out.println("------------------------------");
            System.out.println("Volume Balok");
            System.out.println("------------------------------");
            System.out.print("Masukan panjang   : ");
            int panjang=input.nextInt();
            System.out.print("Masukan Lebar     : ");
            int lebar =input.nextInt();
            System.out.print("Masukan Tinggi    : ");
            int tinggi=input.nextInt();
            System.out.println("------------------------------");
            Bidang3 balok= new Balok(panjang,lebar,tinggi);
            System.out.println("Warna Balok: "+balok.getWarna());
            balok.Volume();
            System.out.println("---------------------------------");
            System.out.println("Balok Termaksud di dalam Bidang 3");
            System.out.println("---------------------------------");
        }else if(pilihan == 3){
            System.out.println("---------------------------------");
            System.out.println("Luas Dan Keliling Persegi Panjang");
            System.out.println("---------------------------------");
            System.out.print("Masukan panjang   : ");
            int panjang=input.nextInt();
            System.out.print("Masukan Lebar     : ");
            int lebar=input.nextInt();
            System.out.println("------------------------------");
            Bidang2 PP=new PersegiPanjang(panjang,lebar);
            System.out.println("Warna Persegi Panjang : "+PP.getWarna());
            PP.Luas();
            PP.Keliling();
            System.out.println("-------------------------------------------");
            System.out.println("Persegi Panjang Termaksud di dalam Bidang 2");
            System.out.println("-------------------------------------------");
        }else if(pilihan == 4){
            System.out.println("------------------------------");
            System.out.println("Volume Kubus");
            System.out.println("------------------------------");
            System.out.print("Masukan Sisi  : ");
            int sisi=input.nextInt();
            System.out.println("------------------------------");
            Bidang3 kubus=new Kubus(sisi);
            System.out.println("Warna Kubus : "+kubus.getWarna());
            kubus.Volume();
            System.out.println("---------------------------------");
            System.out.println("Kubus Termaksud di dalam Bidang 3");
            System.out.println("---------------------------------");
        }else{    
            System.out.println("Mau Menghitung Apa Sih ......\nPilihan yang kamu pilih itu tidak tertera di menu");
        }
        System.out.print("Apakah Anda Akan Menghitung Kembali ?(Y/N) : ");
        ulangi = input.next();
   } while (!ulangi.equalsIgnoreCase("N"));   
        System.out.println("Anda Sudah Keluar Dari Program Penghitung Luas,Keliling dan Volume");
        }
    }   