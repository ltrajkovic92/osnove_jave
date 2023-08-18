package p17_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite a: ");
        int a = s.nextInt();
        System.out.println("Unesite b: ");
        int b = s.nextInt();
        System.out.println("Unesite c: ");
        int c = s.nextInt();

        if (a > b && a < c) {
            System.out.println("A je u opsegu od B do C");
        }

        //Napisati program koji ucitava brojeve a, b i c sa tastature i proverava da li je broj a u opsegu od b do c.
    }
}
