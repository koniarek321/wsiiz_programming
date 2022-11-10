import java.util.Scanner;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        String[] arr=new String[]{"milk", "water", "fire"};
        String[] arr2=new String[]{"milk", "water", "fire"};
        System.out.println(compareArr(arr,arr2));
    }

    public static boolean compareArr(String[] arr, String[] arr2){
        if(Arrays.equals(arr, arr2)) return true;
        else return false;
    }
}