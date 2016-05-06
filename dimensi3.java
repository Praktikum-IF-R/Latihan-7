package latihan7;

public class dimensi3 extends geometri{

    protected double a, b, t;
    protected int dimensi3;

    public dimensi3(double a, double b, double t, int dimensi3) {
        this.a = a;
        this.b = b;
        this.t=t;
        this.dimensi3=dimensi3;
    }

    public int hitung() {
        if (dimensi3==1) {
            double volume = a * b * b *t;
            System.out.println("Volume bola\t: " + volume);
        }
        if (dimensi3==2) {
            double volume = a * b *t;
            System.out.println("Volume balok\t: " + volume);
        }
        return 0;

    }
    public double Show() {
        return hitung();
    }

}
