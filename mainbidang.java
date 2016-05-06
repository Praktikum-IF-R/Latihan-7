/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidang;

import java.util.Scanner;

/**
 *
 * @author LENY
 */
public class mainbidang {
    public static void main(String[] args) {
        Scanner a= new Scanner (System.in);
        System.out.println("=========================================");
        System.out.print("Sisi Persegi             : ");
        int sisipersegi= a.nextInt();
        System.out.print("Panjang Persegi Panjang  : ");
        int panjang= a.nextInt();
        System.out.print("Lebar Persegi Panjang    : ");
        int lebar= a.nextInt();
        System.out.print("Tinggi Balok             : ");
        int tinggibalok= a.nextInt();
        System.out.println("=========================================");
        System.out.println("=========================================");
        kubus c= new kubus(sisipersegi, panjang, lebar, tinggibalok);
        c.kubus();
        balok d= new balok(sisipersegi, panjang, lebar,  tinggibalok );
        d.balok();
        System.out.println("=========================================");
    }
}
