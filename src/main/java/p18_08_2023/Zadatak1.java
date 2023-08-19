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

    }
}
