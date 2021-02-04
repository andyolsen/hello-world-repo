package osl.collections;

public class Measurement<T> {

    private T value;
    private String unitName;

    public Measurement(T value, String unitName) {
        this.value = value;
        this.unitName = unitName;
    }

    @Override
    public String toString() {
        return "" + value + " " + unitName;
    }
}
