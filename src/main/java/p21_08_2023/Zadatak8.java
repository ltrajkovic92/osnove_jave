package p21_08_2023;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {

        //8.(Za vezbanje) Napisati program koji za sve petocifrene brojeve izvlaci sve cifre i stampa ih na ekranu.
        //Primer izvrsenja:
        //Unesite broj: 19452
        //2, 5, 4, 9, 1

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj: ");
        int broj = s.nextInt();

        if (broj>9999 && broj<100000) {
            for (int i = 0; i < 5; i++) {
                if (i==4) {
                    System.out.print(broj%10);
                } else {
                    System.out.print(broj%10 + ", ");
                }
                broj = broj / 10;
            }
        } else {
            System.out.println("Broj nije petocifren.");
        }
    }
}
