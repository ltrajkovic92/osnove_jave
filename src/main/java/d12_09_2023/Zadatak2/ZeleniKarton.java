package d12_09_2023.Zadatak2;

public class ZeleniKarton {
    private String studentFullName;
    private int index;
    private String subject;
    private String professorFullName;
    private int grade;

    public ZeleniKarton (String studentFullName, int index, String subject, String professorFullName, int grade) {
        this.studentFullName = studentFullName;
        this.index = index;
        this.subject = subject;
        this.professorFullName = professorFullName;
        this.grade = grade;
    }
    public boolean isExamPassed () {
        return this.grade>5 && this.grade <=10;
    }
    public void print () {
        System.out.print(this.subject + " - " + this.grade + " - ");
        if (this.isExamPassed()) {
            System.out.println("Passed.");
        } else {
            System.out.println("Failed.");
        }
        System.out.println("Student: " + this.studentFullName + ", " + this.index);
        System.out.println("Profesor: " + this.professorFullName);
    }
    public void setStudentFullName (String studentFullName) {this.studentFullName = studentFullName;}
    public String getStudentFullName () {return this.studentFullName;}
    public void setIndex (int index) {this.index = index;}
    public int getIndex () {return this.index;}
    public void setSubject (String subject) {this.subject = subject;}
    public String getSubject () {return this.subject;}

    public void setGrade(int grade) {this.grade = grade;}

    public int getGrade() {return this.grade;}

    public void setProfessorFullName(String professorFullName) {this.professorFullName = professorFullName;}
    public String getProfessorFullName () {return this.professorFullName;}
}
