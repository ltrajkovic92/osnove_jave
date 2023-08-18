package p17_08_2023;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesi ime: ");
        String ime = s.next();
        System.out.print("Unesi prezime: ");
        String prezime = s.next();
        System.out.print("Unesi broj: ");
        String broj = s.next();
        System.out.print("Unesi email: ");
        String email = s.next();
        System.out.print("Unesi jmbg: ");
        String jmbg  = s.next();

        System.out.println(ime + " " + prezime + " - " + jmbg);
        System.out.println("Broj telefona: " + broj);
        System.out.println("Email: " + email);

        //Napisati program koji sa tastature ucitava ime, prezime, broj telefona, email  i jmbg korisnika prikazuje u formatu:
        //[Ime] [Prezime] - [JMBG]
        //Broj Tel: [Broj telefona],
        //Email: [Email]
     }
}