package d15_09_2023.Zadatak1;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        //1.Zadatak
        //Kreirati klasu Osoba koja ima:
        //-	ime i prezime
        //-	jmbg
        //-	godinu rodjenja
        //-	default-ni konstuktor
        //-	konstuktor sa parametrima
        //-	gettere i settere
        //-	metodu stampaj koja stampa u formatu:
        //(ime i prezime), (jmbg), (godina rodjenja)
        //
        //Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
        //-	broj (broj koji igrac nosi)
        //-	poziciju koju igra (odbrambeni, napadac, … )
        //-	kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
        //-	default-ni konstuktor
        //-	konstuktor sa parametrima
        //-	gettere i settere za broj, kapiten i poziciju
        //-	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
        //
        //Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
        //-	godine iskustva
        //-	tip trenera (kondicioni, za igru, pomocni, personalni)
        //-	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
        //
        //U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode a zatim kreirati niz igraca i niz trenera, na kraju programa ispisati sve igrace i trenere.
        //Podatke za igrace i trenere unosi korisnik sa tastature.


        ArrayList<Igrac> players = new ArrayList<>();
        ArrayList<Trener> coaches = new ArrayList<>();

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.print("Unesite ime igraca: ");
            String name = s.next();
            System.out.print("Unesite prezime igraca: ");
            String lastName = s.next();
            System.out.print("Unesite jmbg igraca: ");
            String personalNo = s.next();
            System.out.print("Unesite godinu rodjenja igraca: ");
            int birthYear = s.nextInt();
            System.out.print("Unesite broj igraca: ");
            int playerNo = s.nextInt();
            System.out.print("Unesite poziciju igraca: ");
            String position = s.next();
            System.out.print("Da li je igrac kapiten? ");
            boolean isCaptain = s.nextBoolean();
            players.add(new Igrac(name + " " + lastName, personalNo, birthYear, playerNo, position, isCaptain));
            System.out.println();
        }

        for (int i = 0; i < 2; i++) {
            System.out.print("Unesite ime trenera: ");
            String name = s.next();
            System.out.print("Unesite prezime trenera: ");
            String lastName = s.next();
            System.out.print("Unesite jmbg trenera: ");
            String personalNo = s.next();
            System.out.print("Unesite godinu rodjenja trenera: ");
            int birthYear = s.nextInt();
            System.out.print("Unesite godine iskustva trenera: ");
            int experienceNo = s.nextInt();
            System.out.print("Unesite tip trenera: ");
            String coachType = s.next();
            coaches.add(new Trener(name + " " + lastName, personalNo, birthYear, experienceNo, coachType));
            System.out.println();
        }


        for (int i = 0; i < players.size(); i++) {
            players.get(i).print();
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < coaches.size(); i++) {
            coaches.get(i).print();
            System.out.println();
        }

    }
}
