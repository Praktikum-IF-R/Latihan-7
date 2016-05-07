package latihan7;

public class Kubus extends Persegi  {
    
    public Kubus (String a, int b){
        super(a, b);
    }
    public double Luas(){
        return super.Luas()*6;
    }
    public double Volume(){
        return super.Luas()*super.getSisi();
    }
    public double Keliling(){
        return 0;
    }
    public void Display(){
        System.out.println("Luas\t\t : "+Luas()+" cm2");
        System.out.println("Volume\t\t : "+Volume()+" cm3");
    }
}
