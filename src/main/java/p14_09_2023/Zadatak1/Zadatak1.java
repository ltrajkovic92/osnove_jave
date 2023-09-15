package p14_09_2023.Zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {

        //adatak
        //
        //Kreirati klasu Sastojak koja ima:
        //naziv
        //cenu
        //gettere i settere
        //konstruktore
        //metodu za stampanje koja stampa  podatke u formatu:
        //naziv - cena.din
        //
        //	Kreirati klasu Pasta koja ima:
        //niz sastojaka
        //metodu za dodavanje sastojka
        //defaultni konstruktor
        //metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
        //metodu za stampu koja stampa podatke u formatu:
        //Pasta je sa sastojcima:
        //naziv - cena.din
        //naziv - cena.din
        //naziv - cena.din
        //Cena paste je <sracunata cena paste>.din
        //
        //U glavnom programu kreirati objekte i testirati funkcionalnosti
        //
        //(ostavite za kraj) metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.

        Pasta firstPasta = new Pasta();

        Sastojak first = new Sastojak("Zacin1", 199);
        Sastojak second = new Sastojak("Zacin2", 200);
        Sastojak third = new Sastojak("Zacin3", 250);

        firstPasta.dodajSastojak(first);
        firstPasta.dodajSastojak(second);
        firstPasta.dodajSastojak(third);

        firstPasta.print();

        firstPasta.deleteIngredient("Zacin2");

        firstPasta.print();
    }
}
