package p12_09_2023.Zadatak4;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        //4.Zadatak
        //Kreirati klasu Sastojak koja ima:
        //●	naziv sastojka
        //●	cenu
        //●	gettere i settere
        //●	konstuktore
        //
        //--U glavnom programu kreirati 3 sastojka.
        // U glavnom programu kreirati niz sastojaka ucitavajuci ih od korisnika.
        // Ucitavaju se N sastojaka i na kraju odstampati niz. Koristeci ArrayList-e

        ArrayList <Sastojak> ingredients = new ArrayList();

//        Sastojak first = new Sastojak("Sastojak1",30);
//        Sastojak second = new Sastojak("Sastojak2",20);
//        Sastojak third = new Sastojak("Sastojak3", 10);

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite naziv: ");
            String name = s.next();
            System.out.print("Unesite cenu: ");
            int price = s.nextInt();
            ingredients.add(new Sastojak(name,price));
        }

        for (int i = 0; i < ingredients.size(); i++) {
            ingredients.get(i).print();
        }
    }
}
