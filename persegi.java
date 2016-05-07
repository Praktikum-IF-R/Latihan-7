package bab7;

public  class persegi extends shape2 {

    private int sisi;

    
    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public persegi(int s) {
        sisi = s;

    }

    public double getluas() {
        return sisi * sisi;
    }

    public double getkeliling() {
        keliling = 4 * sisi;
        return keliling;
    }

    public void show() {
        System.out.println("Luas: " + getluas());
        System.out.println("Keliling: " + getkeliling());

    }
}
