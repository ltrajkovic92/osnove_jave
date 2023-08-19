package p18_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite jacinu zvuka: ");
        int jacinaZvuka = s.nextInt();

        System.out.print("<");

        if (jacinaZvuka == 0) {
            System.out.println("/");
        } else for (int i = 1; i <= jacinaZvuka; i++) {
            System.out.print("|");
        }
    }
}
