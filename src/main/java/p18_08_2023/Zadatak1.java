package p18_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesi N: ");
        int n = s.nextInt();

        System.out.print("Unesi akciju: ");
        String akcija = s.next();



        if (akcija.equals("Povecaj")) {
            n = ++n;
        }
        if (akcija.equals("Smanji")) {
            n = --n;
        }

        System.out.println("Nova vrednost za N je: " + n);

        //Napisati program koji sa tastature ucitava broj N i operaciju koja se izvrsava nad njim. Na kraju programa se ispisuje nova vrednost promenljive N.
        //Ukoliko se za operaciju unese uvecaj, to uvecava promenljivu N za 1.
        //Ukoliko se za operaciju unese smanji, to smanjuje promenljivu N za 1.
        //
        //	Primer izvrsenja:
        //	Unesite N: 10
        //	Unesite akciju: uvecaj
        //	Nova vrednost za N je 11
    }
}
