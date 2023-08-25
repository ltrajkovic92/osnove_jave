package p24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        //Zadatak
        //Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i koji prikazuje element na poziciji K. K unosi korisnik i smatrajte da unosi u opsegu od 0 do 4.
        //Primer:
        //Unesite pozicjiu: 2
        //Na pozicji 2 je vrednost 7.

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(6);
        numbers.add(7);
        numbers.add(2);
        numbers.add(11);
        numbers.add(9);
        numbers.add(13);

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite K u opsegu od 0 do 4: ");
        int k = s.nextInt();

        int value = numbers.get(k);
        System.out.println("Vrednost je " + value);

    }
}
