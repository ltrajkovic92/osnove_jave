package p14_09_2023.Zadatak4;

public class Zadatak4 {
    public static void main(String[] args) {

        //4. Zadatak(Za vezbanje)
        //Kreirati klasu InstagramUser koja ima:
        //●	username
        //●	Ime i prezime
        //●	email
        //●	Sve sto vam dalje zatreba dopunite klasu.
        //Kreiarti klasu InstagramTag koja ima:
        //●	x koordinatu na slici
        //●	y koordinatu na slici
        //●	usera koji je tagovan
        //Kreirati klasu InstagramImage koja ima:
        //●	niz tagova
        //●	duzinu slike
        //●	visinu slike
        //●	putanju do slike (npr: instagram.com/korsnik-pera/profilna.jpg)
        //●	metodu dodajTag
        //
        //Kreirati klasu InstagramPost koja ima
        //●	niz slika
        //●	Opis koji moze da se postavi za post
        //●	metodu dodajSliku

        InstagramUser firstUser = new InstagramUser("korisnik992","Lazar Trajkovic","lazar@gmail.com");
        InstagramUser secondUser = new InstagramUser("korisnik993","Milos Jovanovic","milos@gmail.com");

        InstagramImage firstImage = new InstagramImage(1080,720, "www.instagram.com/korisnik992/123");

        InstagramTag firstTag = new InstagramTag(30,50,firstUser);
        InstagramTag secondTag = new InstagramTag(100,120,secondUser);

       firstImage.addTag(firstTag);
       firstImage.addTag(secondTag);

       InstagramPost firstPost = new InstagramPost("Slika sa tagovima.");
       firstPost.addImage(firstImage);

       firstPost.print();
    }
}
