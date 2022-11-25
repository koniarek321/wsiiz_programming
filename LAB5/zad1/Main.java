public class Main {
    public static void main(String[] args) {

        Prostokat p1=new Prostokat(4,6);
        Prostokat p2=new Prostokat(2,9);
        Prostokat p3=new Prostokat(11,16);

        p1.wypisz();
        p2.wypisz();
        p3.wypisz();
        System.out.println(p1.Obwod());
        System.out.println(p2.Pole());
        System.out.println(p3.Przekatna());

    }
}