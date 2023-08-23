package d22_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        //1.Napisati program koji sabira brojeve koje korisnik unosi, pritom da suma ne predje 100.
        // Na kraju programa ispisati sracunatu sumu.
        //Unesite vrednost: 20
        //Unesite vrednost: 50
        //Unesite vrednost: 50
        //Prekoracenje! Kraj programa. Sracunata suma je 70.

        Scanner s = new Scanner(System.in);

        int vrednost = 0;
        int suma = 0;
        boolean isOffLimits = false;

        while (!isOffLimits) {
            if (suma < 100) {
                System.out.print("Unesite vrednost: ");
                vrednost = s.nextInt();
            }
            if (suma >= 100) {
                isOffLimits=true;
                System.out.println("Prekoracenje! Kraj programa. Sracunata suma je: " + (suma-vrednost));
            }
            suma = suma + vrednost;
        }
    }
}
