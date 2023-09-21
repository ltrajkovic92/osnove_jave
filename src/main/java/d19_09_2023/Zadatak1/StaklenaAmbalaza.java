package d19_09_2023.Zadatak1;

public class StaklenaAmbalaza extends Ambalaza{
    private double bottleDeposit;
    private boolean hasDeposit;
    private double basePrice;

    public StaklenaAmbalaza(String barcode, String name, double netWeight, double grossWeight, double bottleDeposit, boolean hasDeposit, double basePrice) {
        super(barcode, name, netWeight, grossWeight);
        this.bottleDeposit = bottleDeposit;
        this.hasDeposit = hasDeposit;
        this.basePrice = basePrice;
    }

    @Override
    public double articalPrice() {
        if (this.hasDeposit) {
            return this.basePrice * 1.2 + this.bottleDeposit;
        } else {return this.basePrice * 1.2;}
    }

    @Override
    public void print() {
        System.out.println("Barkod: " + this.barcode + ", naziv: " + this.name + ", tezina: " + this.packageWeight() + "g.");
        if (hasDeposit) {
            System.out.println("Kaucija za flasu je: " + this.bottleDeposit);
        }
        System.out.println("Cena: " + this.articalPrice());
    }

    public double getBottleDeposit() {
        return bottleDeposit;
    }

    public void setBottleDeposit(double bottleDeposit) {
        this.bottleDeposit = bottleDeposit;
    }

    public boolean isHasDeposit() {
        return hasDeposit;
    }

    public void setHasDeposit(boolean hasDeposit) {
        this.hasDeposit = hasDeposit;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}
