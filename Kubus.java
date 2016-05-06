package bangunangeometri;
public class Kubus extends Bidang3  {
    private double sisi,Volume;
    
    public Kubus(){
        
    }
    public Kubus(double sisi){
        this.sisi=sisi;
    }
    public double getsisi(){
        return sisi;
    }
    public void setsisi(double sisi){
        sisi=sisi;
    }
   
    @Override
    public double Volume() {
        Volume=sisi*sisi*sisi;
        System.out.println("Volume Balok    :"+Volume);
        return Volume;
    }

}
