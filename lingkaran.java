package bab7;

public class lingkaran extends bangun2d {

    private int jari;

    public lingkaran(int jari) {
        this.jari = jari;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }

    public double getluas() {
        luas = 3.14 * jari * jari;
        return luas;
    }

    public double getkeliling() {
        keliling = 2 * 3.14 * jari;
        return keliling;
    }

    public void print() {
        System.out.println("Luas: " + getluas());
        System.out.println("Keliling: " + getkeliling());
        System.out.println("------------------------");

    }
}