package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("input amount of numbers in array: ");
        int n = in.nextInt();

        int[] array = new int[n];
        int sum = 0;
        System.out.print("input numbers in array: ");
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
            sum += array[i];
        }


        System.out.println("sum = " + sum + "\naverage = " + (float)sum / n);
        in.close();
    }
}