package d07_09_2023.Zadatak5;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        //Zadatak 5: Kreiranje klase "Oprema"
        //Napišite klasu "Oprema" sa atributima: tip (String), marka (String) i cena (double).
        //U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti unosom sa tasture. Ispisati informacije o opremi.

        Scanner s = new Scanner(System.in);

        Oprema first = new Oprema();
        System.out.print("Unesite tip opreme: ");
        first.type = s.next();
        System.out.print("Unesite brand: ");
        first.brand = s.next();
        System.out.print("Unesite cenu: ");
        first.price = s.nextDouble();

        Oprema second = new Oprema();
        System.out.print("Unesite tip opreme: ");
        second.type = s.next();
        System.out.print("Unesite brand: ");
        second.brand = s.next();
        System.out.print("Unesite cenu: ");
        second.price = s.nextDouble();

        Oprema third = new Oprema();
        System.out.print("Unesite tip opreme: ");
        third.type = s.next();
        System.out.print("Unesite brand: ");
        third.brand = s.next();
        System.out.print("Unesite cenu: ");
        third.price = s.nextDouble();


        System.out.println(first.type + " " + first.brand + " - " + first.price + " din.");
        System.out.println(second.type + " " + second.brand + " - " + second.price + " din.");
        System.out.println(third.type + " " + third.brand + " - " + third.price + " din.");

    }
}
