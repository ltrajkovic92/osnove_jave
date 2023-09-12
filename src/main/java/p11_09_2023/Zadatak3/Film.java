package p11_09_2023.Zadatak3;

public class Film {
    private String name;
    private int year;

    public Film() {

    }

    public Film(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void print() {
        System.out.println(this.name + ", " + this.year + ".god");
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
}
