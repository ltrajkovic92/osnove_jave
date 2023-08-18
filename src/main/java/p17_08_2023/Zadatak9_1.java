package p17_08_2023;

import java.util.Scanner;

public class Zadatak9_1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String znak = "";
        while (!znak.equals("srce") && !znak.equals("kocka") && !znak.equals("list") && !znak.equals("detelina")) {
            System.out.println("Unesite znak karte koja je na stolu: ");
            znak = s.next();
        }

        String broj = "";
        while (!broj.equals("2") && !broj.equals("3") && !broj.equals("4") && !broj.equals("5") && !broj.equals("6") && !broj.equals("7") && !broj.equals("8") && !broj.equals("9") && !broj.equals("10") && !broj.equals("A") && !broj.equals("J") && !broj.equals("Q") && !broj.equals("K")) {
            System.out.println("Unesite broj karte koja je na stolu: ");
            broj = s.next();
        }

            String znak2 = "";
        while (!znak2.equals("srce") && !znak2.equals("kocka") && !znak2.equals("list") && !znak2.equals("detelina")) {
            System.out.println("Unesite znak karte koju igrac zeli da odigra: ");
            znak2 = s.next();
        }

            String broj2 = "";
        while (!broj2.equals("2") && !broj2.equals("3") && !broj2.equals("4") && !broj2.equals("5") && !broj2.equals("6") && !broj2.equals("7") && !broj2.equals("8") && !broj2.equals("9") && !broj2.equals("10") && !broj2.equals("A") && !broj2.equals("J") && !broj2.equals("Q") && !broj2.equals("K")) {
            System.out.println("Unesite broj karte koju igrac zeli da odigra: ");
            broj2 = s.next();
        }

        if (znak.equals(znak2) || broj.equals(broj2)) {
            System.out.println("Potez je ispravan");
        } else {
            System.out.println("Potez nije ispravan");
        }

        //(Za vezbanje) Napisati program za potrebe Makao igrice. Korisnik unosi 4 informacije:
        //znak karte koja je na stolu
        //broj karte koja je na stolu
        //znak karte koju igrac zeli da odigra
        //broj karte koju igrac zeli da odigra
        //i nakon toga se na ekranu ispisuje da li je potez ispravan.
        //Potez je ispravan ukoliko se karta na stolu i odigrana karta poklapaju po znaku ili broju.
        //
        //	Znakovi karata: srce, kocka, list, detelina
        //	Brojevi karata: 2,3,4,5,6,7,8,9,10,A,J,Q,K

    }
}

