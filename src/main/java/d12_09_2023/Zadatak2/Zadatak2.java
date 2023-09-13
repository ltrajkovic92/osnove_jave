package d12_09_2023.Zadatak2;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {

        //2.	Zadatak
        //Kreirati klasu ZeleniKarton koja ima:
        //●	ime i prezime studenta
        //●	broj indeksa
        //●	naziv predmeta
        //●	ime i prezime profesora
        //●	ocenu - od 5 do 10
        //●	gettere i settere
        //●	konstruktore
        //●	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
        //●	metodu stampaj koja stampa podatke u formatu:
        //		(naziv predmeta) - (ocena)
        //		Student: ime i prezime, broj indeksa
        //		Profesor: ime i prezime
        //
        //	U glavnoj klasi:
        //●	kreirati niz od 5 zelenih kartona za ispite i odstampati podatke za sve ispite
        //●	Zatim program pronalazi i ispisuje prosecnu ocenu za sve ispite
        //○	(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo za polozene ispite

        ArrayList<ZeleniKarton> exams = new ArrayList<>();
        exams.add(new ZeleniKarton("Petar Petrovic",1235,"Matematika", "Ratko Stankovic", 8));
        exams.add(new ZeleniKarton("Djordje Jovanovic",1236,"Elektrotehnika", "Ratko Stankovic", 5));
        exams.add(new ZeleniKarton("Nenad Milovanovic",1240,"Matematika", "Ratko Stankovic", 5));
        exams.add(new ZeleniKarton("Djordje Milenkovic",1250,"Matematika", "Ratko Stankovic", 10));
        exams.add(new ZeleniKarton("Jovica Jovic",1311,"Elektrotehnika", "Ratko Stankovic", 7));

        printList(exams);

        System.out.println();

        System.out.println("Prosecna ocena: " + avgGrade(exams));
        System.out.println("Prosecna ocena polozenih: " + avgGradePassed(exams));

    }
    public static void printList (ArrayList<ZeleniKarton> exams) {
        for (int i = 0; i < exams.size(); i++) {
            exams.get(i).print();
            System.out.println();
        }
    }
    public static double avgGrade (ArrayList<ZeleniKarton> exams) {
        int sum = 0;
        for (int i = 0; i < exams.size(); i ++) {
         sum = sum + exams.get(i).getGrade();
        }
        return sum * 1.0 / exams.size();
    }
    public static double avgGradePassed (ArrayList<ZeleniKarton> exams) {
        int sum = 0;
        int counter = 0;

        for (int i = 0; i < exams.size(); i++) {
            if(exams.get(i).isExamPassed()) {
                sum = sum + exams.get(i).getGrade();
                counter++;
            }
        }
        return sum * 1.0 / counter;
    }
}
