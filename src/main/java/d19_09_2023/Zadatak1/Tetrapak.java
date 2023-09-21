package d19_09_2023.Zadatak1;

public class Tetrapak extends Ambalaza{
    private boolean isRecyclable;
    private double basePrice;

    public Tetrapak(String barcode, String name, double netWeight, double grossWeight, boolean isRecyclable, double basePrice) {
        super(barcode, name, netWeight, grossWeight);
        this.isRecyclable = isRecyclable;
        this.basePrice = basePrice;
    }

    @Override
    public double articalPrice() {
        if (this.isRecyclable) {
            return this.packageWeight() * 1.5 + this.basePrice;
        } else {return this.basePrice;}
    }

    @Override
    public void print() {
        System.out.println("Barkod: " + this.barcode + ", naziv: " + this.name + ", tezina: " + this.packageWeight() + "g.");
        if (isRecyclable) {
            System.out.println("Proizvod moze da se reciklira.");
        }
        System.out.println("Cena: " + this.articalPrice());
    }

    public boolean isRecyclable() {
        return isRecyclable;
    }

    public void setRecyclable(boolean recyclable) {
        isRecyclable = recyclable;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}
