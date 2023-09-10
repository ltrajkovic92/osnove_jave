package p08_09_2023.Zadatak1;

public class SlackMessage {

    public String text;
    public String name;
    public String date;

    public String lastUpdate;

    public void stampaj () {
        System.out.println(this.name +" - " + this.date);
        System.out.println(this.text);
    }
    public void update (String newText, String updated) {
        this.text = newText;
        this.lastUpdate = updated;
    }
}
