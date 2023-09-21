package d19_09_2023.Zadatak1;

public abstract class Ambalaza {
    protected String barcode;
    protected String name;
    protected double netWeight;
    protected double grossWeight;

    public Ambalaza() {
    }

    public Ambalaza(String barcode, String name, double netWeight, double grossWeight) {
        this.barcode = barcode;
        this.name = name;
        this.netWeight = netWeight;
        this.grossWeight = grossWeight;
    }
    public double packageWeight () {
        return this.grossWeight - this.netWeight;
    }
    public abstract double articalPrice();
    public abstract void print ();

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(double netWeight) {
        this.netWeight = netWeight;
    }

    public double getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(double grossWeight) {
        this.grossWeight = grossWeight;
    }
}
