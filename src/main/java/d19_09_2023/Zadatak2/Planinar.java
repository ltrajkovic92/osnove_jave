package d19_09_2023.Zadatak2;

public abstract class Planinar {
    protected int id;
    protected String fullName;

    public Planinar(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }
    public abstract void print ();
    public abstract double membershipFee ();
    public abstract boolean successfulClimb (Planina planina);

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }
}
