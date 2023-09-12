package p11_09_2023.Zadatak4;

public class Film {
    private String name;
    private int year;
    private Reziser director;

    public Film() {

    }
    public Film(String name, int year, Reziser director) {
        this.name = name;
        this.year = year;
        this.director = director;
    }
    public Film (String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void print() {
        System.out.println(this.name + ", " + this.year + ".god");
        if (this.director != null) {
            this.director.print();
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Reziser getDirector() {
        return this.director;
    }
    public void setDirector (Reziser director) {
        this.director = director;
    }
}
