import java.util.Scanner;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Random;

public class Main {
    //ZADANIE 2
    public static void main(String[] args) {
        tablica1();
    }






    public static void tablica1(){
        int tab[]= new int[]{1,2,3 ,4 ,5 ,6 ,7, 8, 9, 10, 11,12};
        String tab1[]=new String[]{"Auto", "Pies", "Woda", "Kawa", "Kosa"};
        for (int i=0;i< tab.length;i+=2){
            System.out.println(tab[i]);
        }
        for (int i=0;i< tab1.length;i+=2){
            System.out.println(tab1[i]);
        }
    }

    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
    public static float getFloat(){
        return new Scanner(System.in).nextFloat();
    }
    public static String getString(){
        return new Scanner(System.in).nextLine();
    }
}
