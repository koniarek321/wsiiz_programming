import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.math.RoundingMode;
import java.text.DecimalFormat;


public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        //Zad 1
        System.out.println("Podaj wartosc wspolczynnikow a, b, c: \n");
        int a=getInt();
        int b=getInt();
        int c=getInt();
        squareEquation(a, b, c);
        //Zad 2
        System.out.println("Podaj argumenty rzeczywiste kolejno do funkcji A, b, C: \n");
        double funcA =getDouble();
        double funcB =getDouble();
        double funcC =getDouble();
        System.out.println(FuncA(funcA));
        System.out.println(FuncB(funcB));
        System.out.println(FuncC(funcC));
        //Zad 3
        int x= rand.nextInt(100);
        int y= rand.nextInt(100);
        int z= rand.nextInt(100);
        sortVariables(x, y, z);
        //Zad 4
        System.out.println("Pada deszcz? Wpisz '1'");
        int rain = getInt();
        System.out.println("Jest autobus na przystanku? Wpisz '1'");
        int bus = getInt();
        Rain(rain, bus);
        //Zad 5
        System.out.println("Jak była znizka to napisz '1'");
        int znizka = getInt();
        System.out.println("Jak była premia to napisz '1'");
        int premia = getInt();
        zad5(znizka, premia);
        //zad 6
        System.out.println("Jakie działanie chcesz wykonać?\n Dodawanie=1,\nOdejmowanie=2,\nMnożenie=3,\nDzielenie=4");
        int operation = getInt();
        mathOperation(operation);
        System.out.println((float)12/5);
    }

    public static void mathOperation(int operation){
        Random rand = new Random();
        int g= rand.nextInt(100);
        int h= rand.nextInt(50);
        float gh =g/h;
        System.out.println("Liczby operacyjne: "+ g +", " + h);
        switch (operation)
        {
            case 1:
                System.out.println("Dodawanie: "+(g+h));
                break;
            case 2:
                System.out.println("Odejmowanie: "+(g-h));
                break;
            case 3:
                System.out.println("Mnożenie: "+(g*h));
                break;
            case 4:
                System.out.println("Dzielenie: "+((float)g/h));
                break;
        }
    }

    public static void zad5(int znizka, int premia) {
        if (znizka != 1 || premia==1) {
            System.out.println("Możesz kupić samochód !");
            System.out.println("Zniżki na samochód nie ma");
        }
        //Aby drugi warunek był brany pod uwagę można np. w pierwszym warunku zamienić '||' na '&&'.
        else if (znizka != 1 || premia!=1) {
            System.out.println("Zakup samochód trzeba odłożyć na później...");
            System.out.println("Zniżki na samochód nie ma");
        }
        else if (znizka == 1 || premia==1) {
            System.out.println("Możesz kupić samochód !");
        }
    }

    public static void Rain(int rain, int bus){
        String Rain="Tak";
        String Bus="Tak";
        if (rain==1 && bus==1) {
            System.out.println("Weź parasol");
            System.out.println("Dostaniesz się na uczelnię");
        }
        else if (rain==1 && bus!=1) {
            System.out.println("Nie dostaniesz się na uczelnię!");
        }
        else if (rain!=1 && bus==1) {
            System.out.println("Dostaniesz się na uczelnie");
            System.out.println("Miłego dnia i pięknej pogody");
        }
    }

    public static void sortVariables(int x, int y, int z){
        int[] tab={x, y, z};
        System.out.println(Arrays.toString(tab));
        for (int i=0;i< tab.length-1;i++){
            if(tab[i]>tab[i+1]) {
                int temp=tab[i];
                tab[i]=tab[i+1];
                tab[i+1]=temp;
            }
        }
        System.out.println(Arrays.toString(tab));
    }

    public static double FuncC(double funcC){
        if (funcC>2) return funcC+2;
        else if (funcC==2) return 8;
        else return funcC-4;
    }


    public static double FuncB(double funcB){
        if (funcB>=1) return Math.pow(funcB,2);
        else return funcB;
    }

    public static double FuncA(double funcA){
        if (funcA>0) return funcA*2;
        else if (funcA==0) return 0;
        else return -3*funcA;
    }



    public static void squareEquation(int a, int b, int c){
        if(a!=0){
            double delta= (b*b)-4*a*c;
            if(delta>0){
                double x1, x2;
                x1=-b-Math.sqrt(delta)/2*a;
                x2=-b+Math.sqrt(delta)/2*a;
                System.out.println("Równanie ma dwa rozwiązania:\n"+x1+", "+x2);
            }
            else if (delta==0) {
                double x0=-b/2*a;
                System.out.println("Równanie ma jedno rozwiązanie: "+x0);
            }
            else System.out.println("Równanie nie ma rozwiązań!");
        }
        else System.out.println("Współczynnik 'a' musi być różny od zera!");
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
    public static double getDouble(){
        return new Scanner(System.in).nextDouble();
    }

}