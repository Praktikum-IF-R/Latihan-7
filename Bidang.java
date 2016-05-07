package bidang;

public abstract class Bidang {
    private String warna;
    
    public Bidang(String w){
        warna = w;
    }
    
    public void setWarna(String w){
        warna = w;
    }
    
    public String getWarna(){
        return warna;
    }
    
    public abstract double Luas();
    
    public abstract double Keliling();
    
    public void display(){
        System.out.println("Warna :"+warna);
    }
    
    
    
    
}
