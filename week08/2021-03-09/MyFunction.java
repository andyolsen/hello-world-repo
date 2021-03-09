package demo.understandinglambdas;

@FunctionalInterface
public interface MyFunction<T, R> {
    R apply(T param);
}

