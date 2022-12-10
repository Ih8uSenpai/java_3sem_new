package task6;

public class Main {
    public static void main(String[] args) {
        double[] harmonic = new double[10];
        for(int i = 0; i < 10; i++) {
            harmonic[i] = 1. / (i + 1);
        }

        double sum = 0;

        System.out.println("first 10 numbers: ");
        for(int i = 0; i < 10; i++) {
            String result = String.format("%.3f", harmonic[i]);
            System.out.println(result);
        }

    }
}