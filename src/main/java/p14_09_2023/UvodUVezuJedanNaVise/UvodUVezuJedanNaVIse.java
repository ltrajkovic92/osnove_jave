package p14_09_2023.UvodUVezuJedanNaVise;

public class UvodUVezuJedanNaVIse {
    public static void main(String[] args) {

        Reziser director = new Reziser("Djordje Jovanovic");

        Film firstMovie = new Film("Movie1", 1999);
        Film secondMovie = new Film("Movie2", 2000);
        director.dodajFilm(firstMovie);
        director.dodajFilm(secondMovie);

        director.stampaj();
    }
}
