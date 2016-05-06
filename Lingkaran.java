/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidang;

/**
 *
 * @author Asus Laptop
 */
public class Lingkaran extends Bidang {
double jari;
    public void setWarna(String w){
        warna=w;
    }
    @Override
    public String warna() {
        return warna;
    }
    public void setJari(double jari ){
        this.jari=jari;
    }
    public double getJari(){
        return jari;
    }
    @Override
    public double Keliling() {
        return Math.PI*jari*2;
    }

    @Override
    public double Luas() {
      return Math.PI*jari*jari;
    }

    @Override
    public double Volume() {
     return 0;  
    }

    @Override
    public void execute() {
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");        
    System.out.println("Warna bidang ini : "+warna);
    System.out.println("Jari-jari        : "+jari);
    System.out.println("Keliling         : "+Keliling());
    System.out.println("Luas             : "+Luas());
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");    
 }
    
}
