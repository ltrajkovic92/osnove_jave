package p14_09_2023.Zadatak3;

public class Zadatak3 {
    public static void main(String[] args) {

        //3.Zadatak(Za vezbanje)
        //Za potrebe google istorije potrebno je kreirati sledece klase.
        //Klasu HistoryPage koja ima:
        //●	naziv stranice
        //●	link do stranice
        //●	vreme otvaranja stranice - sat i minut (2 atributa)
        //●	username i password sacuvani za ovu stranicu (kao objasnjene ovo su kao kolacici za neki sajt)
        //●	konstuktore koji su logicni
        //●	gettere i setter (username i password nemaju settere)
        //●	metodu sacuvaj kredencijale za ovu stranicu. Metoda kao parametre  prima username i password i setuje te atribute.
        //●	Metoda obrisi kolacice koja setuje username i password na null.
        //●	Metoda stampaj koja stampa podatke u formatu:
        //[sat] - [minut] - [ naziv ]…[ link ] [Ako postoje kredencijali stampa se zvezdica pored linka]
        //
        //Klasu History koja ima:
        //●	niz stranica koje su posecene
        //●	metoda otvori stranicu koja dodaje novi historypage u niz.
        //●	metodu obrisi prema linku - metoda koja iz niza izbacuje stranicu prema linku
        //●	metoda obrisi kolacice za link - metoda koja za homepage brise kolacice
        //●	metoda obrisi istoriju - metoda brise celu istoriju
        //●	metoda sacuvajKredencija - od parametara se prima naziv stranice i username i password koji se cuvaju.
        //●	metoda pogledajIstoriju - stampa sve posecene stranice
        //●	metoda obrisiSveKolacice - metoda brise kredencijale za sve stranice.
        //●	metoda obrisiSveKolaciceZaSadnjihSatVremena-  brise kolacice za strnaice koje su ucitane u zadnjih sat vremena. Metoda kao parametar prima trenutno vreme (sat i minut)

        HistoryPage page1 = new HistoryPage("Page1", "https://www.facebook.com",1,18);
        HistoryPage page2 = new HistoryPage("Page2", "https://accounts.google.com/.com", 1, 34);
        HistoryPage page3 = new HistoryPage("Page3","https://youtube.com",2,56);

        History history = new History();
        history.openPage(page1);
        history.openPage(page2);
        history.openPage(page3);

        history.seeHistory();
        System.out.println();

        history.deleteCookiesLastHour(1,30);

        history.seeHistory();
    }
}
