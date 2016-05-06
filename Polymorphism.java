
package latihan7;

public abstract class Polymorphism {
    
    int luas, keliling;
    
    public abstract int luas();
   
    public abstract int keliling();
    
    public  String display(){
        return "Luas \t : "+luas()+"\nKeliling : "+keliling();
    }
    
}
