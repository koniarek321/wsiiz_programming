import java.util.Scanner;
package com.company;
import java.util.Random;


public class Main {
    public static void main(String[] args){
        System.out.println(getAge());
        System.out.println(getName());
        int a=getInt();
        int b=getInt();
        Obliczenia(4, 7);
        System.out.println(evenOrNot(10));
        System.out.println(divideThreeAndFive(15));
        System.out.println(toThirdPower(7));
        System.out.println(squareRoot(81));


    }
    public static int getAge(){
        return 20;
    }
    public static String getName(){
        return "Marek";
    }
    public static boolean evenOrNot(int a){
        if (a%2==0){
            return true;
        }
        else return false;
    }
    public static void Obliczenia(int a, int b){

        System.out.println("Suma"+a+"+"+b+"= "+(a+b));
        System.out.println("Roznica"+a+"-"+b+"= "+(a-b));
        System.out.println("Iloczyn"+a+"*"+b+"= "+(a*b));
    }
    public static boolean divideThreeAndFive(int x){
        if (x%3==0 && x%5==0) {
            return true;
        }
        else
            return false;
    }
    public static double toThirdPower(int x){
        return Math.pow(x, 3);
    }
    public static double squareRoot(int x){
        return Math.sqrt(x);
    }
    public static boolean triangle(int d, int e, int f){
        Random rand = new Random();

    }

    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }


}
