package d07_09_2023.Zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {

        //Zadatak 1: Kreiranje klase "Student"
        //Napišite klasu "Student" koja ima sledeće atribute: ime (String), brojIndeksa (int) i fakultet (String).
        // Kreirajte 2-3 objekta ove klase u glavnoj metodi i postavite im vrednosti. Ispisati informacije o studentima.

        Student first = new Student();
        first.name = "Milos Jovanovic";
        first.number = 3434;
        first.faculty = "Elektronski fakultet";

        Student second = new Student();
        second.name = "Miljana Todorovic";
        second.number = 4521;
        second.faculty = "Filozofski fakultet";

        Student third = new Student();
        third.name = "Dragan Jovic";
        third.number = 6212;
        third.faculty = "Ekonomski fakultet";

        System.out.println("Student: " + first.name + ", broj indeksa: " + first.number + ", " + first.faculty);
        System.out.println("Student: " + second.name + ", broj indeksa: " + second.number + ", " + second.faculty);
        System.out.println("Student: " + third.name + ", broj indeksa: " + third.number + ", " + third.faculty);
    }
}
