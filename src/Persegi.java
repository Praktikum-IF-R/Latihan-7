/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Persegi extends Bangunan {
    private double Luas;
    private int sisi1;
    private int sisi2;
    private double keliling;
    public void setLuas() {
        this.Luas=sisi1*sisi2;
    }
    public double getLuas() {
        return Luas;
    }

    public int getSisi1() {
        return sisi1;
    }

    public void setSisi1(int sisi1) {
        this.sisi1 = sisi1;
    }
    public int getSisi2() {
        return sisi2;
    }

    public void setSisi2(int sisi2) {
        this.sisi2 = sisi2;
    }
    public void setKeliling() {
        this.keliling=(sisi1+sisi2)*2;
    }
    public double getKeliling() {
        return keliling;
    }
        
}
