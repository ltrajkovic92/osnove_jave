package p15_09_2023.NasledjivanjeUvod;

public class Auto extends Vozilo{
    private int brojVrata;

    public Auto() {
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }
    @Override
    public void print () {
        super.print();
        System.out.println("Broj vrata: " + this.brojVrata);
        System.out.println();
    }
}
