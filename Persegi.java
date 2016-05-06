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
public class Persegi extends Bidang {
int sisi;
   public void setWarna(String w){
        warna=w;
    }
    @Override
    public String warna() {
        return warna;
    }
    public void setSisi(int sisi ){
        this.sisi=sisi;
    }
    public int getSisi(){
        return sisi;
    }

    @Override
    public double Keliling() {
        return 4*sisi*sisi;
    }

    @Override
    public double Luas() {
       return sisi*sisi;
    }

    @Override
    public double Volume() {
        return 0;
    }
    @Override
    public void execute() {
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");      
    System.out.println("Warna bidang ini : "+warna);
    System.out.println("Sisi             : "+sisi);
    System.out.println("Keliling         : "+Keliling());
    System.out.println("Luas             : "+Luas());
   System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");    
 }
    
}
