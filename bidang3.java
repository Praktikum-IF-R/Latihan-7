/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latpolimorphism;

/**
 *
 * @author ANITA
 */
public abstract class bidang3 extends BidGeometri{
    private String warna;
    
    @Override
    public void warna(String w) {
        warna = w;
    }
    
    public String getwarna(){
        return warna;
    }
    
    public abstract double Volume();
    
}
