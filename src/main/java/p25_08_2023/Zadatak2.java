package p25_08_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        //2.Zadatak
        //Napisati dve metode, jedna metoda sluzi za stampanje imena a druga sluzi za stampanje prezimena.
        //U glavnom programu pozvati metode na izvrsenje tako da se 5 puta ispise ime i prezime u istom redu.
        //Primer izvrsenja:
        //Milan Jovanovic
        //Milan Jovanovic
        //Milan Jovanovic
        //Milan Jovanovic
        //Milan Jovanovic

        ime();prezime();
        System.out.println();
        ime();prezime();
        System.out.println();
        ime();prezime();
        System.out.println();
        ime();prezime();
        System.out.println();
        ime();prezime();
    }
    public static void ime() {
        System.out.print("Lazar");
    }
    public static void  prezime() {
        System.out.print(" Trajkovic");
    }
}
