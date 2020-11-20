package atrybuty_02;

public class Person {
    public String name = "Grażyna";
    public String surname = "Kowalska";
    private int age = 18;
    public char gender = 'F';

    public String toString() {
        return "Imie: " + name + ",\n Nazwisko: " + surname +
                ",\n wiek: " + age + ",\n płeć: " + gender;
    }

    public void setAge(int x) {
        if (x>0) {
            this.age = x;
        } else {
            //
        }
    }

}
