//author @mfrhn18
package polymorfismeVII;
import java.util.Scanner;
public class BangunGeoMain {
    public static void main(String []args){
        Scanner in = new Scanner (System.in);
        double p,l,t,s,r;
        String choose;
        System.out.println("Program Penghitung PINTAR");
        System.out.println("a. Luas & Keliling" + "\nb. Volume");
        System.out.print("Pilihan anda : ");
        choose = in.nextLine();
        if(choose.equalsIgnoreCase("a")){
            int choose2, choose3;
            System.out.println("Anda ingin menghitung luas dari bangun : ");
            System.out.println("1. Persegi" + "\n2. Persegi Panjang" + "\n3. Lingkaran");
            System.out.print("Pilihan anda : ");
            choose2 = in.nextInt();
            if(choose2==1){
                System.out.println("Anda memilih Persegi.");
                System.out.print("Input sisi : ");
                s = in.nextDouble();
                Persegi per = new Persegi(s);
                per.boom();
            }else if(choose2==2){
                System.out.println("Anda memilih Persegi Panjang.");
                System.out.print("Input panjang : ");
                p = in.nextDouble();
                System.out.print("Input lebar   : ");
                l = in.nextDouble();
                PersegiPanjang pp = new PersegiPanjang(p, l);
                pp.boom();
            }else if(choose2==3){
                System.out.println("Anda memilih Lingkaran.");
                System.out.print("Input jari-jari : ");
                r = in.nextDouble();
                Lingkaran li = new Lingkaran(r);
                li.boom();
            }else{
                System.out.println("Your choice isn't available.");
            }
            System.out.println("Thank you for using our program.");
        }else{
            int choose4, choose5;
            System.out.println("Anda ingin menghitung volume dari bangun : ");
            System.out.println("1. Balok" + "\n2. Kubus" + "\n3. Bola");
            System.out.print("Pilihan anda : ");
            choose4 = in.nextInt();
            if(choose4==1){
                System.out.println("Anda memilih Balok.");
                System.out.print("Input panjang   : ");
                p = in.nextDouble();
                System.out.print("Input lebar     : ");
                l = in.nextDouble();
                System.out.print("Input tinggi    : ");
                t = in.nextDouble();
                Balok b = new Balok(p, l, t);
                b.boom();
            }else if(choose4==2){
                System.out.println("Anda memilih Kubus.");
                System.out.print("Input sisi      : ");
                s = in.nextDouble();
                Kubus k = new Kubus(s);
                k.boom();
            }else if(choose4==3){
                System.out.println("Anda memilih Bola.");
                System.out.print("Input jari-jari : ");
                r = in.nextDouble();
                Bola bol = new Bola(r);
                bol.boom();
            }else{
                System.out.println("Your choice isn't available.");
            }
            System.out.println("Thank you for using our program.");
        }
    }
}
