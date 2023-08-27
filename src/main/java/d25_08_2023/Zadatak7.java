package d25_08_2023;

public class Zadatak7 {
    public static void main(String[] args) {

        //7.Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
        //U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
        //Ako se proslede brojevi 4,6,1 u poziv metode, metoda vraca 1
        //Ako se proslede brojevi 4,6,33 u poziv metode, metoda vraca 4


        System.out.println(smallestNumber(4,6,1));
        System.out.println(smallestNumber(4,6,33));


    }
    public static int smallestNumber (int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        }
        if(b < a && b < c) {
            return b;
        }
        if (c < a && c < b) {
            return c;
        }
        return 0;
    }
}
