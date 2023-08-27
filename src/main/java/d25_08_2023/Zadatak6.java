package d25_08_2023;

public class Zadatak6 {
    public static void main(String[] args) {

        //6.Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
        //Primer izvrsenja:
        //izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
        //izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1

        System.out.println("ima za rezultat " + count(5,10));
        System.out.println("ima za rezultat " + count(-5,1));

    }
    public static int count (int m, int n) {
        int counter = 0;
        if (n <= m) {
            for (int i = n + 1; i < m; i++) {
                counter++;
            }
        } else {
            for (int i = m + 1; i < n; i++) {
                counter++;
            }
        }
        return counter;
    }
}
