package p15_09_2023.Zadatak1;

public class Osoba {
    protected String fullName;
    protected String personalNo;

    public Osoba(String fullName, String personalNo) {
        this.fullName = fullName;
        this.personalNo = personalNo;
    }

    public void print () {
        System.out.println(this.fullName + ", " + this.personalNo);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPersonalNo() {
        return personalNo;
    }

    public void setPersonalNo(String personalNo) {
        this.personalNo = personalNo;
    }
}
