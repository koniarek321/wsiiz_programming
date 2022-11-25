import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Budynek b1=new Budynek("Liceum", 3, LocalDate.of(1965,10,26));
        System.out.println(b1.toString());
        System.out.println(b1.ile_lat());

        Budynek b2=new Budynek("Liceum", 3, LocalDate.of(1774,1,6));
        System.out.println(b2.toString());
        System.out.println(b2.ile_lat());
    }
}