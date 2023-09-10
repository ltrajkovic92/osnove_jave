package d07_09_2023.Zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {

        //Zadatak 2: Kreiranje klase "Automobil"
        //Napišite klasu "Automobil" sa atributima: marka (String), model (String) i godinaProizvodnje (int).
        //U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti. Ispisati informacije o automobilima.

        Automobil first = new Automobil();
        first.brand = "Honda";
        first.model = "Civic";
        first.year = 2013;

        Automobil second = new Automobil();
        second.brand = "Kia";
        second.model = "Ceed";
        second.year = 2014;

        Automobil third = new Automobil();
        third.brand = "Opel";
        third.model = "Insignia";
        third.year = 2015;

        System.out.println(first.brand + " " + first.model + " - " + first.year);
        System.out.println(second.brand + " " + second.model + " - " + second.year);
        System.out.println(third.brand + " " + third.model + " - " + third.year);
    }
}
