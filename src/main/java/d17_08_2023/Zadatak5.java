package d17_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite a: ");
        int a = s.nextInt();
        System.out.print("Unesite b: ");
        int b = s.nextInt();
        System.out.print("Unesite operator: ");
        String operator = s.next();

        if (operator.equals("+")) {
            System.out.println("Rezultat: " + (a+b));
        } else if (operator.equals("-")) {
            System.out.println("Rezultat: " + (a-b));
        } else if (operator.equals("*")) {
            System.out.println("Rezultat: " + (a*b));
        } else if (operator.equals("/")) {
            System.out.println("Rezultat: " + (a/b));
        }

        //5.Napisati program koji u zavisnosti od operatora koji unosi korisnik sa tastature (operator je string i moze imati vrednosti +, - , *, /) racuna  i ispisuje na ekranu odgovarajuci zbir, razliku, proizvod ili kolicnik za dva broja a i b uneta sa tastature.
        //Primer 1:                                              Primer 2:
        //Unestite a: 6                                        Unestite a: 6
        //Unesite b: 3                                         Unesite b: 3
        //Unesite operator: +                             Unesite operator: /
        //Rezultat: 9                                           Rezultat: 2
    }
}
