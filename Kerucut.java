package Latihan7;

public class Kerucut extends Lingkaran {

    private double Volume;
    private static double sisimiring;
    private static double luasselimut;
    private double tinggikerucut;
    private double luaspermukaan;

    public Kerucut(double r, double tk) {
        super(r);
        tinggikerucut = tk;
    }

    public void setTinggiKerucut(double t) {
        tinggikerucut = t;
    }

    public double getTinggiKerucut() {
        return tinggikerucut;
    }

    public double getLuasAlas() {
        return super.getLuas();
    }


    public double getLuasPermukaan() {
        luaspermukaan += getLuasAlas() + getLuasSelimut();
        return luaspermukaan;
    }

    public double getPitagoras() {
        sisimiring += Math.sqrt((tinggikerucut * tinggikerucut) + (getJarijari() * getJarijari()));
    return sisimiring;}


    public double getLuasSelimut() {
        luasselimut += 3.14 * (getJarijari() * getPitagoras());
        return luasselimut;
    }

    public void Volume() {
        Volume = ((getJarijari() * getJarijari()) * tinggikerucut) / 3;
    }

    public double getVolume() {
        Volume = ((getJarijari() * getJarijari()) * tinggikerucut) / 3;
        return Volume;
    }

}
