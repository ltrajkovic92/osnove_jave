package d15_09_2023.Zadatak1;

public class Igrac extends Osoba {
    private int playerNo;
    private String position;
    private boolean isCaptain;

    public Igrac() {
    }
    public Igrac(String fullName, String personalNo, int birthYear, int playerNo, String position, boolean isCaptain) {
        super(fullName, personalNo, birthYear);
        this.playerNo = playerNo;
        this.position = position;
        this.isCaptain = isCaptain;
    }
    @Override
    public void print () {
        super.print();
        System.out.println("Broj igraca: " + this.playerNo);
        String captain = this.isCaptain ? " (kapiten)" : "";
        System.out.println("Pozicija: " + this.position + captain);
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
        this.isCaptain = captain;
    }
}
