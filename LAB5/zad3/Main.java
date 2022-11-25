import java.lang.Object;

public class Main {
    public static void main(String[] args) {
        Gatunek ob1=new Gatunek("Tygrys", "Panthera tigris",
        "Wielki i niebezpieczny", 16,10);

        Gatunek ob2=new Gatunek("Pies", "Canis familiaris",
                "Mały i niegroźny", 14,5);

        System.out.println(ob1.getFullName());
        System.out.println(ob2.getFullName());
        System.out.println(ob1.getHaploid());
        System.out.println(ob2.getHaploid());

        ob2.wypisz();
        ob2.cloneObj(ob1);
        ob2.wypisz();




    }
}