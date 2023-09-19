package p18_09_2023.Zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {

        //2.Zadatak
        //
        //Kreirati apstraktnu klasu Student koja ima:
        //ime i prezime studenta
        //broj indeksa
        //godinu studija
        //gettere, settere i konstruktore
        //apstraktnu metodu koja vraca cenu skolarine.
        //apstraktnu metodu koja vraca da li je student na buzetu ili ne.
        //metodu koja stampa podatke u formatu:
        //ime i prezime, broj indeksa, godina studija
        //Finansiranje: budzet/samofinansirajuci
        //Cena skolarine: cena
        //
        //	Kreirati klasu StudentOsnovnih koja nasledjuje klasu Student i koja ima:
        //koja za cenu skolarine vraca 90000
        //za metodu da li je na budzetu vraca true ako je student ispod 5 godine studija
        //
        //Kreirati klasu StudentMaster koja nasledjuje klasu Student i koja ima:
        //koja za cenu skolarine vraca 100000
        //za metodu da li je na budzetu vraca true ako je student ispod 2 godine studija
        //	U glavnoj klasi kreirati studente i testirati funkciolanosti


        Student first = new StudentOsnovnih("Djordje Miljenovic", 12101,3);
        Student second = new StudentMaster("Nenad Nenadovic",12202,2);

        first.print();

        second.print();
    }
}
