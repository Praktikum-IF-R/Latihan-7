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
public class persegipanjang extends Bidang {
private int luas;
private int keliling;

    public persegipanjang(int sisipersegi, int panjang, int lebar, int tinggibalok) {
        super(sisipersegi, panjang, lebar,  tinggibalok );
    }
    public int luas(){
        luas= super.getPanjang()*super.getLebar();
        System.out.println("Luas Persegi Panjang     : "+luas);
    return 0;
    }
    public int keliling(){
        keliling=(2*super.getPanjang())+(2*super.getLebar());
        System.out.println("Keliling Persegi Panjang : "+keliling);
    return 0;
    }
    
}
