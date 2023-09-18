package d14_09_2023.Zadatak3;

public class Zadatak3 {
    public static void main(String[] args) {

        //3. (Za vezbanje)
        //Kreirati klasu TableHeader koja ima:
        //●	niz celija u headeru tabele. Niz je niz stringova
        //●	metodu addHeaderCell, koja dodaje polje u niz
        //●	metodu za stampu koja stampa celije kao u primeru:
        //celija1\t\t|\t\tcelija2\t\t|\t\tcelija3\t\t|    (itd)
        //(Objasnjenje \t je specijalan karakter tab koji ce da sluzi da lakse poravnate kolone)
        //●	metodu printHTML, koja sluzi da stampa header u HTML formatu.
        //header se stampa izmedju <tr></tr>, a svaka celija mora da se nelazi u <th></th>
        //primer:
        //<tr><th>First Name</th><th>Last Name</th><th>Age</th></tr>
        //
        //Kreirati klasu TableRow koja ima:
        //●	niz celija u telu tabele. Niz je niz stringova
        //●	metodu addRowCell, koja dodaje polje u niz
        //●	metodu za stampu koja stampa celije kao u primeru:
        //celija1\t\t|\t\tcelija2\t\t|\t\tcelija3\t\t|    (itd)
        //●	metodu printHTML, koja sluzi da stampa red u HTML formatu.
        //red se stampa izmedju <tr></tr>, a svaka celija mora da se nelazi u <td></td>
        //primer:
        //<tr><td>Milan</td><td>Jovanovic</td><td>27</td></td>
        //
        //Kreirati klasu Table koja ima:
        //●	header tabele
        //●	niz redova. Niz je niz TableRow elementa
        //●	setter za header
        //●	metodu za dodvanje novog reda u tablu
        //●	metodu za stampu koja stampa header i redove tabele
        //●	metodu za stampu HTML-a tabele.Primer
        //<table>
        //<thead>
        //<tr><th>First Name</th><th>Last Name</th><th>Age</th></tr>
        //</thead>
        //<tbody>
        //<tr><td>Milan</td><td>Jovanovic</td><td>27</td></td>
        //<tr><td>Petar</td><td>Petrovic</td><td>29</td></td>
        //<tr><td>Darko</td><td>Darkovic</td><td>30</td></td>
        //</tbody>
        //</table>
        //
        //U mainu kreirati jednu tabelu sa 3x3 (3 kolone i 3 reda) i odstampajte je obicno i u html-u.
        //
        //(DOPUNA 1)
        //U klasi TableRow dodajte metodu koja proverava da li se neki prosledjeni tekst sadrzi u nekoj celiji tog reda. Metoda vraca true ako postoji
        //
        //U klasi Table dodajte metodu filter, koja sluzi da filtrira redove tabele u odnosu na prosledjeni tekst. Metoda stampa tabelu, ali samo redove koji sadrze trazeni tekst.
        //Primer izvrsenja: za filter “Milan” stampa se
        //First Name 	|	Last Name 	| 	Age	|
        //Milan			Jovanovic		27
        //
        //(DOPUNA 2)
        //U klasi Table dodajte atribut broj redova po strani (najcesce se koristi 5, 10, 25 ili 100 cisto da navedem neki primer).
        //Dodati metodu koja stampa paginator (Sta je paginator?). Paginator stampa koliko strana imamo za redove u tabeli.
        //
        //Npr: ako imamo u tabeli 50 redova i broj redova po strani je 10 paginator se stampa
        //| 1 | 2 | 3 | 4 | 5
        //
        //Zatim izmenite metodu za stampu tako da prima parametar redni broj strane na osnovu koje tabela prikazuje samo elemente te strane. Naravno maksimalno broj elemenata po strani.
        //Primer ako se pozove metoda stampaj za stranu 3 i broj redova po strani je 5, treba da se stampaju redovi od indeksa 10 do 14.
        //Ispod redova tabele odstampajte paginator.
        //Primer tabele
        //First Name 	|	Last Name 	| 	Age	|
        //Milan			Jovanovic		27
        //Marko 			Markovic		30
        //Darko 			Darkovic		60
        //
        //Broj redova po strani [3]
        //| 1 | 2 | 3 | 4 | (Objasnjenje: Ovo je paginator.)

        TableHeader tableHeader = new TableHeader();
        tableHeader.addHeaderCell("Ime");
        tableHeader.addHeaderCell("Prezime");
        tableHeader.addHeaderCell("Godina");

        TableRow row1 = new TableRow();
        TableRow row2 = new TableRow();
        TableRow row3 = new TableRow();

        row1.addRowCell("Djordje");
        row1.addRowCell("Miljenovic");
        row1.addRowCell("40");

        row2.addRowCell("Aleksa");
        row2.addRowCell("Antic");
        row2.addRowCell("32");

        row3.addRowCell("Dusan");
        row3.addRowCell("Stojanovic");
        row3.addRowCell("25");

        Table table = new Table(2);
        table.setHeader(tableHeader);
        table.addRow(row1);
        table.addRow(row2);
        table.addRow(row3);

        table.printHTMLTable();

        table.filter("Simic");

        table.printTable(1);

        table.printPaginator();
    }
}
