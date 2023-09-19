package p18_09_2023.Zadatak2;

public abstract class Student {
    protected String fullName;
    protected int index;
    protected int studieYear;

    public Student(String fullName, int index, int studieYear) {
        this.fullName = fullName;
        this.index = index;
        this.studieYear = studieYear;
    }

    public abstract int cenaSkolarine ();
    public abstract boolean isOnBudget ();

    public void print () {
        System.out.println(this.fullName + ", broj indeksa: " + this.index + ", godina studija: " + this.studieYear);
        System.out.println("Finasiranje: " + (this.isOnBudget()?"budzet":"samofinansirajuci") );
        System.out.println(this.isOnBudget()?"":"Skolarina: " + cenaSkolarine());
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getStudieYear() {
        return studieYear;
    }

    public void setStudieYear(int studieYear) {
        this.studieYear = studieYear;
    }

}
