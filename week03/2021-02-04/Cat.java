package demo.inheritance;

public class Cat extends Animal {

    private int numLives;

    public Cat(double h, int n) {
        // The first thing you must do in your ctor, is to call your superclass ctor.
        super(h);
        numLives = n;
    }

    public void useUpLife() {
        numLives--;
    }

    @Override
    public String toString() {
        return String.format("%d %f", numLives, height);
    }
}
