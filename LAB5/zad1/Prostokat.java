import java.lang.Math;

public class Prostokat {
    double dlugosc, szerokosc;

    public Prostokat(double dlugosc, double szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public double Pole(){
        return dlugosc*szerokosc;
    }
    public double Obwod(){
        return 2*dlugosc+2*szerokosc;
    }
    public double Przekatna(){
        return Math.sqrt(Math.pow(dlugosc,2)+Math.pow(szerokosc,2));
    }



    public void wypisz() {
        System.out.println( "Prostokat{" +
                "dlugosc=" + dlugosc +
                ", szerokosc=" + szerokosc +
                '}');
    }



}
