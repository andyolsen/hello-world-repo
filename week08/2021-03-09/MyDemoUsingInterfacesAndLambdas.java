package demo.understandinglambdas;

import java.util.ArrayList;
import java.util.function.*;

public class MyDemoUsingInterfacesAndLambdas {

    public static void main(String[] args) {
        ArrayList<Double> temperatures = new ArrayList<>();
        temperatures.add(25.0);
        temperatures.add(-3.0);
        temperatures.add(32.0);

        // A lambda is an object that implements the functional interface.
        // The lambda is the implementation of the (single) method in that functional interface.
//        UnaryOperator<Double> op1 = n -> n * n;
//        displayResultOfOperation(temperatures, op1);
//        displayResultOfOperation(temperatures, n -> n + n);
//
//        Predicate<Double> pred1 = p -> p > 10;
//        displayItemsWhere(temperatures, pred1);
//
//        displayItemsWhere(temperatures, p -> p < 10);

//        transformAndDisplay(temperatures, n -> {
//            String s = String.format("Nummeret er %.2f", n);
//            return s;
//        });
//
//        transformAndDisplayV2(temperatures, (n, s) -> String.format(s, n));

        doSomethingAndDisplay(temperatures, c -> c * 1.8 + 32);
        doSomethingAndDisplay(temperatures, f -> (f - 32) / 1.8);
    }

    private static void displayResultOfOperation(ArrayList<Double> numbers, UnaryOperator<Double> op) {
        for (double n: numbers) {
            Double result = op.apply(n);
            System.out.println(result);
        }
    }

    private static void displayItemsWhere(ArrayList<Double> numbers, Predicate<Double> pred) {
        for (double n: numbers) {
            if (pred.test(n))
                System.out.println(n);
        }
    }

    private static void transformAndDisplay(ArrayList<Double> numbers, Function<Double,String> f) {
        for (double n: numbers) {
            String s = f.apply(n);
            System.out.println(s);
        }
    }

    private static void transformAndDisplayV2(ArrayList<Double> numbers, BiFunction<Double,String,String> f) {
        for (double n: numbers) {
            String s = f.apply(n, "Le numero est %.2f");
            System.out.println(s);
        }
    }

    private static void doSomethingAndDisplay(ArrayList<Double> numbers, UnaryOperator<Double> op) {
        for (double n: numbers) {
            double f = op.apply(n);
            System.out.println("Orig temp is " + n + ", transformed temp is " + f);
        }
    }
}

