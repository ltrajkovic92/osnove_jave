package d22_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        //	Napisati program koji proverava uparenost zagrada. Korisnik unosi matematicku formulu sve dok ne unese znak =.
        //Korisnik unosi svaki karakter jednacine posebno i na kraju programa se ispisuje da li su sve zagrade uparene.
        //	Formula koja se koristi u primeru je: (2 * ( 1 + 3))=
        //	Primer izvrsenja:
        //	Unos: (
        //	Unos: 2
        //	Unos: *
        //	Unos: (
        //	Unos: 1
        //	Unos: +
        //	Unos: 3
        //	Unos: )
        //	Unos: )
        //	Unos: =
        //	Zagrade su uparene
        //	(Objasnjenje: Imamo isti broj otvorenih i zatvorenih zagrada)
        //
        //	Primer izvrsenja 2:
        //	Unos: (
        //	Unos: 2
        //	Unos: *
        //	Unos: (
        //	Unos: 1
        //	Unos: +
        //	Unos: 3
        //	Unos: )
        //	Unos: =
        //	Zagrade nisu uparene
        //	(Objasnjenje: fali poslednja zagrada iz formule)

        Scanner s = new Scanner(System.in);
        int counter1 = 0;
        int counter2 = 0;
        boolean hasEqual = false;

        while(!hasEqual) {
            System.out.print("Unos: ");
            String unos = s.next();

            if (unos.equals("(")) {
                counter1++;
            } else if (unos.equals(")")) {
                counter2++;
            } else if (unos.equals("=")) {
                hasEqual = true;
            }
        }
        if (counter1==counter2) {
            System.out.println("Zagrade su uparene");
            System.out.println("(Objasnjenje: Imamo isti broj otvorenih i zatvorenih zagrada)");
        } else if (counter1!=counter2) {
            System.out.println("Zagrade nisu uparene");
            System.out.println("(Objasnjenje: fali poslednja zagrada iz formule)");
        }
    }
}
