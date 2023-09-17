package d14_09_2023.Zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {

        //Napisati klasu Student koja ima
        //
        //●	broj indeksa
        //●	ime i prezime
        //●	tip studija (osnovne, master, doktorske)
        //●	niz ispita
        //●	konstuktore koje mislite da ce vam trebati
        //●	gettere i settere za indeks, ime i prezime, tip studija
        //●	getter za niz predmeta
        //●	metodu dodaj ispit u niz ispita
        //●	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
        //●	metodu stampaj koja stampa u formatu:
        //(broj indeksa) - (ime i prezime) - (tip studija)
        //Predmeti:
        //(naziv predmeta) - (profesor) - (ocena)
        //(naziv predmeta) - (profesor) - (ocena)
        //(naziv predmeta) - (profesor) - (ocena)
        //Prosecna ocena: (prosecna ocena)
        //
        //Napisati klasu Ispit koja ima
        //●	naziv predmeta
        //●	ocenu (u rasponu od 5 do 10)
        //●	Ime i prezime profesora koji predaje predmet
        //●	konstuktore koje mislite da ce vam trebati
        //●	gettere i settere za sve atribute
        //●	metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
        //●	metodu koja stampa ispit u formatu:
        //(naziv predmeta) - (profesor) - (ocena)

        Ispit matematickaAnaliza1 = new Ispit("Matematicka analiza 1", 6,"Stefan Denic");
        Ispit bazePodataka1 = new Ispit("Baze podataka 1", 8,"Marko Stojkovic");
        Ispit uvodUProgramiranje = new Ispit("Uvod u programiranje", 5,"Dusan Antic");
        Ispit matematickaAnaliza2 = new Ispit("Matematicka analiza 2", 7,"Jelena Stojanovic");
        Ispit bazePodataka2 = new Ispit("Baze podataka 2", 7,"Jelena Stojanovic");

        Student student = new Student(1055, "Milica Jovanovic", "Osnovne akademske studije");
        student.addExam(matematickaAnaliza1);
        student.addExam(bazePodataka1);
        student.addExam(uvodUProgramiranje);
        student.addExam(matematickaAnaliza2);
        student.addExam(bazePodataka2);

        student.print();
    }
}
