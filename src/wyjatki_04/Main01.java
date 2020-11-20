package wyjatki_04;

public class Main01 {

    public static void main(String[] args) {
        try {
            int x = factorial(-2);
            System.out.println(x);
        } catch (IllegalArgumentException e) {
            System.out.println("Oooops something went wrong...");
        }
    }

    static int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Liczba przekazana jako parametr ma być większa lub równa zero");
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
