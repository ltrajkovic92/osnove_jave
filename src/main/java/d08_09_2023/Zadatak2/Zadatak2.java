package d08_09_2023.Zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {

        //2.Kreirati klasu FacebookPost koja ima:
        //   Od atributa:
        //-	ime i prezime korisnika koji je objavio post
        //-	ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
        //-	tekst objave
        //-	broj lajkova
        //-	broj deljenja
        //  Od metoda:
        //-	like(), koja povecava broj lajkova za 1.
        //-	dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
        //-	share(), koja povecava broj deljenja za 1
        //-	print(), koja stampa objavu u formatu:
        //(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
        //(tekst objave)
        //Likes (broj lajkova) | Shares (broj deljenja)
        //
        //U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
        //
        //
        //Primer stampanja:
        //Milan Jovanovic >>> Pera Peric
        //Ovo je tekst objave
        //Likes 3 | Shares 1

        FacebookPost firstPost = new FacebookPost();
        firstPost.user = "Petar Petrovic";
        firstPost.profile = "Stefan Stefanovic";
        firstPost.post = "Tekst objave";
        firstPost.likes = 3;
        firstPost.shares = 1;

        FacebookPost secondPost = new FacebookPost();
        secondPost.user = "Miljana Stevanovic";
        secondPost.profile = "Milos Jovanovic";
        secondPost.post = "Tekst objave";
        secondPost.likes = 5;
        secondPost.shares = 2;

        firstPost.like();
        firstPost.like();
        firstPost.like();
        firstPost.dislike();
        firstPost.share();
        firstPost.share();
        firstPost.print();

        System.out.println();

        secondPost.like();
        secondPost.dislike();
        secondPost.dislike();
        secondPost.dislike();
        secondPost.share();
        secondPost.print();


    }
}
