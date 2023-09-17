package p15_09_2023.Zadatak1;

public class Student extends Osoba{
    private int index;
    private int dugZaSkolarinu;

    public Student(String fullName, String personalNo, int index, int dugZaSkolarinu) {
        super(fullName, personalNo);
        this.index = index;
        this.dugZaSkolarinu = dugZaSkolarinu;
    }
    public void pay (int value) {
        this.dugZaSkolarinu = this.dugZaSkolarinu - value;
    }
    @Override
    public void print () {
        super.print();
        System.out.println("Index: " + this.index);
        System.out.println("Dug: " + this.dugZaSkolarinu);
        System.out.println();
    }
}
