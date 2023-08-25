package p25_08_2023;

public class Zadatak8 {
    public static void main(String[] args) {

        //8.Zadatak
        //Napisati metodu koja vrsi konverziju rimske(string) u arapske brojeve(int).
        //1 - I
        //2 - II
        //3 - III
        //4 - IV
        //5 - V
        //Kao parametar se unosi vrednost rimkog broja(string) a vraca se arapski (int).
        //Ako se unese V vraca se 5. Ako se unese vrednost koja nije podrzana vracamo nulu.

        int a = konvertuj("I");
        System.out.println(a);
        int b = konvertuj("V");
        System.out.println(b);

    }
    public static int konvertuj(String broj) {
        if (broj.equals("I")) {
            return 1;
        } else if (broj.equals("II")) {
            return 2;
        } else if (broj.equals("III")) {
            return 3;
        } else if (broj.equals("IV")) {
            return 4;
        } else if (broj.equals("V")) {
            return 5;
        }
        return 0;
    }
}
