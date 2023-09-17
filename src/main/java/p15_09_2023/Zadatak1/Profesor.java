package p15_09_2023.Zadatak1;

public class Profesor extends Osoba{
    private String nazivPredmeta;
    private double iznosPlate;

    public Profesor(String fullName, String personalNo, String nazivPredmeta, double iznosPlate) {
        super(fullName, personalNo);
        this.nazivPredmeta = nazivPredmeta;
        this.iznosPlate = iznosPlate;
    }

    public void povecajPlatu (double procenat) {
        this.iznosPlate = this.iznosPlate + (this.iznosPlate * (procenat/100));
    }
    @Override
    public void print () {
        super.print();
        System.out.println("Naziv predmeta: " + nazivPredmeta);
        System.out.println("Iznos plate: " + this.iznosPlate);
        System.out.println();
    }
}
