package mypackage;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticProgression {

    private int start;
    private int delta;
    private int numTerms;

    public ArithmeticProgression(int start, int delta, int numTerms) {
        this.start = start;
        this.delta = delta;
        this.numTerms = numTerms;
    }

    public List<Integer> getTerms() {
        ArrayList<Integer> result = new ArrayList<>();
        int currentTerm = start;
        for (int i = 1; i < numTerms; i++) {
            result.add(currentTerm);
            currentTerm += delta;
        }
        return result;
    }
}
