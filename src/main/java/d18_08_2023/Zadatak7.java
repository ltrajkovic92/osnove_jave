package d18_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite stanje table: ");
        int table = s.nextInt();
        char[] table2 = String.valueOf(table).toCharArray();

        for (int i = 0; i < 9; i++) {
            if (i%3==0) {
                System.out.println(" ");
            } else {
                System.out.print("|");
            }
            if (table2[i]=='1') {
                System.out.print("X");
            } else if (table2[i]=='2'){
                System.out.print("O");
            } else if (table2[i]=='3') {
                System.out.print(" ");
            }
        }

        //7. (Za vezbanje) Napisati program koji iscrtava iks oks tablu.
        //Stanje na tabli se cuva u intigeru koji uvek ima 9 cifara. Broj 1 u stanju je X, broj 2 je O, a 3 je prazni polje
        //Primer izvrsenja:
        //Unesite stanje table: 321211323
        //  | O | X
        //O | X | X
        //  | O |
        //Zadatak se resava for petljom (edited)
    }
}
