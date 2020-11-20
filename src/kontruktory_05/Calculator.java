package kontruktory_05;

import java.util.Arrays;

public class Calculator {
    private String[] operacje = new String[0];

    public int add(int x, int y) {
        int result = x + y;
        saveOperation("added " + x + " to " + y + " got result" + result);
        return result;
    }

    public int multiply(int x, int y) {
        int result = x * y;
        saveOperation("multiplied " + x + " to " + y + " got result" + result);
        return result;
    }

    protected void saveOperation(String operacja) {
        this.operacje = Arrays.copyOf(operacje, operacje.length+1);
        operacje[operacje.length-1] = operacja;
    }

    public void printOperations() {
        if (operacje.length==0) {
            System.out.println("Lista operacji jest pusta.");
        }
        for (String s : operacje) {
            System.out.println(s);
        }
    }

    public void clearOperations() {
        System.out.println("Czyszczenie listy operacji...");
        this.operacje = new String[0];
    }
}
