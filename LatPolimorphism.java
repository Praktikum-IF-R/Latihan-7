/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latpolimorphism;

/**
 *
 * @author ANITA
 */
public class LatPolimorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bidang2 bid2 = new Lingkaran();
        bidang3 bid3 = new Bola();
        
        Lingkaran ling = new Lingkaran();
        Lingkaran ling2 = new Lingkaran(7);
        
        Bola bola = new Bola();
        Bola bola2 = new Bola(14);
        
        bid2.warna("Merah");
        bid3.warna("Biru");
        
        //objek lingkaran 1
        ling.setjari(14);
        System.out.println("Warna lingkaran 1        : "+bid2.getwarna());
        System.out.println("Jari - jari lingkaran 1  : "+ling.getjari());
        System.out.println("Luas lingkaran 1         : "+(int)ling.Luas());
        System.out.println("Keliling lingkaran 1     : "+(int)ling.Keliling());
        System.out.println("");
        
        //objek lingkaran 2
        System.out.println("Jari - jari lingkaran 1  : "+ling2.getjari());
        System.out.println("Luas lingkaran 1         : "+(int)ling2.Luas());
        System.out.println("Keliling lingkaran 1     : "+(int)ling2.Keliling());
        System.out.println("");
        
        //objek bola 1
        bola.setjari(7);
        System.out.println("Warna bola 1             : "+bid3.getwarna());
        System.out.println("Jari - jari bola 1       : "+bola.getjari());
        System.out.println("Volume bola 1            : "+(int)bola.Volume());
        System.out.println("");
        
        //objek bola 2
        System.out.println("Jari - jari bola 1       : "+bola2.getjari());
        System.out.println("Volume bola 1            : "+(int)bola2.Volume());
        System.out.println("");
                
    }
    
}
