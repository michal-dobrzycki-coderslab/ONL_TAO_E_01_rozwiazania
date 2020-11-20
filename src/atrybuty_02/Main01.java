package atrybuty_02;

public class Main01 {
    public static void main(String[] args) {
        AccessModifier testAttribute = new AccessModifier();
        testAttribute.publicAttribute = "publiczny2";
        testAttribute.protectedAttribute = 'z';

        System.out.println(testAttribute.publicAttribute);
        System.out.println(testAttribute.protectedAttribute);
    }
}
