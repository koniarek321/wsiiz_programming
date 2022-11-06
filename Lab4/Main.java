import java.util.Scanner;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Random;

public class Main {


        public static Random rand() {
            return new Random();
        }

        public static void main(String[] args) {
            sumAndAvgElements(createRandom(100));
        }

        public static void sumAndAvgElements(int[] arr) {
            int sum = 0;
            for (int elem : arr) {
                sum += elem;
            }
            int avg = sum / arr.length;
            System.out.println("Suma elementow tablicy wynosi: " + sum);
            System.out.println("Średnia elementów tablicy wynosi: " + avg);
        }

        public static int[] createRandom(int a) {
            int[] arr = new int[10];
            for (int i = 0; i < 10; i++ ) {
                arr[i] = rand().nextInt(a);
            }
//            for (int i=0;i<arr.length;i++){
//                arr[i]=rand().nextInt(a);
//            }
            return arr;
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
