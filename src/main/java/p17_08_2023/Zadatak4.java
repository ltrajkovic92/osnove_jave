package p17_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite a: ");
        int a = s.nextInt();
        System.out.println("Unesite b: ");
        int b = s.nextInt();

        if (b<a) {
            System.out.println("B je manje broj od A");
        }

        //Napisati program koji ispisuje da li je broj b manji od broja a. A i B unosimo sa tastature.

    }
}
