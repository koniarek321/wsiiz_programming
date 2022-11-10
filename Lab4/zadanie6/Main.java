import java.util.Scanner;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] numbers=new int[5];
        System.out.println("Podaj liczbę: ");
        numbers[0]=getInt();
        System.out.println("Podaj liczbę: ");
        numbers[1]=getInt();
        System.out.println("Podaj liczbę: ");
        numbers[2]=getInt();
        System.out.println("Podaj liczbę: ");
        numbers[3]=getInt();
        System.out.println("Podaj liczbę: ");
        numbers[4]=getInt();
        silniaArray(numbers);
    }


    public static void silniaArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println("Silnia liczby "+arr[i]+" jest równa: "+silnia(arr[i]));
        }
    }

    public static int silnia(int x){
        int silnia=1;
        if (x>0) {
            for (int i = 1; i <= x; i++) {
                silnia *= i;
            }
            return silnia;
        }
        else return 0;

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

