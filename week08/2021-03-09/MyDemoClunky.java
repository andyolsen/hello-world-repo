package demo.understandinglambdas;

import java.util.ArrayList;

public class MyDemoClunky {

    public static void main(String[] args) {
        ArrayList<Double> temperatures = new ArrayList<>();
        temperatures.add(5.0);
        temperatures.add(-3.0);
        temperatures.add(32.0);

        displaySquares(temperatures);
        displayCubes(temperatures);
        displayToPower4(temperatures);
    }

    private static void displaySquares(ArrayList<Double> numbers) {
        for (double n: numbers) {
            double result = n * n;
            System.out.println(result);
        }
    }

    private static void displayCubes(ArrayList<Double> numbers) {
        for (double n: numbers) {
            double result = n * n * n;
            System.out.println(result);
        }
    }

    private static void displayToPower4(ArrayList<Double> numbers) {
        for (double n: numbers) {
            double result = n * n * n * n;
            System.out.println(result);
        }
    }
}
