package d22_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        //3.Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..
        //Primer izvrsenja:
        //Unesite rimski broj: X
        //Arapski: 10
        //Unesite rimski broj: C
        //Arapski: 100
        //Unesite rimski broj: D
        //Arapski: 500
        //Unesite rimski broj: M
        //Arapski: 1000
        //Unesite rimski broj: I
        //Arapski: 1
        //Unesite rimski broj: KRAJ
        //Kraj programa.

        Scanner s = new Scanner(System.in);
        boolean hasEnd = false;

        while(!hasEnd) {
            System.out.print("Unesite rimski broj: ");
            String rBroj = s.next();

            if (rBroj.equals("I")) {
                System.out.println("Arpaski: 1");
            } else if (rBroj.equals("V")){
                System.out.println("Arapski: 5");
            } else if (rBroj.equals("X")){
                System.out.println("Arapski: 10");
            } else if (rBroj.equals("L")){
                System.out.println("Arapski: 50");
            } else if (rBroj.equals("C")){
                System.out.println("Arapski: 100");
            } else if (rBroj.equals("D")){
                System.out.println("Arapski: 500");
            } else if (rBroj.equals("M")){
                System.out.println("Arapski: 1000");
            } else if (rBroj.equals("KRAJ")) {
                hasEnd = true;
            }
        }
        System.out.println("Kraj programa.");
    }
}
