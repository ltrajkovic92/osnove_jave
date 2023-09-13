package p12_09_2023.Zadatak4;

public class Sastojak {
    private String name;
    private int price;

    public Sastojak () {

    }
    public Sastojak (String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return this.price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void print () {
        System.out.println("Naziv: " + this.name + ", cena: " + this.price);
    }
}
