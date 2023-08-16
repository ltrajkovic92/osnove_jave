package d15_08_2023;

public class Zadatak8 {

    public static void main(String[] args) {

        int r = 155, g = 12, b = 102;

        System.out.println("Originalna boja: RGB(" + r + "," + g + "," + b + ")");
        System.out.println("Kontrastna boja: RGB(" + (255-r) + "," + (255-g) + "," + (255-b) + ")");


        //8.(Za vezbanje) Napisati program koji za datu boju trazi kontrastnu boju. Svaka boja se sadrzi od 3 komponente RGB(red, green, blue).
        //Svaka komponenta boje je u opsegu od 0 do 255(informativno)
        //Program nalazi kontrastnu boju tako sto svaku komponentu boje oduzme od 255.
        //Primer izvrsenja:
        //Originalna boja: RGB(140, 12,  100)
        //Kontrastna boja: RGB(115, 243, 155)
        // Ako vas zanima koja je originalna a koja kontrast boja, mozete ih ukucati na https://g.co/kgs/jTAfZe (edited)

    }
}
