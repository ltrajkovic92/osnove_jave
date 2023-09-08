package p07_09_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Racun posiljalac = new Racun();
        posiljalac.broj = "840-23932-323";
        posiljalac.vlasnik = "Stefan Stefanovic";
        posiljalac.stanje = 1000;

        Racun primalac = new Racun();
        primalac.broj = "840-2323232-323";
        primalac.vlasnik = "Petar Petrovic";
        primalac.stanje = 200;

        System.out.println("Posaljilac: " + posiljalac.vlasnik + ", " + posiljalac.broj + "stanje: " + posiljalac.stanje);
        System.out.println("Posaljilac: " + primalac.vlasnik + ", " + primalac.broj + "stanje: " + primalac.stanje);

        System.out.println("Unesite sumu za transakciju: ");
        int suma = s.nextInt();

        posiljalac.stanje = posiljalac.stanje - suma;
        primalac.stanje = primalac.stanje + suma;

        System.out.println("Posaljilac: " + posiljalac.vlasnik + ", " + posiljalac.broj + "stanje: " + posiljalac.stanje);
        System.out.println("Posaljilac: " + primalac.vlasnik + ", " + primalac.broj + "stanje: " + primalac.stanje);



    }
}
