package mini_projekat;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        //5.	**Zadatak: Generisanje Random Passworda sa Specijalnim Karakterom**
        //
        //Kako biste saznali više o generisanju random brojeva u programiranju, preporučujemo da istražite sledeći link: random koristeci Random class. Ovaj resurs će vam pružiti detaljnije razumevanje kako programi generišu slučajne brojeve i kako ih možete koristiti u različitim situacijama.
        //
        //Napišite program koji simulira automatsko generisanje random passworda. Korisnik će uneti željenu dužinu passworda, a program će kreirati i ispisati password koji zadovoljava te parametre. Ovaj zadatak zahteva implementaciju različitih metoda za generisanje karaktera i passworda.
        //●	generisiRandomKarakter: Ova metoda generiše i vraća random karakter. Metoda koristi niz stringova sa elementima koji predstavljaju mala slova, velika slova i brojeve (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao povreatnu vrednost (string). Ova metoda nema ulazne parametre.
        //●	generisiRandomSpecijalanKarakter: Ova metoda generiše i vraća random specijalan karakter. Metoda koristi niz stringova sa elementima `@`, `#`, `&`, `*` i `!` (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao string. Ova metoda nema ulazne parametre.
        //
        //Napomena: Metode generisiRandomSpecijalanKarakter generisiRandomKarakter nemaju nikakvu stampu u sebi!
        //
        //Glavni program:
        //   - Korisnik unosi dužinu passworda i informaciju da li treba sadržati specijalan karakter.
        //   - Koristeći metodu `generisiPassword`, program generiše i ispisuje password.
        //
        //Primer izvršenja 1:
        //Unesite dužinu passworda: 10
        //Da li želite da sadrži specijalan karakter: true
        //Generisan password: eD9Kx0e@
        //
        //Primer izvršenja 2:
        //Unesite dužinu passworda: 10
        //Da li želite da sadrži specijalan karakter: false
        //Generisan password: eCxdwEeFEx

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite duzinu passworda: ");
        int duzinaPassworda = s.nextInt();
        System.out.print("Da li zelite da sadrzi specijalan karakter: ");
        boolean imaSpecijalanKarakter = s.nextBoolean();

        String generisiPassword = generisiPassword(duzinaPassworda, imaSpecijalanKarakter);
        System.out.println("Generisan password: " + generisiPassword);
    }
    public static String generisiPassword (int duzinaPassworda, boolean imaSpecijalanKarakter) {
        String password = "";
        for (int i = 1; i <= duzinaPassworda; i++) {
            if(imaSpecijalanKarakter && i == duzinaPassworda){
                password = password + generisiRandomSpecijalanKarakter();
            }
            else
                password = password + generisiRandomKarakter();
        }
        return password;
    }
    public static String generisiRandomKarakter () {
        ArrayList<String> karakter = new ArrayList<>();

        karakter.add("A"); karakter.add("a");
        karakter.add("B"); karakter.add("b");
        karakter.add("C"); karakter.add("c");
        karakter.add("D"); karakter.add("d");
        karakter.add("E"); karakter.add("e");
        karakter.add("F"); karakter.add("f");
        karakter.add("G"); karakter.add("g");
        karakter.add("H"); karakter.add("h");
        karakter.add("I"); karakter.add("i");
        karakter.add("J"); karakter.add("j");
        karakter.add("K"); karakter.add("k");
        karakter.add("L"); karakter.add("l");
        karakter.add("M"); karakter.add("m");
        karakter.add("N"); karakter.add("n");
        karakter.add("O"); karakter.add("o");
        karakter.add("P"); karakter.add("p");
        karakter.add("Q"); karakter.add("q");
        karakter.add("R"); karakter.add("r");
        karakter.add("S"); karakter.add("s");
        karakter.add("T"); karakter.add("t");
        karakter.add("U"); karakter.add("u");
        karakter.add("V"); karakter.add("v");
        karakter.add("W"); karakter.add("w");
        karakter.add("X"); karakter.add("x");
        karakter.add("Y"); karakter.add("y");
        karakter.add("Z"); karakter.add("z");

        karakter.add("0");
        karakter.add("1");
        karakter.add("2");
        karakter.add("3");
        karakter.add("4");
        karakter.add("5");
        karakter.add("6");
        karakter.add("7");
        karakter.add("8");
        karakter.add("9");

        Random random = new Random();
        return karakter.get(random.nextInt(karakter.size()));
    }
    public static String generisiRandomSpecijalanKarakter () {
        ArrayList<String> specijalniKarakter = new ArrayList<>();

        specijalniKarakter.add("@");
        specijalniKarakter.add("#");
        specijalniKarakter.add("&");
        specijalniKarakter.add("*");
        specijalniKarakter.add("!");

        Random random = new Random();
        return specijalniKarakter.get(random.nextInt(specijalniKarakter.size()));
    }
}
