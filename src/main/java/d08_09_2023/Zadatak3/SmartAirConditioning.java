package d08_09_2023.Zadatak3;

public class SmartAirConditioning {

    public String brand;
    public int coolingConsumption;
    public int heatingConsumption;
    public int temp;
    public String mod;

    public void print () {
        System.out.println(this.brand + " - " + this.mod + " - " + this.temp);
    }
    public int monthConsumptionEnergy () {
        if (this.mod.equals("greje")) {
            return 30*15*this.heatingConsumption;
        }
        return 30*15*this.coolingConsumption;
    }
    public int monthConsumptionPrice () {
        if (monthConsumptionEnergy() <= 350) {
            return this.monthConsumptionEnergy() * 6;
        }
        return this.monthConsumptionEnergy() * 9;
    }
}
