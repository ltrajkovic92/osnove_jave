package d07_09_2023.Zadatak3;


public class Zadatak3 {
    public static void main(String[] args) {

        //Zadatak 3: Kreiranje klase "Proizvod"
        //Napišite klasu "Proizvod" sa atributima: naziv (String) i cena (double).
        //U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti. Ispisati informacije o proizvodima.

        Proizvod first = new Proizvod();
        first.name = "Laptop";
        first.price = 69569.99;

        Proizvod second = new Proizvod();
        second.name = "TV";
        second.price = 52999.99;

        Proizvod third = new Proizvod();
        third.name = "Roleri";
        third.price = 15979.99;

        System.out.println(first.name + (": ") + first.price + "din.");
        System.out.println(second.name + (": ") + second.price + "din.");
        System.out.println(third.name + (": ") + third.price + "din.");

    }
}
