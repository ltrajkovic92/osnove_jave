package p19_09_2023.Zadatak1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {

        //Zadatak 1.. Kreirati abstraktnu klasu Objekat ciji su zasticeni atributi. NE NAZIVAJTE KLASU OBJECT !!
        //-	adresa (ulica i broj)
        //-	povrsina objekta
        //-	zona (1, 2 ili 3)
        //-	konstuktore, gettere i settere
        //-	metodu koja vraca koeficijent koji ce se koristiti za racunanje poreza u zavisnosti u kojoj zoni se nalazi objekat
        //-	zona 1, koeficijent je 1.4
        //-	zona 2, koeficijent je 1.1
        //-	zona 3, koeficijent je 1.05
        //-	abstraktnu metodu koja racuna i vraca porez objekta
        //-	abstraktnu metodu stampaj
        //
        //	Kreirati klasu Kuca koja nasledjuje klasu Objekat koja ima broj clanova koji zive u tom objektu,
        //-	konstuktore, gettere i setter
        //-	porez racuna po formuli: koeficijent * povrsina.
        //-	prepisati metodu stampaj tako da stampa sve podatke vezane za kucu
        //	Kreirati klasu Zgrada koja nasledjuje klasu Objekat koja ima
        //-	broj stanova
        //-	konstuktore, gettere i setter
        //-	porez racuna po formuli koeficijent * povrsina * broj stanova
        //-	prepisati metodu stampaj tako da stampa sve podatke vezane za zgradu
        //	Kreirati klasu Lokal koja naslejduje klasu Objekat koja od metoda ima:
        //-	konstuktore
        //-	porez racuna po formuli koeficijent * povrsina * 1.3
        //-	prepisati metodu stampaj tako da stampa sve podatke vezane za lokal
        //	Kreirati klasu PoreskaUprava koja za atribute ima:
        //-	ime grada u kom se nalazi
        //-	niz objekata
        //-	metodu dodaj objekat
        //-	metodu koja vraca objekat sa najvecim porezom public Objekat najveciPorez
        //-	metodu koja vraca objekat sa najmanjim porezom
        //-	metodu koja racuna ukupan porez za ceo grad
        //-	metodu koja stampa sve objekte
        //U glavnom programu napraviti jednu poresku upravu i u nju dodati minimum 5 razlicita objekta i istestirati sve metode.

        PoreskaUprava poreska = new PoreskaUprava("Nis");

        Objekat objekat1 = new Kuca("Bulevar Nemanjica",55, 1,5);
        Objekat objekat2 = new Zgrada("Bulevar Medijana", 1000,2,20);
        Objekat objekat3 = new Lokal ("Knjazevacka", 30,3);
        Objekat objekat4 = new Lokal("Obelicev venac",40, 1);
        Objekat objekat5 = new Lokal("Obelicev venac",25, 2);

        poreska.dodajObjekat(objekat1);
        poreska.dodajObjekat(objekat2);
        poreska.dodajObjekat(objekat3);
        poreska.dodajObjekat(objekat4);
        poreska.dodajObjekat(objekat5);

        poreska.dodajObjekat(new Kuca("Dusanova",62,1,3 ));

        poreska.printAll();

        System.out.println();

        System.out.println("Najveci porez: " + poreska.najveciPorez().porez());
        System.out.println("Najmanji porez: " + poreska.najmanjiPorez().porez());
        System.out.println("Ukupan porez: " + poreska.ukupanPorez());
    }
}
