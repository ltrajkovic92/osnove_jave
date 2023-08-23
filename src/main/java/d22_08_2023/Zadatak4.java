package d22_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        //4.Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.
        //Primer izvrsenja 1:
        //Unesite broj:1
        //Unesite broj:2
        //Unesite broj:0
        //Unesite broj:2
        //Kraj programa.
        //(Objasnjenje: Kraj jer je uneto dve dvojke)
        //
        //Primer izvrsenja 1:
        //Unesite broj:1
        //Unesite broj:2
        //Unesite broj:1
        //Unesite broj:3
        //Unesite broj:1
        //Kraj programa.
        //(Objasnjenje: Kraj jer je uneto tri jedinice)

        Scanner s = new Scanner(System.in);

        int counter1 = 0;
        int counter2 = 0;

        while (counter1<3 && counter2<2) {
            System.out.print("Unesite broj: ");
            int number = s.nextInt();

            if (number==1) {
                counter1++;
            } else if (number==2) {
                counter2++;
            }
            if (counter1==3) {
                System.out.println("Kraj programa.");
                System.out.println("(Objasnjenje: Kraj jer je uneto tri jedinice)");
            } else if (counter2==2) {
                System.out.println("Kraj programa.");
                System.out.println("(Objasnjenje: Kraj jer je uneto dve dvojke)");
            }
        }
    }
}
