package p19_09_2023.Zadatak1;

public class Kuca extends Objekat{
    private int brojClanova;
    public Kuca(String adresa, double povrsina, int zona, int brojClanova) {
        super(adresa, povrsina, zona);
        this.brojClanova = brojClanova;
    }

    @Override
    public double porez() {
        return this.povrsina * this.koeficijent();
    }
    public void print () {
        System.out.println("--Kuca--");
        System.out.println("Adresa: " + this.adresa);
        System.out.println("Povrsina: " + this.povrsina);
        System.out.println("Zona: " + this.zona);
        System.out.println("Broj clanova: " + this.brojClanova);
    }

    public int getBrojClanova() {
        return brojClanova;
    }

    public void setBrojClanova(int brojClanova) {
        this.brojClanova = brojClanova;
    }
}
