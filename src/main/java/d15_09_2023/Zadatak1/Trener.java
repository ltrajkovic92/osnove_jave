package d15_09_2023.Zadatak1;

public class Trener extends Osoba {
    private int experienceNo;
    private String coachType;

    public Trener(String fullName, String personalNo, int birthYear, int experienceNo, String coachType) {
        super(fullName, personalNo, birthYear);
        this.experienceNo = experienceNo;
        this.coachType = coachType;
    }
    @Override
    public void print () {
        super.print();
        System.out.println("Tip trenera: " + coachType);
        System.out.println("Godine iskustva: " + experienceNo);
    }
}
