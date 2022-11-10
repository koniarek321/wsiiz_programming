import java.util.Scanner;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //Zadanie 5
        int[] numbers=new int[8];
        System.out.println("Podaj liczbę:");
        numbers[0]=getInt();
        System.out.println("Podaj liczbę:");
        numbers[1]=getInt();
        System.out.println("Podaj liczbę:");
        numbers[2]=getInt();
        System.out.println("Podaj liczbę:");
        numbers[3]=getInt();
        System.out.println("Podaj liczbę:");
        numbers[4]=getInt();
        System.out.println("Podaj liczbę:");
        numbers[5]=getInt();
        System.out.println("Podaj liczbę:");
        numbers[6]=getInt();
        System.out.println("Podaj liczbę:");
        numbers[7]=getInt();
        getNumbers(numbers);



    }

    public static void getNumbers(int arr[]){
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                arr[i]=temp;
                arr[i+1]=arr[i];
                temp=arr[i+1];
            }

        }
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
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