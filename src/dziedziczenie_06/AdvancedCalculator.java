package dziedziczenie_06;

import kontruktory_05.Calculator;

public class AdvancedCalculator extends Calculator {

    public double pow(double x, double y) {
        double result = Math.pow(x, y);
        saveOperation(x + "^" +  y + " equals " + result);
        return result;
    }

    public double root(double x, double y) {
        double result = Math.pow(x, 1/y);
        saveOperation(y + " root of " +  x + " equals " + result);
        return result;
    }
}
