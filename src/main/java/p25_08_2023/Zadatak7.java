package p25_08_2023;

public class Zadatak7 {
    public static void main(String[] args) {

        //7.Napisati metodu koja proverava da li je trougao pravougli.
        //Metoda prima stranice trougla i hipotenuzu trougla.
        //Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
        //Trougao je pravougli ukoliko je a*a+b*b=c*c

        int x = 3, y = 4, z = 5;

        boolean t = pravougliTrougao(x, y, z);
        if (t == true) {
            System.out.println("Trougao je pravougli");
        } else {
            System.out.println("Trougao nije pravougli");
        }
    }
    public static boolean pravougliTrougao (int a, int b, int c) {
        boolean trougao = true;
        if (a*a+b*b==c*c) {
            trougao = true;
        } else {
            trougao = false;
        }
        return trougao;
    }
}
