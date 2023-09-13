package p12_09_2023.Zadatak2;

public class Korisnik {
    private String fullName;
    private String license;

    public Korisnik (){
        this.license = "basic";
    }
    public Korisnik (String fullName) {
        this.fullName = fullName;
        this.license = "basic";
    }
    public void subscribe(int payment) {
        if (payment == 100) {
            this.license = "pro";
        } else if (payment == 150) {
            this.license = "premium";
        }
    }
    public void unsubscribe(){
        this.license = "basic";
    }

    public int maksimalnaDuzina () {
        if (this.license.equals("basic")) {
            return 40;
        }
        if (this.license.equals("pro")) {
            return 240;
        }
        if (this.license.equals("premium")) {
            return 1440;
        }
        return 0;
    }
    public void print () {
        System.out.println(this.fullName);
    }

    public void setFullName (String fullName) {
        this.fullName = fullName;
    }
    public String getFullName () {
        return this.fullName;
    }
    public String getLicense () {
        return this.license;
    }
}
