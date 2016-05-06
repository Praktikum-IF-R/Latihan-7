
package latihan7;

public class Kubus extends Polymorphism{
    int sisi, volume;
    
    public void setSisi(int sisi){
        this.sisi = sisi;
    }
    public int getSisi(){
        return sisi;
    }
    @Override
    public int luas(){
        return luas = 6 * sisi*sisi;
    }
    @Override
    public int keliling(){
        return keliling = 12 * sisi;
    }
    public int volume(){
        return volume = sisi * sisi * sisi;
    }
    @Override
    public String display(){
        return super.display()+"\nVolume \t : "+volume();
    
    }
}
