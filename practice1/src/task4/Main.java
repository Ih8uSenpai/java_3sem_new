package task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("input amount of numbers in array: ");
        int n = in.nextInt();

        int[] array = new int[n];
        int sum1 = 0;
        int sum2 = 0, min = 999999, max = -999999;
        System.out.print("input numbers in array: ");
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }

        int j = n;
        do {
            j--;
            sum1 += array[j];
        }
        while (j > 0);

        int k = 0;
        while (k < n) {
            sum2 += array[k];
            k++;
        }

        System.out.println("sum using do while = " + sum1);
        System.out.println("sum using while = " + sum2);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        in.close();
    }
}