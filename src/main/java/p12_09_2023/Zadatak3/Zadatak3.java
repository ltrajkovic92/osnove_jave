package p12_09_2023.Zadatak3;

public class Zadatak3 {
    public static void main(String[] args) {

        //3. Zadatak (Za vezbanje)
        //Kreirati klasu ViberKorisnik koja ima:
        //●	ime i prezime
        //●	broj telefona
        //●	da li je trenutno aktivan (boolean)
        //●	gettere, settere, konstuktore
        //
        //Kreirati klasu ViberPoruka koja ima:
        //●	tekst poruke
        //●	vreme kad je poslata poruka
        //●	korisnika koji je poslao poruku
        //●	korisnika kome je poslata poruka
        //●	gettere i setere i konstuktore
        //●	rekaciju na poruku
        //●	metodu prikazi koja stampa podatke o poruci u formatu:
        //From: [Ime i prezime korisnika] * Active Now ili Not Active - at [vreme kad je poslata]
        //To: [Ime i prezime korisnika kome je poslata]
        //[Tekst poruke] : [reakcija] from [korisnik koji je reagovao]
        //
        //Kreirati klasu ViberReakcija koja ima:
        //●	emoji (moze da bude sunglases, heart, smile, like ili sad)
        //●	korisnika koji je reagovao
        //U mainu kreirati nekoliko poruka izmedju dva korisnika i postavite nekoliko reakcija na poruke.

        ViberKorisnik firstUser = new ViberKorisnik("Danijel Popovic","+381/6432323", true);
        ViberKorisnik secondUser = new ViberKorisnik("Dusan Stojanovic", "+381/6534212", true);
        ViberReakcija reaction = new ViberReakcija("sunglases",secondUser);
        ViberPoruka message = new ViberPoruka("Cao!", "12/09/23 12:23", firstUser, secondUser, reaction);

        message.displayData();

    }
}
