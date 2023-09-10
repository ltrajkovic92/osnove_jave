package p08_09_2023.Zadatak2;

public class Auto {
    public String name;
    public String brand;
    public int doors;
    public double avarage;
    public int currentSpeed;
    public int year;
    public int registrationDate;
    public int kubikaza;
    public String registrationNo;
    public boolean climate;
    public int maxSpeed;


    public void print() {
        System.out.println(this.name);
        System.out.println(this.brand + " - " + this.doors + "-ro vrata");
        System.out.println("Sa potrosnjom od " + this.avarage + " l na 100km");
        System.out.println(this.currentSpeed + " km/h je trenutna brzina");
    }
    public boolean speeding(int ogranicenje) {
        if (this.currentSpeed > ogranicenje) {
            return true;
        }
        return false;
    }
    public int ticket(int ogranicenje) {
        if (this.currentSpeed>ogranicenje) {
            return (this.currentSpeed - ogranicenje) * 1000;
        }
        return 0;
    }
    public boolean oldTimer () {
        if (1950<this.year) {
            return true;
        }
        return false;
    }
    public boolean registration(int trenutniMesec) {
        if (this.registrationDate > trenutniMesec) {
            return true;
        }
        return false;
    }
    public int registrationPrice(){
        if (this.kubikaza <= 2000) {
            return this.kubikaza * 100;
        }
        if (kubikaza > 2000) {
            return kubikaza * 130;
        }
        return 0;
    }
    public void dodajGas () {
        this.currentSpeed = this.currentSpeed + 10;
        if (this.currentSpeed > this.maxSpeed) {
            this.currentSpeed = this.maxSpeed;
        }
    }
    public void koci (){
        this.currentSpeed = this.currentSpeed - 10;
        if (this.currentSpeed < 0) {
            this.currentSpeed = 0;
        }
    }
    public double calcClimateFactor() {
        double climateFactor = 1.0;
        if (this.climate) {
            climateFactor = 1.2;
        }
        return climateFactor;
    }
    public double currentConsumption() {
        return (this.currentSpeed / 100.0 * this.avarage) * this.calcClimateFactor();
    }
    public void printTable() {
        for(int i = 0; i < 100; i++) {
            if (i<=currentSpeed*100/maxSpeed) {
                System.out.print("|");
            } else {
                System.out.print(".");
            }
        }
        System.out.print(currentSpeed + "/" + maxSpeed + "km/h");
    }
}
