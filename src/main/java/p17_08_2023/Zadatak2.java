package p17_08_2023;

import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Upisi dan: ");
        int dan = s.nextInt();
        System.out.print("Upisi mesec: ");
        int mesec = s.nextInt();
        System.out.print("Upisi godinu: ");
        int godina = s.nextInt();

        System.out.println(dan + "-" + mesec + "-" + godina);

        //Napisati program koji sa tastature ucitava tri cela broja:
        //dan
        //mesec
        //godina
        //	I formira datum u ispisu u formatu dan-mesec-godina
    }
}
