package d07_09_2023.Zadatak4;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        //Zadatak 4: Kreiranje klase "Film"
        //Napišite klasu "Film" sa atributima: naslov (String), godinaIzdanja (int) i reziser (String).
        //U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti unosom sa tastature. Ispisati informacije o filmovima.

        Scanner s = new Scanner(System.in);

        Film first = new Film();
        System.out.print("Unesite naslov prvog filma: ");
        first.title = s.next();
        System.out.print("Unesite godinu izdanja prvog filma: ");
        first.year = s.nextInt();
        System.out.print("Unesite rezisera prvog filma: ");
        first.director = s.next();

        Film second = new Film();
        System.out.print("Unesite naslov drugog filma: ");
        second.title = s.next();
        System.out.print("Unesite godinu izdanja drugog filma: ");
        second.year = s.nextInt();
        System.out.print("Unesite rezisera drugog filma: ");
        second.director = s.next();

        Film third = new Film();
        System.out.print("Unesite naslov treceg filma: ");
        third.title = s.next();
        System.out.print("Unesite godinu izdanja treceg filma: ");
        third.year = s.nextInt();
        System.out.print("Unesite rezisera treceg filma: ");
        third.director = s.next();

        System.out.println(first.title + " (" + first.year + ") - " + first.director);
        System.out.println(second.title + " (" + second.year + ") - " + second.director);
        System.out.println(third.title + " (" + third.year + ") - " + third.director);

    }
}
