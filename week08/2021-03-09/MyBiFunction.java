package demo.understandinglambdas;

@FunctionalInterface
public interface MyBiFunction<T, U, R> {
    R apply(T p1, U p2);
}
