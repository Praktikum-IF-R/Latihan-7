
package bidang;


public class Balok extends Bidang {
    int p,l,t;
    public void setWarna(String w){
        warna=w;
    }
    public void setPP(int p, int l, int t){
       this.p=p;
       this.l=l;
       this.t=t;
    }

    @Override
    public String warna() { return warna;
    }

    @Override
    public double Keliling() { return 0;
    }

    @Override
    public double Luas() {return 0;}

    @Override
    public double Volume() {
        return p*l*t;
    }

    @Override
    public void execute() {
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");    
    System.out.println("Warna bidang ini : "+warna);
    System.out.println("Panjang          : "+p);
    System.out.println("Lebar            : "+l);
    System.out.println("Tinggi           : "+t);
    System.out.println("Volume           : "+Volume());
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");    
    }
    
}
