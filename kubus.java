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
public class kubus extends persegi {
private int volume;

    public kubus(int sisipersegi, int panjang, int lebar, int tinggibalok) {
        super(sisipersegi, panjang, lebar, tinggibalok);
    }

    public int volume(){
        volume=super.getsisi()*super.getsisi()*super.getsisi();
        System.out.println("Volume Kubus             : "+volume);
    return 0;
    }
    public void kubus(){
        super.keliling();
        super.luas();
        volume();
    }
    
}
