package p18_09_2023.Zadatak2;

public class StudentOsnovnih extends Student{

    public StudentOsnovnih(String fullName, int index, int studieYear) {
        super(fullName, index, studieYear);
    }
    public int cenaSkolarine () {
        return 90000;
    }
    public boolean isOnBudget () {
        if (super.studieYear<5) {
            return true;
        }
        return false;
    }
}
