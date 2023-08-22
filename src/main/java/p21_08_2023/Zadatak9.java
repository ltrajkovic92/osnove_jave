package p21_08_2023;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {

        //9.	(Za vezbanje) Napisati program koji za sve petocifene brojeve radi mirror opciju.
        //Primer izvrsenja:
        //Unesite broj: 32492
        //Novi broj je 29423

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj: ");
        int broj = s.nextInt();

        if (broj>9999 && broj<100000) {
            for (int i = 0; i < 5; i++) {
                System.out.print(broj%10);
                broj = broj / 10;
            }
        } else {
            System.out.println("Broj nije petocifren.");
        }
    }
}
