package Polimorfisme;
import java.util.Scanner;
public class MainGeometri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pil;
        do{
        System.out.println("======Geometri======");
        System.out.println("Menu hitung :");
        System.out.println("1. Kubus");
        System.out.println("2. Persegi");
        System.out.println("3. Tabung tertutup");
        System.out.println("4. Lingkaran");
        System.out.print("Pilih no : ");
        int men = in.nextInt();
        if (men == 1){
            System.out.print("sisi = ");
            Kubus ku = new Kubus();
            double sisi = in.nextDouble();
            ku.setLuas(sisi);
            ku.setVolume(sisi);
            System.out.println("Luas = "+ku.getLuas());
            System.out.println("Volume = "+ku.getVolume());
        }else if (men == 2){
            System.out.print("sisi = ");
            Persegi pe = new Persegi();
            double sisi = in.nextDouble();            
            pe.setLuas(sisi);
            pe.setKeliling(sisi);
            System.out.println("Luas = "+pe.getLuas());
            System.out.println("Keliling = "+pe.getKeliling());
        }else if (men == 3){
            System.out.print("Jari = ");
            double r = in.nextDouble();
            System.out.print("Tinggi = ");
            double t = in.nextDouble();
            Tabung ta = new Tabung();
            ta.setLuas(r, t);
            ta.setVolume(r, t);
            System.out.println("Luas = "+ta.getLuas());
            System.out.println("Volume = "+ta.getVolume());
        }else if (men == 4){
            System.out.print("Jari = ");
            double r = in.nextDouble();
            Lingkaran li = new Lingkaran();
            li.setLuas(r);
            li.setKeliling(r);
            System.out.println("Luas = "+li.getLuas());
            System.out.println("Keliling = "+li.getKeliling());
        }
            System.out.println("==========================");
            System.out.println("Hitung lagi (y/n)?");
            pil = in.next();
        }while(pil.equalsIgnoreCase("y"));
        System.out.println("Terima Kasih");
    }
}
