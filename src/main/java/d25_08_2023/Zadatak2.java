package d25_08_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        //2.Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru.
        //METODA NISTA NE STAMPA.
        //ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
        //ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

        String x = spajaVrednosti(2,3);
        String x1 = spajaVrednosti(6,2);

        System.out.println(x);
        System.out.println(x1);
    }
    public static String spajaVrednosti (int a, int b) {
        return "" + a + b;
    }
}
