package d11_09_2023.Zadatak1;

public class Knjiga {
    private String ISBN;
    private String title;
    private int year;
    private Autor author;

    public Knjiga () {}
    public Knjiga(String ISBN, String title, int year, Autor author) {
        this.ISBN = ISBN;
        this.title = title;
        this.year = year;
        this.author = author;
    }
    public void print () {
        System.out.println(this.ISBN);
        System.out.println(this.title + " - " + this.year);
        if (this.author != null) {
            System.out.print("Autor: ");
            this.author.print();
        }
    }
    public void setISBN (String ISBN) {
        this.ISBN = ISBN;
    }
    public String getISBN () {
        return this.ISBN;
    }
    public void setTitle (String title) {
        this.title = title;
    }
    public String getTitle () {
        return this.title;
    }
    public void setYear (int year) {
        this.year = year;
    }
    public int getYear () {
        return this.year;
    }
    public void setAuthor (Autor author) {
        this.author = author;
    }
    public Autor getAuthor () {
        return this.author;
    }
}
