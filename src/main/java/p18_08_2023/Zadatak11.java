package p18_08_2023;

import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite duzinu videa(s): ");
        int a = s.nextInt();

        System.out.print("Unesite trenutno vreme videa (s): ");
        int b = s.nextInt();

        for (int i = 1; i <=100; i++) {
            if (i >= (1.0*b/a*100)) {
                System.out.print("_");
            } else {
                System.out.print("*");
            }
        }
    }
}
