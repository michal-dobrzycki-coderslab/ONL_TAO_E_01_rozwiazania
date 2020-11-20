package metody_03;

public class Person {
    private String name;
    private String surname;
    private int age;
    private char gender = 'F';

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name) {
        this.name = name;
    }


    public void increaseAge() {
        this.age++;
    }

    public String toString() throws IllegalArgumentException {
        if (surname==null) {
            throw new IllegalArgumentException("Osoba nie ma nazwiska");
        }
        return "Wiek osoby " + surname + " to: " + age;
    }
}
