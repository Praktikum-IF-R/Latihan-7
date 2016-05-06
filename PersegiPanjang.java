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
public class PersegiPanjang extends Bidang{
int p,l;
    public void setWarna(String w){
        warna=w;
    }
    public void setPP(int p, int l){
       this.p=p;
       this.l=l;
    }
    
    @Override
    public String warna() {
    return warna;
    }

    @Override
    public double Keliling() {
    return (2*(p+l));
    }

    @Override
    public double Luas() {
    return p*l;
    }

    @Override
    public double Volume() {
    return 0;
    }

    @Override
    public void execute() {
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");      
    System.out.println("Warna bidang ini : "+warna);
    System.out.println("Panjang          : "+p);
    System.out.println("Lebar            : "+l);
    System.out.println("Keliling         : "+Keliling());
    System.out.println("Luas             : "+Luas());
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");     
    }
    
}
