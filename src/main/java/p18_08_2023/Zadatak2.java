package p18_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesi broj a: ");
        int a = s.nextInt();

        if (a<10) {
            System.out.println("Broj je jednocifren.");
        } else if (a<100) {
            System.out.println("Broj je dvocifren.");
        } else if (a>=100 || a<=999) {
            System.out.println("Broj je trocifren.");
        }
    }
}
