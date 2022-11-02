import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //Zad 1
        System.out.println("Podaj liczbe studentow: ");
        int n=getInt();
        System.out.println(averagePoints(n));
        //Zad 2
        secondTask();
        //Zad 3
        System.out.println("Podaj dlugosc ciagu: ");
        int length=getInt();
        zadankoTrzy(length);
        //Zad 4
        System.out.println("Ile liczb wylosować?");
        int numbers_To_Draw=getInt();
        czwarteZadanko(numbers_To_Draw);
        //Zad 5
        System.out.println("Podaj wyraz: ");
        String word=getString();
        Palindrom(word);
    }


    public static float averagePoints(int n){
        int i=0;
        float sum=0;
        float points;
        while (i<n){
            System.out.println("Student "+(i+1)+":");
            points=getFloat();
            sum+=points;
            i++;
        }
        float average=sum/n;
        System.out.println("Total points: "+sum);
        System.out.println("Average points: "+average);
        return  average;
    }

    public static void secondTask(){
        int i=0;
        int liczba;
        int ile_p=0;
        int ile_niep=0;
        int suma_p=0;
        int suma_niep=0;
        while (i<10) {
            System.out.println("Wczytaj liczbę: ");
            liczba=getInt();
            if (liczba >=0) {
                ile_p+=1;
                suma_p+=liczba;
            }
            else {
                ile_niep+=1;
                suma_niep+=liczba;
            }
            i++;
        }
        System.out.println("Ilosc i suma liczb parzystych: "+ile_p+", "+suma_p);
        System.out.println("Ilosc i suma liczb nieparzystych: "+ile_niep+", "+suma_niep);
    }

    public static void zadankoTrzy(int length) {

        int i=0;
        int value;
        int sum=0;
        while (i<length) {
            System.out.println("Podaj wartość dla "+(i+1)+" elementu ciągu: ");
            value=getInt();
            if(value%2==0){
                sum+=value;

            }
            i++;
        }
        System.out.println("Suma liczb parzystych w ciągu wynosi: "+sum);
    }

    public static void czwarteZadanko(int numbers_To_Draw){
        Random rand = new Random();
        System.out.println("Losowanie liczb z zakresu (-10, 45): \n Wpisz '1', aby losować!");
        int decision;
        int Num;
        int sum=0;
        int i=0;
        while (i<numbers_To_Draw) {
            decision = getInt();
            if (decision == 1) {
                Num = rand.nextInt(56) - 10;
                System.out.println("Wylosowano: "+Num);
                if (Num%2==0){
                    sum+=Num;
                }
            }
            i++;
        }
        System.out.println("Suma liczb parzystych: "+sum);

    }
    public static void Palindrom(String word) {
        String nostr = "";
        char znak;
        for (int i = 0; i < word.length(); i++) {
            znak = word.charAt(i);
            nostr = znak + nostr;
        }
        System.out.println("Odwrócone słowo: "+ nostr);

        if (word==nostr){
            System.out.println("Wyraz "+nostr+" jest palindromem");
        }
        else {
            System.out.println("Wyraz "+nostr+" nie jest palindromem");
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
