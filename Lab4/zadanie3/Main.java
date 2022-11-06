import java.util.Scanner;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Random;


public class Main {
    //ZADANIE 2
    public static void main(String[] args) {
        zad3();

    }

    public static void zad3(){
        String tab[]=new String[]{"basic", "car", "water", "integer", "float", "fire"};

        for (String i: tab) {
            i.toUpperCase();
            System.out.println(i.toUpperCase());
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

