import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random rand = new Random();
        //Zad 1
        System.out.println(getAge());
        System.out.println(getName());
        int a=getInt();
        int b=getInt();
        //Zad 2
        Obliczenia(a,b);
        //Zad 3
        System.out.println(evenOrNot(10));
        //Zad 4
        System.out.println(divideThreeAndFive(15));
        //Zad 5
        System.out.println(toThirdPower(7));
        //Zad 6
        System.out.println(squareRoot(81));
        //Zad 7
        System.out.println("Podaj zakres losowania: ");
        int g=getInt();
        int h=getInt();
        if (g>h) {
            int d=rand.nextInt(g-h+1)+h;
            int e=rand.nextInt(g-h+1)+h;
            int f=rand.nextInt(g-h+1)+h;
            System.out.println("Wylosowane liczby d,e,f to: "+d+", "+e+", "+f);
            System.out.println(triangle(d, e, f));
        }
        else {
            int d=rand.nextInt(h-g+1)+g;
            int e=rand.nextInt(h-g+1)+g;
            int f=rand.nextInt(h-g+1)+g;
            System.out.println("Wylosowane liczby d,e,f to: "+d+", "+e+", "+f);
            System.out.println(triangle(d, e, f));
        }


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
        if ((d*d)+(e*e)==(f*f)) return true;
        else return false;

    }

    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }


}
