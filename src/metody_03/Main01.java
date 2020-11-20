package metody_03;

public class Main01 {

    public static void main(String[] args) throws Exception {
        Person p = new Person("Ala");
        try {
            System.out.println(p);
        } catch (Exception e) {
            // e.printStackTrace();
        }

        System.out.println("Tada!");

    }
}
