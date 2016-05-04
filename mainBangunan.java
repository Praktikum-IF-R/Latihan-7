package Latihan7;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class mainBangunan {

    public static void main(String[] args) {
        Scanner inint = new Scanner(System.in);
        Scanner instring = new Scanner(System.in);

        Bangunan bangunan[] = new Bangunan[4];
        String o = null;
        do {
            JOptionPane.showMessageDialog(null, "Pilih 1 dari 2 Bangunan dibawah:"
                    + "\n1. Persegi Panjang"
                    + "\n2. Lingkaran"
                    + "\n3. Keluar", "2 Macam Bangunan", JOptionPane.PLAIN_MESSAGE);

            int x = Integer.valueOf(JOptionPane.showInputDialog("Masukkan Pilihan anda: "));

            switch (x) {
                case 1:
                    JOptionPane.showMessageDialog(null, "- - - -Penghitungan Persegi Panjang- - - -");
                    int p = Integer.valueOf(JOptionPane.showInputDialog("Masukkan Panjang   : "));
                    int l = Integer.valueOf(JOptionPane.showInputDialog("Masukkan lebar     : "));
                    bangunan[0] = new PersegiPanjang(p, l);
                    JOptionPane.showMessageDialog(null, "Luasnya         : " + bangunan[0].getLuas()
                            + "\nKelilingnya     : " + bangunan[0].getKeliling());
                    String yt = String.valueOf(JOptionPane.showInputDialog("Implementasikan Ke Balok ? (Y/T) ?"));
                    if (yt.equalsIgnoreCase("Y")) {
                        int t = Integer.valueOf(JOptionPane.showInputDialog("Masukkan Tinggi : "));
                        Bangunan bal = new Balok(p, l, t);
                        JOptionPane.showMessageDialog(null, "Volumenya   : " + bal.getVolume());

                        System.out.println("PERSEGI PANJANG");
                        System.out.println("Luasnya         : " + bangunan[0].getLuas());
                        System.out.println("Kelilingnya     : " + bangunan[0].getKeliling());
                        System.out.println("- - - - - - - - - - - - - - - - - - - - -");
                        System.out.println("BALOK");
                        System.out.println("Volumenya   : " + bal.getVolume());
                        System.out.println("- - - - - - - - - - - - - - - - - - - - -");
                    }
                    break;

                case 2:
                    System.out.println("");
                    JOptionPane.showMessageDialog(null, "- - - -Penghitungan Lingkaran- - - -");
                    int r = Integer.valueOf(JOptionPane.showInputDialog("Masukkan Jari-Jari: "));
                    Lingkaran ling = new Lingkaran(r);
                    JOptionPane.showMessageDialog(null, "Luasnya         : " + ling.getLuas()
                                                    + "\nKelilingnya     : " + ling.getKeliling());

                    System.out.println("LINGKARAN");
                    System.out.println("Luasnya         : " + ling.getLuas());
                    System.out.println("Kelilingnya     : " + ling.getKeliling());
                    System.out.println("- - - - - - - - - - - - - - - - - -");

                    String yt2 = String.valueOf(JOptionPane.showInputDialog("Impementasikan Ke Kerucut ? (Y/T)  : "));
                    if (yt2.equalsIgnoreCase("Y")) {
                        JOptionPane.showMessageDialog(null, "- - - -IMPLEMENTASI KE KERUCUT- - - -");
                        int tk = Integer.valueOf(JOptionPane.showInputDialog("Masukkan Tinggi Kerucut: "));
                        Kerucut keru = new Kerucut(r, tk);
                        keru.setTinggiKerucut(tk);
                        JOptionPane.showMessageDialog(null, "Luas Alasnya        : " + keru.getLuasAlas()
                                + "\nLuas Selimutnya     : " + keru.getLuasSelimut()
                                + "\nLuas Permukaannya   : " + keru.getLuasPermukaan()
                                + "\nVolumenya           : " + keru.getVolume());

                        System.out.println("KERUCUT");
                        System.out.println("Luas Alasnya        : " + keru.getLuasAlas());
                        System.out.println("Luas Selimutnya     : " + keru.getLuasSelimut());
                        System.out.println("Luas Permukaannya   : " + keru.getLuasPermukaan());
                        System.out.println("Volumenya           : " + keru.getVolume());
                        System.out.println("- - - - - - - - - - - - - - - - - - -");
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "PILIHAN TIDAK ADA");
                    break;
            }
            o = String.valueOf(JOptionPane.showInputDialog(null, "MENU UTAMA? (Y/T)"));
        } while (o.equalsIgnoreCase("Y"));
        System.out.println("");

    }

}
