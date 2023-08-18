package d17_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesi ime: ");
        String name = s.next();
        System.out.print("Unesi prezime: ");
        String lastName = s.next();
        System.out.print("Unesi godinu rodjenja: ");
        int dateOfBirth = s.nextInt();

        int numOfYears = 2023 - dateOfBirth;

        System.out.println(name + " " + lastName + " - " + numOfYears + " god.");

        //1.Napisati program koji ima informacije koje ucitava informacije sa tastature:
        //●	Ime
        //●	Prezime
        //●	godinu rodjenja
        //I stampa informaicije u formatu:
        //[ime] [prezime] - [startost] god
        //
        //Primer izvrsenja:
        //Ako je ime = Milan, prezime = Jovanovic i godina rodjenja 1995 stapaju se informacije
        //Milan Jovanovic - 26 god
    }
}
