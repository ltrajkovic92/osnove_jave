package p12_09_2023.Zadatak3;

public class ViberReakcija {
    private String emoji;
    private ViberKorisnik user;

    public ViberReakcija (String emoji, ViberKorisnik user) {
        this.emoji = emoji;
        this.user = user;
    }
    public String getEmoji () {
        return this.emoji;
    }
    public void setUser (ViberKorisnik user) {
        this.user = user;
    }
    public ViberKorisnik getUser () {
        return this.user;
    }
}
