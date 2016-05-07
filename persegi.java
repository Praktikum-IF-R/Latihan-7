package bab7;

public  class persegi extends bangun2d{

    private int sisi;

  

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    public persegi (int sisi){
        
    }

    public double getluas() {
        return sisi * sisi;
    }

    public double getkeliling() {
        keliling = 4 * sisi;
        return keliling;
    }

    public void print() {
        System.out.println("Luas: " + getluas());
        System.out.println("Keliling: " + getkeliling());
        System.out.println("------------------------");
    }
}
