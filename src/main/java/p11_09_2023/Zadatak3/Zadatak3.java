package p11_09_2023.Zadatak3;

public class Zadatak3 {
    public static void main(String[] args) {

        //3.Zadatak
        //Kreirati klasu Film koja ima:
        //●	naziv filma
        //●	iz koje godine je film
        //●	konstruktore, gettere i settere
        //●	metodu print koja stampa podatke u formatu
        //naziv filma, godina
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

        Film first = new Film("Inception", 2010);
        Reziser firstDirector = new Reziser("Christopher Nolan",1970);
        first.print();
        firstDirector.print();

        Film second = new Film();
        second.setName("OnePiece");
        second.setYear(1999);

        Reziser secondDirector = new Reziser();
        secondDirector.setDirectorName("Eiichirô Oda");
        secondDirector.setBorn(1975);

        second.print();
        secondDirector.print();
    }
}
