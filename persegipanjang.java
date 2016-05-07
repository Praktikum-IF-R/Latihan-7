package bab7;

public class persegipanjang extends shape2 {

    private int panjang;
    private int lebar;

    public persegipanjang(int p, int l) {
        panjang = p;
        lebar = l;
    }

    public void setPanjang(int p) {
        panjang = p;
    }

    public void setLebar(int l) {
        lebar = l;
    }

    public double getluas() {
        return panjang * lebar;
    }

    public double getkeliling() {
        keliling = 2 * (panjang + lebar);
        return keliling;
    }

    public void show() {
        System.out.println("Luas: " + getluas());
        System.out.println("Keliling: " + getkeliling());

    }

}
