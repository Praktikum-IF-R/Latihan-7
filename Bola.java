/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidang;

public class Bola extends Bidang {
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
        return 0;
    }

    @Override
    public double Luas() {
       return 0;
    }

    @Override
    public double Volume() {
       return 4/3*Math.PI*jari*jari;
    }
    @Override
    public void execute() {
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");     
    System.out.println("Warna bidang ini : "+warna);
    System.out.println("Jari-jari        : "+jari);
    System.out.println("Volume           : "+Volume());
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");    
 }
    
}
