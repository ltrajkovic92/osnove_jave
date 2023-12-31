package p22_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        //4.(za vezbanje) Napisati pogram koji vrsi korkeciju zvuka. Korisnik unosi akcije “pojacaj” ili “smanji” ili “play”. Program radi dok korisnik ne unese play. Inicijalna jacina zvuka je 75.
        //Pojacaj - akcije koja povecava jacinu zvuka za 10
        //smanji - akcija koja smajnjuje jacinu zvuka za 10.
        //Zvuk nakon nijedne akcije ne sme da spadne ispod nule ili da ode preko 100.
        //Na kraju programa odstampati jacinu zvuka.
        //
        //Primer izvrsenja:
        //Unesite akciju: pojacaj (iz 75 u 85)
        //Unesite akciju: pojacaj ( iz 85 u 95)
        //Unesite akciju: pojacaj (iz 95 u 100)
        //Unesite akciju: smanji (iz 100 u 90)
        //Unesite akciju: smanji (iz 90 u 80)
        //Unesite akciju: play
        //Jacina zvuka je 80.

        Scanner s = new Scanner(System.in);
        int counter = 75;
        boolean hasPlay = false;

        while(!hasPlay) {
            System.out.print("Unesite akciju: ");
            String action = s.next();

            if (action.equals("pojacaj")) {
                counter = counter + 10;
            } else if (action.equals("smanji")) {
                counter = counter - 10;
            } else if (action.equals("play")) {
                hasPlay = true;
            }
            if (counter>100) {
                counter = 100;
            } else if (counter<0) {
                counter = 0;
            }
        }
        System.out.println("Jacina zvuka je " + counter);
    }
}
