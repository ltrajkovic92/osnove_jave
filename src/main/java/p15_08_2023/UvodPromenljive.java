package p15_08_2023;

public class UvodPromenljive {

    public static void main(String[] args) {

        String firstName ="Lazar";
        String lastName = "Trajkovic";
        int yearOfBirth = 1992;
        int currentYear = 2023;
        double avg = 5.8;
        boolean active = true;

        int age = currentYear - yearOfBirth;

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.printf("Active: " + active);




    }
}
