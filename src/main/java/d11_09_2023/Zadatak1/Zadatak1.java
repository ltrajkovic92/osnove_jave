package d11_09_2023.Zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {

        //1. Kreirati klasu Autor koja ima
        //-ime i prezime
        //-konstuktore koje mislite da su vam potrebni
        //-gettere i settere za atribute
        //-metodu print koja stampa u formatu:
        //(ime autora) (prezime autora)
        //
        //Kreirati klasu Knjiga koji ima:
        //-ISBN
        //-naziv
        //-godina izdanja
        //-autor
        //-konstuktore koje mislite da su vam potrebni
        //-gettere i settere za atribute
        //-metodu print koja stampa u formatu (izbegavati dupliranje koda):
        //(ISBN)
        //(naziv) - (godina izdanja)
        //autor: (ime autora) (prezime autora)
        //
        //	U glavnom programu napraviti vise autora sa vise knjiga.

        Autor firstAuthor = new Autor("Lesléa", "Newman");
        Autor secondAuthor = new Autor("Mirjana", "Bobić-Mojsilović");

        Knjiga firstBook = new Knjiga("20-8050-7336-1", "Hachiko Waits", 2004, firstAuthor);
        firstBook.print();

        System.out.println();

        Knjiga secondBook = new Knjiga();
        secondBook.setISBN("978-86-521-4862-2");
        secondBook.setTitle("Sazvežđe svitaca");
        secondBook.setYear(2023);
        secondBook.setAuthor(secondAuthor);

        secondBook.print();

    }
}
