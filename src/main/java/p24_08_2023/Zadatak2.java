package p24_08_2023;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {

        //2.Zadatak
        //Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i menja vrednost elementa na poziciji 3 tako sto je povecava 10 puta.
        //Npr: 1,4,5,6,7 => 1,4,5,60,7
        //int a = 10;
        //a = a * 10;

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        numbers.set(3,numbers.get(3)*10);
    }
}
