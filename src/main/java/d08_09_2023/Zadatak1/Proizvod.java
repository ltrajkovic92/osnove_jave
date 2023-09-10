package d08_09_2023.Zadatak1;

public class Proizvod {
    public String name;
    public double price;
    public double weight;

    public void print () {
        System.out.println(this.name + ", " + this.price + ", " + this.weight + " grama.");
    }
    public void increasePrice (int increase) {
        this.price = this.price + increase;
    }
    public double discountedPrice (int discount) {
        double discountAmount = this.price * discount/100;
        return this.price = this.price - discountAmount;
    }
    public int calcPostage () {
        if (this.weight <= 100) {
            return 200;
        } else if (this.weight > 100 && this.weight <= 500) {
            return 400;
        }
        return 1000;
    }
}
