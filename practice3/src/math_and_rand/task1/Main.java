package math_and_rand.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a, n;
        Scanner in = new Scanner(System.in);
        System.out.print("input array size: ");
        n = in.nextInt();
        Random rand = new Random();
        double[] Array1 = new double[n];
        double[] Array2 = new double[n];
        for (int i = 0; i < n; i++) {
            Array1[i] = Math.random() * 1000;
        }
        for (int i = 0; i < n; i++) {
            Array2[i] = rand.nextDouble(1000);
        }
        System.out.println("Array 1:");
        for (double el : Array1)
            System.out.printf("%-10.2f ", el);
        System.out.println();
        System.out.println("Array 2:");
        for (double el : Array2)
            System.out.printf("%-10.2f ", el);
        System.out.println();
        Arrays.sort(Array1);
        Arrays.sort(Array2);
        System.out.println("sorted Array 1:");
        for (double el : Array1)
            System.out.printf("%-10.2f ", el);
        System.out.println();
        System.out.println("sorted Array 2:");
        for (double el : Array2)
            System.out.printf("%-10.2f ", el);
        System.out.println();
    }
}