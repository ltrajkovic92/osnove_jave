package d12_09_2023.Zadatak4;

public class Ringla {
    private String type;
    private int strength;
    private double heatherPower;

    public Ringla(String type, double heatherPower) {
        this.type = type;
        this.heatherPower = heatherPower;
        this.strength = 0;
    }
    private int maxStrength () {
        if (type.equals("obicna")) {return 3;}
        if (type.equals("ekspres")) {return 12;}
        return 0;
    }
    public void increaseStrenght () {
        if (this.strength<maxStrength()) {
            this.strength++;
        }
    }
    public void turnOff () {
        this.strength = 0;
    }
    public boolean isTurnedOn () {
        return this.strength>0;
    }
    public double consumption (int time) {
        return 100/this.maxStrength()*this.strength*this.heatherPower*time;
    }
    public void print () {
        System.out.println("Ringla je " + (this.isTurnedOn() ? "ukljucena":"iskljucena"));
        System.out.println("Tip ringle: " + this.type);
        System.out.println("Jacina: " + this.strength);
        System.out.println("Grejac: " + this.heatherPower + "kW");
    }
    public int getStrength() {
        return strength;
    }
}
