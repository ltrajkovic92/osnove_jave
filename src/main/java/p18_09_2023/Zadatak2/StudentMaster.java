package p18_09_2023.Zadatak2;

public class StudentMaster extends Student{

    public StudentMaster(String fullName, int index, int studieYear) {
        super(fullName, index, studieYear);
    }
    public int cenaSkolarine () {
        return 100000;
    }
    public boolean isOnBudget () {
        if (super.studieYear<2) {
            return true;
        }
        return false;
    }
}
