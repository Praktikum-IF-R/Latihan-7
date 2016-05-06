package bangunruang;
public class Segitiga extends BangunRuang {
protected double alas;
protected double tinggi;
    public Segitiga(String w, int n, double a, double t) {
        super(w, n);
        setAlas(a);
        setTinggi(t);
    }
public void setAlas(double a){
    alas=a;
}
public double getAlas(){
    return alas;
} 
public void setTinggi(double t){
    tinggi=t;
}
public double getTinggi(){
    return tinggi;
}
public double sisiMiring(){
    return Math.sqrt(Math.pow(alas,2)+Math.pow(tinggi,2));
}
    @Override
    public double getLuas() {
return alas*tinggi/2;
    }

    @Override
    public double getKeliling() {
    return getAlas()+getTinggi()+sisiMiring();
    }

    @Override
    public double getVolume() {
    return 0;
    }
   public void displayMessage(){
       System.out.println("Bangun Ruang Segitiga");
       System.out.println("Bangun ruang no "+super.getNoBangunRuang()+"Memiliki warna "+super.getWarna());
       System.out.println("Memiliki alas :"+getAlas());
       System.out.println("Memiliki tinggi :"+getTinggi());
       System.out.println("Memiliki Luas :"+getLuas());
       System.out.println("Memiliki Keliling :"+getKeliling());
   }

            
    
}
