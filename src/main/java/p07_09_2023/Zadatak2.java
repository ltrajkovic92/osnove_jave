package p07_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        SlackMessage a = new SlackMessage();
        a.text = "Zdravo";
        a.name = "Stefan Stefanovic";
        a.date = "26.08.2021 18:55";

        SlackMessage b = new SlackMessage();
        b.text = "Cao";
        b.name = "Petar Petrovic";
        b.date = "26.08.2021 18:56";

        System.out.println("[" + a.name +"] - [" + a.date + "]");
        System.out.println("[" + a.text + "]");

        System.out.println("[" + b.name +"] - [" + b.date + "]");
        System.out.println("[" + b.text + "]");

    }
}
