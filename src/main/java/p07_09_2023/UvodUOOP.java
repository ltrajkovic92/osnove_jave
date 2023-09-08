package p07_09_2023;

public class UvodUOOP {
    public static void main(String[] args) {

        User m = new User();
        m.ime = "Djole";
        m.email = "djole@gmail.com";
        m.starost = 30;

        User p = new User();
        p.ime = "Milos";
        p.email = "milos@gmail.com";
        p.starost = m.starost + 3;

        System.out.println("Ime: " + m.ime);
        System.out.println("Email: " + m.email);
        System.out.println("Kraj");

      //String ime1 = "Djole";
      //String prezime1 = "Djolic";
    }
}
