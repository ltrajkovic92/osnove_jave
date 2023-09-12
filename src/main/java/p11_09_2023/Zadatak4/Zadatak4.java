package p11_09_2023.Zadatak4;

public class Zadatak4 {

    //4.Zadatak
    //Kreirati klasu Film koja ima:
    //●	naziv filma
    //●	iz koje godine je film
    //●	reziser
    //●	konstruktore, gettere i settere
    //●	getter i setter za rezisera
    //●	metodu print koja stampa podatke u formatu
    //naziv filma, godina
    //Rezirao ga: ime i prezime rezisera, starost
    //
    //
    //Kreirati klasu Reziser koja ima:
    //●	ime i prezime rezisera
    //●	starost
    //●	konstruktore, gettere i settere koji su potrebni
    //●	metodu print koja stampa podatke u formatu
    //●	ime prezime, starost.god
    //
    //U main metodi, kreirati jedan film i jednog rezisera i pozvati svaku od metoda
    //Napravite vezu izmedju objekata i pozovite metode.

    public static void main(String[] args) {
        Film firstMovie = new Film("Inception", 2010);

        Reziser firstDirector = new Reziser("Christopher Nolan", 1970);

        firstMovie.setDirector(firstDirector);
        firstMovie.print();

    }
}
