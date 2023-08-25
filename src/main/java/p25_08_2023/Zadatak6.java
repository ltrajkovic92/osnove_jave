package p25_08_2023;

public class Zadatak6 {
    public static void main(String[] args) {

        //Napisati metodu koja vraca suprotno negativni broj od prosledjenog.
        //Metoda prima broj N i vraca ga sa negativnom vrednoscu.
        //Primer: Ako se metoda pozove za N=10, vraca -10
        //Ako se metoda pozove za N=-11, vraca 11

        int m = 10;
        int n = -4;

        int p = obrni(m);
        int r = obrni(n);

        System.out.println("M " + m + ", P " + p);
        System.out.println("N " + n + ", R " + r);
    }
    public static int obrni(int n) {
        int x = n * -1;
        return x;
    }
}
