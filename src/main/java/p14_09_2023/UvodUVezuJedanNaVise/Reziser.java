package p14_09_2023.UvodUVezuJedanNaVise;

import java.util.ArrayList;

public class Reziser {
    private String fullName;
    private ArrayList<Film> movies;

    public ArrayList<Film> getMovies() {
        return this.movies;
    }
    public void dodajFilm (Film newFilm) {
        this.movies.add(newFilm);
    }

    public void stampaj (){
        System.out.println("Reziser: " + this.fullName);
        for (int i = 0; i < this.movies.size(); i++) {
            System.out.println("Film: " + this.movies.get(i).getName());
        }
    }

    public Reziser() {
        this.movies = new ArrayList<>();
    }

    public Reziser(String fullName) {
        this.fullName = fullName;
        this.movies = new ArrayList<>();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
