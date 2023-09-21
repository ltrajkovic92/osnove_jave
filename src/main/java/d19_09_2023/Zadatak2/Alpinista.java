package d19_09_2023.Zadatak2;

public class Alpinista extends Planinar{
    private int points;

    public Alpinista(int id, String fullName, int points) {
        super(id, fullName);
        this.points = points;
    }

    @Override
    public double membershipFee() {
        double discount = this.points * 50;
        return 1500.0 - discount;
    }
    @Override
    public boolean successfulClimb(Planina planina) {
        return planina.getMountainHeight() <= 4000;
    }
    @Override
    public void print() {
        System.out.println("Alpinista, id: " + this.id);
        System.out.println(("Ime: " + this.fullName));
        System.out.println("Broj poena: " + this.points);
    }

    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
}
