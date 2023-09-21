package d19_09_2023.Zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {

        //1.Zadatak
        //Kreirati abstraktnu klasu Ambalaza koja ima:
        //-	barkod (primer: 328232-2823)
        //-	naziv artikla
        //-	neto tezinu
        //-	bruto tezinu
        //-	konstuktore (default-ni i sa parametrima)
        //-	gettere i settere
        //-	metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
        //-	abstraktnu metodu koja vraca cenu artikla
        //-	abstraktnu metodu stampaj
        //
        //Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
        //-	atribut koji kaze da li se moze reciklirati
        //-	osnovna cena
        //-	gettere i setter za atribute
        //-	konstuktori koji su vam potrebni
        //-	racuna cenu tako da ispunjava uslova:
        //-	ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
        //-	ako nije u cenu ulazi samo osnovna cena
        //-	metoda stampaj stampa sve podatke iz klase tetrapak.
        //
        //
        //Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
        //-	kaucija za flasu
        //-	atribut koji kaze da li se za flasu placa kaucija
        //-	osnovna cena
        //-	gettere i setter za atribute
        //-	konstuktori koji su vam potrebni
        //-	racuna cenu
        //-	ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
        //-	ako se ne placa, (osnovna cena) * 1.2
        //-	metoda stampaj stampa sve podatke iz klase staklena flasa.
        //
        //Kreirati klasu SuperKartica koja ima:
        //-	broj kartice
        //-	ime i prezime vlasnika
        //-	popust (200, 500, … )
        //-	konstuktore (default-ni i sa parametrima)
        //-	gettere i settere
        //-	metodu stampaj koja stampa karticu u formatu:
        //(broj kartice), (ime i prezime)
        //
        //Kreirati klasu Korpa koja ima:
        //-	niz ambalaza
        //-	metodu dodaj ambalazu
        //-	metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
        //-	privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
        //-	metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.
        //
        //U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.

        Korpa cart = new Korpa();

        Tetrapak tetrapak1 = new Tetrapak("3202556-11221", "Mleko",900,1000,true,140);
        Tetrapak tetrapak2 = new Tetrapak("2352-12121", "Sok",1350,1500,false,200);

        StaklenaAmbalaza glass1 = new StaklenaAmbalaza("23256-5252", "Rakija", 950,1000,0,false,1300);
        StaklenaAmbalaza glass2 = new StaklenaAmbalaza("45242-4544","Pivo", 450,500,20,true,150);

        tetrapak1.print();
        tetrapak2.print();
        System.out.println();

        glass1.print();
        glass2.print();
        System.out.println();

        cart.addPackaging(tetrapak1);
        cart.addPackaging(tetrapak2);
        cart.addPackaging(glass1);
        cart.addPackaging(glass2);
        cart.removePackaging("3202556-11221");


        SuperKartica superKartica = new SuperKartica("5256552","Petar Petrovic",300);
        superKartica.print();

        System.out.println("Ukupna cena sa popustom Super kartice: " + cart.totalCartPrice(superKartica));

    }
}
