package latihan7;

public abstract class geometri {

    private double luas, keliling, volume;

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public double getLuas() {
        return luas;
    }

    public abstract double keliling();

    public abstract double volume();

    public double Show() {
        return getLuas();
    }
}
