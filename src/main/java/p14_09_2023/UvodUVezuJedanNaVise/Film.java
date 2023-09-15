package p14_09_2023.UvodUVezuJedanNaVise;

public class Film {
    private String name;
    private int year;

    public Film() {
    }

    public Film(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void stampaj () {
        System.out.println("Naziv: " + this.name);
        System.out.println("Godina: " + this.year);
    }
}
