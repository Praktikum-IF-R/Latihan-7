package bangunangeometri;
public class PersegiPanjang extends Bidang2 {
    private double panjang,lebar,Luas,Keliling;
    
    public PersegiPanjang(){
        
    }
    public PersegiPanjang(double panjang,double lebar){
        this.panjang=panjang;
        this.lebar=lebar;
    }
    public double getpanjang(){
        return panjang;
    }
    public void setpanjang(){
        panjang=panjang;
    }
    public double getlebar(){
        return lebar;
    }
    public void setlebar(){
        lebar=lebar;
    }
    @Override
    public double Luas() {
        Luas=panjang*lebar;
        System.out.println("Luas Persegi Panjang        :"+Luas);
        return Luas;
    }
    @Override
    public double Keliling() {
        Keliling=((2*panjang)+(2*lebar));
        System.out.println("Keliling Persegi Panjang    :"+Keliling);
        return Keliling;
    }
}
