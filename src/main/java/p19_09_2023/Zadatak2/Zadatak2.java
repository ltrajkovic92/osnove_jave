package p19_09_2023.Zadatak2;

public class Zadatak2 {
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

        Disciplina skok = new Disciplina("Skok u dalj", "Skakac");
        Disciplina prepone = new Disciplina("110m s preponama", "Trkac");

        skok.dodajAtleticara(new Skakac("Djordje Miljenovic", 10));
        skok.dodajAtleticara(new Skakac("Marko Stojkovic", 8));
        skok.dodajAtleticara(new Skakac("Petar Petrovic", 7));

        prepone.dodajAtleticara(new Trkac("Marko Antic", 13));
        prepone.dodajAtleticara(new Trkac("Nenad Nenadovic", 14));

        skok.diskvalifikujeAtleticara("Marko Stojkovic");

        for (int i = 0; i < prepone.getAtleticari().size(); i++) {
            prepone.getAtleticari().get(i).print();
        }
        System.out.println();
        for (int i = 0; i < skok.getAtleticari().size(); i++) {
            skok.getAtleticari().get(i).print();
        }

        System.out.println();

        prepone.printNajboljiRezultat();

        System.out.println();

        skok.printNajboljiRezultat();

    }
}
