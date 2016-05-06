/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan7;

/**
 *
 * @author Lenovo
 */
public abstract class Bidang {

    private String warna;
    
    public Bidang (String a){
        warna = a;
    }
    abstract public double Luas();
    abstract public double Kell();
    abstract public double Volume();
}
