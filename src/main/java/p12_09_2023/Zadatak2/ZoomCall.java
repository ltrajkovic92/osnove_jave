package p12_09_2023.Zadatak2;

public class ZoomCall {
    private String link;
    private String password;
    private Korisnik hostUser;
    private Korisnik guestUser;

    public ZoomCall (String link, String password, Korisnik hostUser) {
        this.link = link;
        this.password = password;
        this.hostUser = hostUser;
    }
    public ZoomCall (String link, String password, Korisnik hostUser, Korisnik guestUser) {
        this.link = link;
        this.password = password;
        this.hostUser = hostUser;
        this.guestUser = guestUser;
    }

    public String getLink() {
        return this.link;
    }
    public String getPassword () {
        return this.password;
    }
    public Korisnik getHostUser() {
        return this.hostUser;
    }
    public Korisnik getGuestUser() {
        return this.getGuestUser();
    }
    public void setGuestUser(Korisnik guestUser) {
        this.guestUser = guestUser;
    }

    public void print () {
        System.out.println("Zoom call: " + this.link);
        System.out.println("Password: " + this.password);
        System.out.println("Host: " + this.hostUser.getFullName());
        if (this.guestUser != null) {
            System.out.println("Guest: " + this.guestUser.getFullName());
        }
        System.out.println("Maksimalno trajanja poziva je: " + this.hostUser.maksimalnaDuzina());
    }
}
