package d14_09_2023.Zadatak1;

public class Ispit {

    private String subjectName;
    private int grade;
    private String professorFullName;

    public Ispit(String subjectName, int grade, String professorFullName) {
        this.subjectName = subjectName;
        this.grade = grade;
        this.professorFullName = professorFullName;
    }

    public boolean passed(){
        return this.grade > 5 && this.grade <= 10;
    }
    public void print () {
        System.out.println("Ispit: " + this.subjectName + " - Profesor: " + this.professorFullName + " - Ocena: " + this.grade);
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getProfessorFullName() {
        return professorFullName;
    }

    public void setProfessorFullName(String professorFullName) {
        this.professorFullName = professorFullName;
    }
}
