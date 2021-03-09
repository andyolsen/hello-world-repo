package demo.understandinglambdas;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

class SquareOperation implements UnaryOperator<Double> {
    @Override
    public Double apply(Double n) {
        return n * n;
    }
}

class CubeOperation implements UnaryOperator<Double> {
    @Override
    public Double apply(Double n) {
        return n * n * n;
    }
}

class Power4Operation implements UnaryOperator<Double> {
    @Override
    public Double apply(Double n) {
        return n * n * n * n;
    }
}

class SquareRootOperation implements UnaryOperator<Double> {
    @Override
    public Double apply(Double n) {
        return Math.sqrt(n);
    }
}

public class MyDemoUsingInterfacesAndManualClasses {

    public static void main(String[] args) {
        ArrayList<Double> temperatures = new ArrayList<>();
        temperatures.add(5.0);
        temperatures.add(-3.0);
        temperatures.add(32.0);

        UnaryOperator<Double> sqop = new SquareOperation();
        displayResultOfOperation(temperatures, sqop);

        UnaryOperator<Double> cop = new CubeOperation();
        displayResultOfOperation(temperatures, cop);

        displayResultOfOperation(temperatures, new Power4Operation());

        displayResultOfOperation(temperatures, new SquareRootOperation());
    }

    private static void displayResultOfOperation(ArrayList<Double> numbers, UnaryOperator<Double> op) {
        for (double n: numbers) {
            Double result = op.apply(n);
            System.out.println(result);
        }
    }
}
