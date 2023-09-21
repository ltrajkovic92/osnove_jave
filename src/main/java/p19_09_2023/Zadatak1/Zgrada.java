package p19_09_2023.Zadatak1;

public class Zgrada extends Objekat{
    private int brojStanova;

    public Zgrada(String adresa, double povrsina, int zona, int brojStanova) {
        super(adresa, povrsina, zona);
        this.brojStanova = brojStanova;
    }
    public double porez () {
        return this.povrsina * this.koeficijent() * this.brojStanova;
    }
    public void print () {
        System.out.println("--Zgrada--");
        System.out.println("Adresa: " + this.adresa);
        System.out.println("Povrsina: " + this.povrsina);
        System.out.println("Zona: " + this.zona);
        System.out.println("Broj stanova: " + this.brojStanova);
    }

    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }
}
