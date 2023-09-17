package p15_09_2023.NasledjivanjeUvod;

public class Kamion extends Vozilo{
    private int nosivost;
    public Kamion() {
    }

    public int getNosivost() {
        return nosivost;
    }

    public void setNosivost(int nosivost) {
        this.nosivost = nosivost;
    }
    @Override
    public void print () {
        super.print();
        System.out.println("Nosivost: " + this.nosivost);
        System.out.println();
    }
}
