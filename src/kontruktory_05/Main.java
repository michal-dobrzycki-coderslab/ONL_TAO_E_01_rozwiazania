package kontruktory_05;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int wynik = calc.add(10,5);
        System.out.println("Wynik: " + wynik);
        calc.printOperations();

        int kolejnyWynik = calc.multiply(3,4);
        System.out.println("Wynik: " + kolejnyWynik);
        calc.printOperations();

        calc.clearOperations();
        calc.printOperations();
    }
}
