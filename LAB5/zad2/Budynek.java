import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Budynek {
    String nazwa;
    int  lpieter;
    LocalDate rok_budowy;


    public Budynek(String nazwa, int lpieter, LocalDate rok_budowy) {
        this.nazwa = nazwa;
        this.lpieter = lpieter;
        this.rok_budowy = rok_budowy;
    }

    @Override
    public String toString() {
        return "Budynek{" +
                "nazwa='" + nazwa + '\'' +
                ", lpieter=" + lpieter +
                ", rok_budowy=" + rok_budowy +
                '}';
    }

    public long ile_lat(){
        LocalDate today = LocalDate.now();
        return ChronoUnit.YEARS.between(rok_budowy,today);

    }

}
