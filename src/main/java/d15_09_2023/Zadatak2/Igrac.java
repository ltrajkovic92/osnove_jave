package d15_09_2023.Zadatak2;

import java.util.ArrayList;

public class Igrac extends Osoba {
    private int playerNo;
    private String position;
    private ArrayList<Karton> cards;
    private boolean isCaptain;

    public Igrac() {
    }

    public Igrac(String fullName, String personalNo, int birthYear, int playerNo, String position, boolean isCaptain) {
        super(fullName, personalNo, birthYear);
        this.playerNo = playerNo;
        this.position = position;
        this.cards = new ArrayList<>();
        this.isCaptain = isCaptain;
    }

    public void addCard (Karton card) {
        this.cards.add(card);
    }
    public int yellowCards () {
        int yellow = 0;
        for (int i = 0; i < cards.size(); i++) {
            if(cards.get(i).getType().equals("zuti"))
                yellow++;
        }
        return yellow;
    }
    public int redCards () {
        int red = 0;
        for (int i = 0; i < cards.size(); i++) {
            if(cards.get(i).getType().equals("crveni"))
                red++;
        }
        return red;
    }
    @Override
    public void print () {
        super.print();
        System.out.println("Broj igraca: " + this.playerNo);
        String captain = this.isCaptain ? " (kapiten)" : "";
        System.out.println("Pozicija: " + this.position + captain);
        System.out.println("Igrac " + (this.yellowCards()==0?"nema zutih kartona":"ima zutih kartona: " + this.yellowCards()) + ".");
        System.out.println("Igrac " + (this.redCards()==0?"nema crvenih kartona":"ima crvenih kartona: " + this.redCards()) + ".");
    }

    public int getPlayerNo() {
        return playerNo;
    }

    public void setPlayerNo(int playerNo) {
        this.playerNo = playerNo;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isCaptain() {
        return isCaptain;
    }

    public void setCaptain(boolean captain) {
        isCaptain = captain;
    }
}
