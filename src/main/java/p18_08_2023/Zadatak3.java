package p18_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesi broj a: ");
        int a = s.nextInt();

        if (a % 2 == 0) {
            System.out.println("Broj a je deljiv sa dva");

        } else if (a % 3 == 0) {
            System.out.println("Broj a je deljiv sa tri");
        }

    }
}
