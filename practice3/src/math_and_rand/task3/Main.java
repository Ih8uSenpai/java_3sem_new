package math_and_rand.task3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[4];
        boolean b = true;
        int last = 100;
        System.out.println("array:");
        for (int i = 0; i < 4; i++) {
            arr[i] = (int) (Math.random() * 100 % 90 + 10);
            System.out.println(arr[i]);
            if (arr[i] < last && i != 0)
                b = false;
            else
                last = arr[i];
        }
        if (b)
            System.out.println("array is strictly increasing sequence");
        else
            System.out.println("array is NOT strictly increasing sequence");
    }
}
