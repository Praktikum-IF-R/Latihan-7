package bidang;

import java.util.Scanner;

public class mainBidang {

    public static void main(String[] args) {
        int p,p2,s;
        double r,t;
        String w,pp;
        boolean cek=true;
        
        Scanner in = new Scanner(System.in);
        Scanner inn = new Scanner(System.in);
        
        System.out.println("Bangun Datar & Bangun Ruang");
        System.out.println("1.Bangun Datar (2D)");
        System.out.println("2.Bangun Ruang (3D)");
        
        do{
        System.out.print("Masukan Pilihan Anda :");
        p = in.nextInt();
        
            switch(p){
            case 1 :
                System.out.println("\nBangun Datar (2D)");
                System.out.println("1.Lingkaran");
                System.out.println("2.Persegi");
                
                do{
                System.out.print("Masukan Pilihan Anda :");
                p2 = in.nextInt();
                
                switch(p2){
                    case 1:
                        System.out.print("\nMasukan Warna Lingkaran:");
                        w = inn.next();
                        Lingkaran lingkaran = new Lingkaran(w);
                        System.out.print("Masukan Jari-Jari      :");
                        r = in.nextDouble();
                        lingkaran.setR(r);
                        System.out.println("======================");
                        lingkaran.display();
                        System.out.println("======================\n");
                        break;
                    case 2:
                        System.out.print("\nMasukan Warna Persegi:");
                        w = inn.next();
                        Persegi persegi = new Persegi(w);
                        System.out.print("Masukan Panjang Sisi :");
                        s = in.nextInt();
                        persegi.setSisi(s);
                        System.out.println("======================");
                        persegi.display();
                        System.out.println("======================\n");
                        break;     
                }
                    System.out.print("Pilih Bidang 2D Lain ?(y/n)");
                    pp = inn.next();
                        
                    if(pp.equalsIgnoreCase("y"))
                        cek = true;
                    else
                        cek = false;
                        
                }while(cek!=false);
                
                
            break;
                
            
            case 2 :
                System.out.println("\nBangun Ruang (3D)");
                System.out.println("1.Bola");
                System.out.println("2.Tabung");
                System.out.println("3.Kubus");
                
                do{
                System.out.print("Masukan Pilihan Anda :");
                p2 = in.nextInt();
                
                switch(p2){
                    case 1:
                        System.out.print("\nMasukan Warna Bola     :");
                        w = inn.next();
                        Bola bola = new Bola(w);
                        System.out.print("Masukan Jari-Jari      :");
                        r = in.nextDouble();
                        bola.setR(r);
                        System.out.println("======================");
                        bola.display();
                        System.out.println("======================\n");
                        break;
                    case 2:
                        System.out.print("\nMasukan Warna Tabung   :");
                        w = inn.next();
                        Tabung tabung = new Tabung(w);
                        System.out.print("Masukan Jari-Jari      :");
                        r = in.nextDouble();
                        System.out.print("Masuka Tinggi          :");
                        t = in.nextDouble();
                        tabung.setR(r);
                        tabung.setT(t);
                        System.out.println("======================");
                        tabung.display();
                        System.out.println("======================\n");
                        break;
                    case 3:
                        System.out.print("\nMasukan Warna Kubus    :");
                        w = inn.next();
                        Kubus kubus = new Kubus(w);
                        System.out.print("Masukan Panjang Sisi   :");
                        s = in.nextInt();
                        kubus.setSisi(s);
                        System.out.println("======================");
                        kubus.display();
                        System.out.println("======================\n");
                        break;
                }
                
                    System.out.print("Pilih Bidang 3D Lain ?(y/n)");
                        pp = inn.next();
                        
                        if(pp.equalsIgnoreCase("y"))
                            cek = true;
                        else
                            cek = false;
                        
                }while(cek!=false);
              
            break;
            }
            System.out.print("Pilih Bidang Lain ?(y/n)");
            pp = inn.next();
                        
            if(pp.equalsIgnoreCase("y"))
                cek = true;
            else
                cek = false;
            
        }while(cek!=false);
    }
}
        

