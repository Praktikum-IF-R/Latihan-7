/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolimorfismeBAB7;

/**
 *
 * @author DS
 */
//subclass tiga dimensi
public class TigaDimensi extends Geometri {

    public double jari, sisi, tinggi, panjang, lebar;

    @Override
    public double getLuas() {
        return luas;
    }

    public double getVolume() {
        return volume;
    }

}
