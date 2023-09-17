package d15_09_2023.Zadatak2;

public class Osoba {
    protected String fullName;
    protected String personalNo;
    protected int birthYear;

    public Osoba() {
    }

    public Osoba(String fullName, String personalNo, int birthYear) {
        this.fullName = fullName;
        this.personalNo = personalNo;
        this.birthYear = birthYear;
    }

    public void print () {
        System.out.println(this.fullName + ", " + this.personalNo + ", " + this.birthYear);
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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
