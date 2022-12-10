package math_and_rand.task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("input array size: ");
        n = in.nextInt();
        while (n <= 0){
            System.out.println("invalid input, enter array size again");
            n = in.nextInt();
        }
        int[] arr = new int[n];
        int n2 = 0;
        System.out.println("first array:");
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 10000 % n);
            System.out.println(arr[i]);
            if (arr[i] % 2 == 0)
                n2++;
        }

        System.out.println("second array:");
        int[] arr2 = new int[n2];
        n2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                arr2[n2] = arr[i];
                System.out.println(arr2[n2]);
                n2++;
            }
        }
    }
}
