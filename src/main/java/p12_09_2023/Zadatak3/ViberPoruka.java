package p12_09_2023.Zadatak3;

public class ViberPoruka {
    private String text;
    private String time;
    private ViberKorisnik sender;
    private ViberKorisnik recipient;
    private ViberReakcija reaction;

    public ViberPoruka (String text, String time, ViberKorisnik sender, ViberKorisnik recipient, ViberReakcija reaction) {
        this.text = text;
        this.time = time;
        this.sender = sender;
        this.recipient = recipient;
        this.reaction = reaction;
    }
    public void displayData () {
        System.out.println("From: " + this.sender.getFullName() + " * " + this.sender.getActive() + " - at " + this.time);
        System.out.println("To: " + this.recipient.getFullName());
        System.out.println(this.text + ": " + this.reaction.getEmoji() + " from " + this.reaction.getUser().getFullName());
    }
    public void setText (String text) {
        this.text = text;
    }
    public String getText () {
        return this.text;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getTime () {
        return this.time;
    }
    public void setSender (ViberKorisnik sender) {
        this.sender = sender;
    }
    public ViberKorisnik getSender () {
        return this.sender;
    }
    public void setRecipient (ViberKorisnik recipient) {
        this.recipient = recipient;
    }
    public ViberKorisnik getRecipient () {
        return this.recipient;
    }
    public ViberReakcija getReaction () {
        return this.reaction;
    }
}
