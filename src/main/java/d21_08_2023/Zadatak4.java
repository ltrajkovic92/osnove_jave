package d21_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {


        //4. Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija.
        //Korisnik unosi N rekacija zatim se prikazuje evidencija:
        //Program podrzava sledece reakcije:
        //●	like
        //●	smile
        //●	heart
        //	Primer izvrsenja:
        //Unesite N: 7
        //	Reaguj: like
        //	Reaguj: heart
        //	Reaguj: smile
        //	Reaguj: lol
        //	Reaguj: smile
        //	Reaguj: like
        //	Reaguj: like
        //Summary: like 3 | smile 2 | heart 1
        //Napomena: Ako se unese reakcija koju program ne podrzava, ona ne utice na evidenciju.
        //POMOC: Svaka promenljiva nosi jednu informaciju, to znaci evidenciju za like cuva promelniva sa imenom npr likeCounter, evidenciju za smile cuva smileCounter i za heart cuva promenljiva heartCounter

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();
        int like = 0, smile = 0, heart = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Reaguj: ");
            String reaguj = s.next();
            if (reaguj.equals("like")) {
                like = like + 1;
            }
            if (reaguj.equals("smile")) {
                smile = smile + 1;
            }
            if (reaguj.equals("heart")) {
                heart = heart + 1;
            }
        }
        System.out.println("Summary: like " + like + " | smile " + smile + " | heart " + heart);
    }
}
