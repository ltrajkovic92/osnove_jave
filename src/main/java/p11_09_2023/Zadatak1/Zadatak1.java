package p11_09_2023.Zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {

        //1. Zadatak
        //Kreirati klasu Student koja ima:
        //-	ime
        //-	prezime
        //-	broj indeksa (int)
        //-	da li je na budzetu
        //-	gettere i settere za sve atributge
        //-	(dopuna) Kreirati metodu za stampu koja stampa sve podatke studenta.

        Student first = new Student();
        first.setName("Dusan");
        first.setLastName("Stojanovic");
        first.setIndex(2323);
        first.setOnBudget(true);


        System.out.println(first.getName());
        System.out.println(first.getLastName());
        System.out.println(first.getIndex());

        if (first.getOnBudget()) {
            System.out.println("Na budzetu.");
        } else {
            System.out.println("Samofinansirajuci.");
        }

        System.out.println();

        first.print();
    }
}
