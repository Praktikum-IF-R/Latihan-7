package latihan7;

public class dimensi2 extends geometri{

    protected double a, b;
    protected int dimensi2;

    public dimensi2(double a, double b,int dimensi2) {
        this.a = a;
        this.b = b;
        this.dimensi2=dimensi2;
    }

    public int hitung() {
        if (dimensi2==1) {
            double luas = a * b * b;
            double keliling = 2 * a * b;
            System.out.println("Luas lingkaran\t\t: " + luas);
            System.out.println("Keliling lingkaran\t: " + keliling);
        }
        if (dimensi2==2) {
            double luas = a * b;
            double keliling = 2 * (a + b);
            System.out.println("Luas persegi panjang\t\t: " + luas);
            System.out.println("Keliling persegi panjang\t: " + keliling);
        }
        return 0;

    }
    @Override
    public double Show() {
        return hitung();
    }

}
