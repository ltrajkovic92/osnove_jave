package d14_09_2023.Zadatak1;

import java.util.ArrayList;

public class Student {

    private int index;
    private String fullName;
    private String studiesType;
    private ArrayList<Ispit> exams;

    public Student(int index, String fullName, String studiesType) {
        this.index = index;
        this.fullName = fullName;
        this.studiesType = studiesType;
        this.exams = new ArrayList<>();
    }

    public void addExam (Ispit exams) {
        this.exams.add(exams);
    }
    public double average () {
        int sumGrade = 0;
        int counter = 0;
        for (int i = 0; i < this.exams.size(); i++) {
            if(this.exams.get(i).passed()){
                sumGrade += this.exams.get(i).getGrade();
                counter++;
            }
        }
        return sumGrade * 1.0/counter;
    }

    public void print () {
        System.out.println(this.index+" - "+this.fullName+" - "+this.studiesType);
        System.out.println("Predmeti: ");
        for (int i = 0; i < this.exams.size(); i++) {
            this.exams.get(i).print();
        }
        System.out.println("Prosecna ocena: " + this.average());
    }
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStudiesType() {
        return studiesType;
    }

    public void setStudiesType(String studiesType) {
        this.studiesType = studiesType;
    }

    public ArrayList<Ispit> getExams() {
        return exams;
    }

}
