package d25_08_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        //1.Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
        // Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

        stampajVrednostZa10Vecu(5);
        stampajVrednostZa10Vecu(10);
        stampajVrednostZa10Vecu(15);
        stampajVrednostZa10Vecu(20);

    }
    public static void stampajVrednostZa10Vecu (int vrednost) {
        System.out.println(vrednost + 10);
    }
}
