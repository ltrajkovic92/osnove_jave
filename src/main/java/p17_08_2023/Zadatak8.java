package p17_08_2023;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite a: ");
        int a = s.nextInt();
        System.out.println("Unesite b: ");
        int b = s.nextInt();
        System.out.println("Unesite c: ");
        int c = s.nextInt();


        if (a*a + b*b == c*c) {
            System.out.println("Trougao je pravougli");
        } else
            System.out.println("Trougao nije pravougli");

        //Napisati program koji ucitava stranice trougla a, b i c i ispisuje da li je trougao pravougli.
        //Trougao je pravougli ako je a²+b²=c²
    }
}
