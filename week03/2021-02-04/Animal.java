package demo.inheritance;

public abstract class Animal {

    protected double height;

    public Animal(double h) {
        height = h;
    }

    public boolean isTall() {
        return height > 2.0;
    }
}
