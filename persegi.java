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
public class persegi extends Bidang {
private int luas;
private int keliling;

    public persegi(int sisipersegi, int panjang, int lebar, int tinggibalok) {
        super(sisipersegi, panjang, lebar, tinggibalok);
    }
    public int luas(){
        luas= super.getsisi()*super.getsisi();
        System.out.println("Luas Persegi             : "+luas);
    return 0;
    }
    public int keliling(){
        keliling=4*super.getsisi();
        System.out.println("Keliling Persegi         : "+keliling);
    return 0;
    }
    
    
    
}
