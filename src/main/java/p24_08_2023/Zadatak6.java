package p24_08_2023;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak6 {
    public static void main(String[] args) {

        //6. (Za vezbanje) Napisati program koji vrsi mesanje niza. Niz je duzine 10, proizvoljnih brojeva.
        //Mesanje niza se vrsi tako sto se 8 puta vrsi zamena dva random elementa iz niza.
        //primer jedne zamene:
        //Ako je niz
        //1,2,3,4,5,6,7,8,9,10
        //i prvi random indeks je 4 a drugi random indeks je 6
        //1,2,3,4,7,6,5,8,9,10

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        Random rand = new Random();

        for (int i = 0; i < 8; i++) {
            int firstRandom = rand.nextInt(numbers.size()-1);
            int secondRandom = rand.nextInt(numbers.size()-1);

            int firstElement = numbers.get(firstRandom);
            int secondElement = numbers.get(secondRandom);

            numbers.set(firstRandom, secondElement);
            numbers.set(secondRandom, firstElement);
        }
        System.out.println(numbers);
    }
}
