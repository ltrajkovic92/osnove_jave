package p17_08_2023;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesi vrednost za a: ");
        double a = s.nextDouble();
        System.out.print("Unesi vrednost za b: ");
        double b = s.nextDouble();
        System.out.print("Unesi vrednost za c: ");
        double c = s.nextDouble();

        double avg = (a+b+c)/3;

        System.out.println("Srednja vrednost za a,b i c je: " + avg);

        //Napisati program koji sa tastature ucitava tri broja a, b i c i ispisuje srednju vrednost za ta tri broja.
        // Sve promenljive u programu su po tipu double

    }
}
