package p14_09_2023.Zadatak1;

public class Sastojak {
    private String name;
    private double price;

    public Sastojak() {
    }

    public Sastojak(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public void print () {
        System.out.println(this.name + " - " + this.price + ".din");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
