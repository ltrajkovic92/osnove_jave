package d18_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite dimenziju table: ");
        int table = s.nextInt();

        for (int i = 0; i < table * table; i++) {
            if (i>0 && i%table==0) {
                System.out.println(" ");
            }
            System.out.print("_|");
        }

        //6.	(Za vezbanje) Napisati program koji ucitava dimenziju table i stampa je na ekranu.
        //Primer izvrsenja:
        //Unesite dimenziju table: 5
        // _|_|_|_|_|
        // _|_|_|_|_|
        // _|_|_|_|_|
        // _|_|_|_|_|
        // _|_|_|_|_|
        //
        //Primver izvrsenja 2:
        //Unesite dimenziju table: 7
        // _|_|_|_|_|_|_|
        // _|_|_|_|_|_|_|
        // _|_|_|_|_|_|_|
        // _|_|_|_|_|_|_|
        // _|_|_|_|_|_|_|
        // _|_|_|_|_|_|_|
        // _|_|_|_|_|_|_|
    }
}
