package d12_09_2023.Zadatak4;

public class ElektricniSporet {
    private String brand;
    private int warranty;
    private int maxTurnedOn;
    private Ringla upLeft;
    private Ringla upRight;
    private Ringla downLeft;
    private Ringla downRight;

    public ElektricniSporet(String brand, int warranty, int maxTurnedOn, Ringla upLeft, Ringla upRight, Ringla downLeft, Ringla downRight) {
        this.brand = brand;
        this.warranty = warranty;
        this.maxTurnedOn = maxTurnedOn;
        this.upLeft = upLeft;
        this.upRight = upRight;
        this.downLeft = downLeft;
        this.downRight = downRight;
    }

    public void increase (int position) {
        int counter = 0;
        if (this.upLeft.isTurnedOn()) {counter++;}
        if (this.upRight.isTurnedOn()) {counter++;}
        if (this.downLeft.isTurnedOn()) {counter++;}
        if (this.downRight.isTurnedOn()) {counter++;}

        if (position == 1){
            if (counter > this.maxTurnedOn){
                turnOff(2);
                turnOff(3);
                turnOff(4);
            }
            this.upLeft.increaseStrenght();
        }
        if (position == 2){
            if (counter > this.maxTurnedOn){
                turnOff(1);
                turnOff(3);
                turnOff(4);
            }
            this.upRight.increaseStrenght();
        }
        if (position == 3){
            if (counter > this.maxTurnedOn){
                turnOff(1);
                turnOff(2);
                turnOff(4);
            }
            this.downLeft.increaseStrenght();
        }
        if (position == 4){
            if (counter > this.maxTurnedOn){
                turnOff(1);
                turnOff(3);
                turnOff(2);
            }
            this.downRight.increaseStrenght();
        }
    }
    public void turnOff (int position) {
        if (position == 1) {this.upLeft.turnOff();}
        if (position == 2) {this.upRight.turnOff();}
        if (position == 3) {this.downLeft.turnOff();}
        if (position == 4) {this.downRight.turnOff();}
    }

    public double totalConsumption (int time) {
        return this.upLeft.consumption(time) + this.upRight.consumption(time) + this.downLeft.consumption(time) + this.downRight.consumption(time);
    }
    public void print () {
        System.out.println(this.brand + " - " + this.warranty + " godina.");
        System.out.println("Ringle ");
        System.out.println();
        System.out.println("Gore levo: ");
        this.upLeft.isTurnedOn();
        this.upLeft.print();
        System.out.println();

        System.out.println("Gore desno: ");
        this.upRight.isTurnedOn();
        this.upRight.print();
        System.out.println();

        System.out.println("Dole levo: ");
        this.downLeft.isTurnedOn();
        this.downLeft.print();
        System.out.println();

        System.out.println("Dole desno: ");
        this.downRight.isTurnedOn();
        this.downRight.print();
    }

    public String getBrand() {
        return brand;
    }

    public int getWarranty() {
        return warranty;
    }

    public int getMaxTurnedOn() {
        return maxTurnedOn;
    }

    public Ringla getUpLeft() {
        return upLeft;
    }

    public Ringla getUpRight() {
        return upRight;
    }

    public Ringla getDownLeft() {
        return downLeft;
    }

    public Ringla getDownRight() {
        return downRight;
    }
}
