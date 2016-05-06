package polimorfisme;
import java.util.*;
public class Polimorfisme {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("===================================================================");
        System.out.println("                        POLIMORFISME");
        System.out.println("===================================================================");
        int plh;
        String lagi;
        do{
        System.out.println("                        Menu Pilihan");
        System.out.println("No\t||\t\tBangunan\t\t||\tDimensi\t||");
        System.out.println("1\t||\t\tPersegi Panjang\t\t||\t2\t||");
        System.out.println("2\t||\t\tBelah Ketupat\t\t||\t2\t||");
        System.out.println("3\t||\t\tBalok\t\t\t||\t3\t||");
        System.out.println("4\t||\t\tPrisma\t\t\t||\t3\t||");
        System.out.println("5\t||   \t\t\tKELUAR PROGRAM");
        System.out.print("Masukan Nomor Pilihan\t\t\t: ");
        plh=in.nextInt();
        switch(plh){
            case 1:
                System.out.println("==========Persegi Panjang===========");
                System.out.print("Masukan Panjang           : ");
                double pnjng=in.nextDouble();
                System.out.print("Masukan Lebar             : ");
                double lbr=in.nextDouble();
                pPanjang A=new pPanjang(pnjng,lbr);
                System.out.println("====================================");
                System.out.println("Luas                    : "+A.Luas(00));
                System.out.println("Keliling                : "+A.Keliling(00));
                break;
            case 2:
                System.out.println("===========Belah Ketupat============");
                System.out.print("Masukan Sisi              : ");
                double s=in.nextDouble();
                System.out.print("Masukan Diagonal 1        : ");
                double d1=in.nextDouble();
                System.out.print("Masukan Diagonal 2        : ");
                double d2=in.nextDouble();
                bKetupat B=new bKetupat(s,d1,d2);
                System.out.println("====================================");
                System.out.println("Luas                    : "+B.Luas(00));
                System.out.println("Keliling                : "+B.Keliling(00));
                break;
            case 3:
                System.out.println("============= BALOK ================");
                System.out.print("Masukan Panjang           : ");
                int p=in.nextInt();
                System.out.print("Masukan Lebar             : ");
                int l=in.nextInt();
                System.out.print("Masukan Tinggi            : ");
                int t=in.nextInt();
                Balok C=new Balok(p,l,t);
                System.out.println("=====================================");
                System.out.println("Luas                    : "+C.Luas(00));
                System.out.println("Volume                  : "+C.Volum(00));
                break;
            case 4:
                System.out.println("============= PRISMA ================");
                System.out.print("Masukan Luas Alas         : ");
                int luas=in.nextInt();
                System.out.print("Masukan Keliling          : ");
                int kel=in.nextInt();
                System.out.print("Masukan Tinggi            : ");
                int tinggi=in.nextInt();
                Prisma D=new Prisma(luas,kel,tinggi);
                System.out.println("=====================================");
                System.out.println("Luas                    : "+D.Luas(00));
                System.out.println("Volume                  : "+D.Volum(00));
                break;
            case 5:
                System.out.println("Terima Kasih");
                break;
        }
            System.out.println("Lakukan Lagi?(y/t)\t\t\t: ");
            lagi=in.next();
        }while(lagi.equalsIgnoreCase("y"));
    }
    
}
