import java.lang.Object;

public class Gatunek {
    public
        String nazwa_rodzaju, nazwa_gatunku, opis;
        double l_ch2n, l_chx;

    public Gatunek(String nazwa_rodzaju, String nazwa_gatunku, String opis, double l_ch2n, double l_chx) {
        this.nazwa_rodzaju = nazwa_rodzaju;
        this.nazwa_gatunku = nazwa_gatunku;
        this.opis = opis;
        this.l_ch2n = l_ch2n;
        this.l_chx = l_chx;
    }

    public void wypisz() {
        System.out.println( "Gatunek{" +
                "nazwa_rodzaju='" + nazwa_rodzaju + '\'' +
                ", nazwa_gatunku='" + nazwa_gatunku + '\n' +
                ", opis='" + opis + '\n' +
                ", liczba chromosomów 2n=" + l_ch2n +
                ", liczba chromosomów x=" + l_chx +
                '}');
    }

    public String getFullName(){
        return "Rodzaj i gatunek: "+nazwa_rodzaju+" "+nazwa_gatunku;
    }

    public double getHaploid(){
        double result = l_chx/2;
        return result;
    }

    public void cloneObj(Gatunek obj){
        this.nazwa_rodzaju=obj.nazwa_rodzaju;
        this.nazwa_gatunku=obj.nazwa_gatunku;
        this.opis=obj.opis;
        this.l_ch2n=obj.l_ch2n;
        this.l_chx=obj.l_chx;
        System.out.println("Zklonowano!");
    }




}
