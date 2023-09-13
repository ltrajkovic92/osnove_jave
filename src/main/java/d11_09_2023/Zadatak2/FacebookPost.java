package d11_09_2023.Zadatak2;

public class FacebookPost {
    private String description;
    private Korisnik user;

    public FacebookPost (String description, Korisnik user) {
        this.description = description;
        this.user = user;
    }
    public void print () {
        this.user.print();
        System.out.println(this.description);
    }
}
