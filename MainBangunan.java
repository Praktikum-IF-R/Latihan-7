package Bab7LT;

import java.util.Scanner;
public class MainBangunan {
    public static void main(String[] args){
       Scanner fd = new Scanner(System.in);
       double pp,lp,pb,lb,tb;
        
       System.out.println("======PROGRAM MENGHITUNG LUAS, KELILING, DAN VOLUME======"); 
       System.out.println("1.\tPersegi Panjang");
       System.out.println("2.\tBalok");
       String pil2;
       do{
       System.out.print("Masukkan pilihan anda : ");
       int pil = fd.nextInt();
       switch(pil){
           case 1 : 
               System.out.print("Masukkan panjang : ");
               pp = fd.nextDouble();
               System.out.print("Masukkan lebar   : ");
               lp = fd.nextDouble();
               PersegiPanjang p = new PersegiPanjang(pp, lp);
               System.out.println("Luas\t\t : "+p.LuasPersegi());
               System.out.println("Keliling\t : "+p.KelilingPersegi());
               System.out.println("======================================");
               break;
           case 2 : 
               System.out.print("Masukkan panjang : ");
               pb = fd.nextDouble();
               System.out.print("Masukkan lebar   : ");
               lb = fd.nextDouble();
               System.out.print("Masukkan tinggi  : ");
               tb = fd.nextDouble();
               Balok b = new Balok(pb,lb,tb);
               System.out.println("Volume\t\t : "+b.VolumeBalok());
               System.out.println("L. Permukaan\t : "+b.LuasPBalok());
               System.out.println("======================================");
               break;
       }
       System.out.print("Pilihan lain? (Y/N) : ");
       pil2 = fd.next();
       }while(pil2.equalsIgnoreCase("Y"));
    }
    
}
