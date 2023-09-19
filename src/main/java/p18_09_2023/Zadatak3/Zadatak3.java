package p18_09_2023.Zadatak3;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {

        //3. Zadatak
        //Kreirati abstraktnu klasu Figura koja ima
        //●	abstraktnu metodu povrsina
        //●	abstraktnu metodu obim
        //●	metodu koja stampa podatke u formatu:
        //Povrsina je (povrsina)
        //Obim je (obim)
        //
        //Kreirati klasu JednakostranicniTrougao koja nasledjuje klasu Figura:
        //●	stranicu a
        //●	gettere/settere/konstruktore
        //●	implementira metodu povrsina po formuli (a * a) * 1.73205 / 4
        //●	implementira metodu obim
        //
        //Kreirati klasu Pravougaonik koja nasledjuje klasu Figura:
        //●	stranice a i b
        //●	gettere/settere/konstruktore
        //●	implementira metodu povrsina
        //●	implementira metodu obim
        //
        //U glavnom programu kreirati niz figura (niz od 3 pravougaonika i 2 trougla). Zatim odstampati na ekranu sve figure i sume njhovih povrsina i obima.
        //
        //3.1 Zadatak
        //Kreirati klasu FigureGenerator koja ima:
        //●	Napisati metodu koja generiše geometrijske figure u zavisnosti od prosleđenog parametra koji predstavlja tip figure. Tip figure može biti trougao ili pravougaonik. U zavisnosti od tipa figure, funkcija treba da kreira odgovarajući objekat i vrati ga kao povratnu vrednost. Po defaultu, funkcija treba da kreira pravougaonik sa stranicama dužine 5 i 10 i trougao sa stranicama dužine 5.
        //●	(ZA VEZBAJE) Kreirati metodu koja kreira i vraca niz od N trouglova. N je parametar metode
        //●	(ZA VEZBAJE) Kreirati metodu koja kreira i vraca niz od N pravougaonika. N je parametar metode
        //●	(ZA VEZBAJE) Kreirati metodu koja kreira i vraca niz od N trouglova i N pravougaonika. N je parametar metode
        //
        //U glavnom programu generisati 3 pravougaonika i 2 trougla


        JednakostranicniTrougao trougao1 = new JednakostranicniTrougao(5);
        JednakostranicniTrougao trougao2 = new JednakostranicniTrougao(4);
        JednakostranicniTrougao trougao3 = new JednakostranicniTrougao(6);

        Pravougaonik pravougaonik1 = new Pravougaonik(4,6);
        Pravougaonik pravougaonik2 = new Pravougaonik(5,10);


        ArrayList<Figura> figura = new ArrayList<>();
        figura.add(trougao1);
        figura.add(trougao2);
        figura.add(trougao3);
        figura.add(pravougaonik1);
        figura.add(pravougaonik2);
        figura.add (new JednakostranicniTrougao(10));

        double sumPovrsina = 0;
        double sumObim = 0;

        for (int i = 0; i < figura.size(); i++) {
            figura.get(i).print();
            System.out.println();
            sumPovrsina += figura.get(i).povrsina();
            sumObim += figura.get(i).obim();
        }

        System.out.println("Ukupna povrsina je: " + sumPovrsina + ", ukupni obim: " + sumObim);
        System.out.println();

        FigureGenerator generator = new FigureGenerator();

        Figura figura1 = generator.generisiFigure("trougao");
        Figura figura2 = generator.generisiFigure("pravougaonik");

        figura1.print();
        figura2.print();
        System.out.println();

        ArrayList<Figura> kreirajFigure = new FigureGenerator().kreirajFigure(5,6);

        for (int i = 0; i < kreirajFigure.size(); i++) {
            kreirajFigure.get(i).print();
        }
    }
}
