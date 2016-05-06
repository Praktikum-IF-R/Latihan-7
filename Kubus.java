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
public class Kubus extends Bidang{
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
        return 0;
    }

    @Override
    public double Luas() {
        return 0;
    }

    @Override
    public double Volume() {
    return sisi*sisi*sisi;   
    }
    @Override
    public void execute() {
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");    
    System.out.println("Warna bidang ini : "+warna);
    System.out.println("Sisi             : "+sisi);
    System.out.println("Volume           : "+Volume());
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");    
 }
    
}
