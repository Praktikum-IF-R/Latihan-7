/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidang;

/**
 *
 * @author LENY
 */
public abstract class Bidang {
    private int sisipersegi;
    private int panjang;
    private int lebar;
    private int tinggibalok;

    public Bidang(int sisipersegi, int panjang, int lebar,  int tinggibalok) {
        this.sisipersegi = sisipersegi;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggibalok = tinggibalok;
    }
    
    public int getsisi(){
        return sisipersegi;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public int getTinggibalok() {
        return tinggibalok;
    }
    public abstract int keliling();
    public abstract int luas();
   
}
