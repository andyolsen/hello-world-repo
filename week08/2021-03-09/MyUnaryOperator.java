package demo.understandinglambdas;

@FunctionalInterface
public interface MyUnaryOperator<T> {
    T apply(T n);
}
