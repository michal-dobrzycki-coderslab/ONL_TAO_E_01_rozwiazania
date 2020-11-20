package dziedziczenie_06;

public class Main {
    public static void main(String[] args) {
        AdvancedCalculator calc = new AdvancedCalculator();
        calc.pow(2,3); // 2 * 2 * 2
        calc.pow(4,2); // 4 * 4

        calc.root(16,2); // 4
        calc.root(27,3); // 3

        calc.printOperations();
        calc.clearOperations();
        calc.printOperations();
    }
}
