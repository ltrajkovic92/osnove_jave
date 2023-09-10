package p08_09_2023.Zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {

        //1.	Zadatak
        //Kreirati klasu SlackMessage koja ima:
        //●	tekst poruke
        //●	ime i prezime osobe koja je stavila poruku
        //●	datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
        //●	(dopuna) kreirati metodu za stampu koja stampa podatke u formatu
        //[ime i prezime osobe] - [kad je poslata]
        //[Tekst poruke]
        //U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke
        //
        //(Dopuna)
        //Dopuniti klasu SlackMessage novim atributom koji kaze kada je poruka azurirana i kreirati metodu za azuriranje teksta. Metoda kao parametar prima novi tekst i datum kada je poruka azurirana. Metoda postavlja novi tekst i datum azuriranja u objektu.
        //U glavnom programu pozvati ovu metodu za izmenu i nakon toga ponovo odstampati stanje objekata.

        SlackMessage a = new SlackMessage();
        a.text = "Zdravo";
        a.name = "Stefan Stefanovic";
        a.date = "26.08.2021 18:55";

        SlackMessage b = new SlackMessage();
        b.text = "Cao";
        b.name = "Petar Petrovic";
        b.date = "26.08.2021 18:56";


        a.stampaj();
        a.update("Zdravo!", "26.08.2021 19:26");
        a.stampaj();
        System.out.println();
        b.stampaj();
        b.update("Cao!", "26.08.2021 20:45");
        b.stampaj();

    }
}
