package klasa_01;

public class Cat {
    String umaszczenie = "Czarne";
    int uszy = 4;
    String imie = "Filemon";

    public void miaucz(){
        System.out.println("Miau...");
    }

    public void drukujKota() {
        System.out.println("Umaszczenie:" + umaszczenie);
        System.out.println("Liczba uszu:" + uszy);
        System.out.println("Imię:" + imie);
    }
}
