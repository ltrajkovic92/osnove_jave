package p12_09_2023.Zadatak3;

public class ViberKorisnik {

    private String fullName;
    private String number;
    private boolean isActive;

    public ViberKorisnik (String fullName, String number, boolean isActive) {
        this.fullName = fullName;
        this.number = number;
        this.isActive = isActive;
    }
    public String getFullName () {
        return this.fullName;
    }
    public String getNumber () {
        return this.number;
    }
    public boolean getActive () {
        return this.isActive;
    }
    public void setFullName (String fullName) {
        this.fullName = fullName;
    }
    public void setNumber (String number) {
        this.number = number;
    }
    public void setActive (boolean isActive) {
        this.isActive = isActive;
    }
}
