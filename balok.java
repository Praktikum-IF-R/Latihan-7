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
public class balok extends persegipanjang {

    private int volume;

    public balok(int sisipersegi, int panjang, int lebar, int tinggibalok) {
        super(sisipersegi, panjang, lebar, tinggibalok);
    }
    


    public int volume() {
        volume = super.getLebar() * super.getPanjang()*super.getTinggibalok();
        System.out.println("Volume Balok             : " + volume);        
        return 0;
    }

    public void balok() {
        super.keliling();
        super.luas();
        volume();
    }
}
