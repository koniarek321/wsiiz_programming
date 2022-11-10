import java.util.Scanner;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //Zadanie 4
        System.out.println("Podaj słowo");
        String word1=getString();
        System.out.println("Podaj słowo");
        String word2=getString();
        System.out.println("Podaj słowo");
        String word3=getString();
        System.out.println("Podaj słowo");
        String word4=getString();
        System.out.println("Podaj słowo");
        String word5=getString();
        String arr[]=new String[]{word1, word2, word3, word4, word5};

        getWords(arr);



    }

    public static void getWords(String arr[]){
        String reversed="";
        String[] rev=new String[5];
        for(int i= arr.length-1;i>=0;i--){
            for(int j=arr[i].length()-1;j>=0;j--){
                reversed=reversed+arr[i].charAt(j);
            }
            rev[i]=reversed;
            System.out.print(rev[i]+" ");
            reversed="";

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