package p25_08_2023;

public class UvodMetode2 {
    public static void main(String[] args) {

        String ime = "Lazar";
        String prezime = "Trajkovic";

        String x = gUser("Lazar","Trajkovic");

    }
    public static String getUser(String firstName, String lastName, boolean active) {
        String fullName = "";
        if (active) {
            fullName = "o " + firstName + lastName;
        } else {
            fullName = "x " + firstName + lastName;
        }
        return  fullName;
    }
    public static String gUser(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
