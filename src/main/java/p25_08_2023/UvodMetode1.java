package p25_08_2023;

public class UvodMetode1 {
    public static void main(String[] args) {

        String ime = "Lazar";
        String prezime = "Trajkovic";

        printUser(ime + ", TTT", prezime,  true);
        printUser("Pera", "Peric", false);

    }
    public static void  printUser(String firstName, String lastName, boolean active) {
        if(active) {
            System.out.print("o ");
        } else {
            System.out.print("x ");
        }
        System.out.println(firstName + " " + lastName);
    }
}
