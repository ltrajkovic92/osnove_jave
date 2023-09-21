package p19_09_2023.Zadatak1;

public class Lokal extends Objekat{
    public Lokal(String adresa, double povrsina, int zona) {
        super(adresa, povrsina, zona);
    }

    @Override
    public double porez() {
        return this.povrsina*this.koeficijent()*1.3;
    }

    @Override
    public void print() {
        System.out.println("--Lokal--");
        System.out.println("Adresa: " + this.adresa);
        System.out.println("Povrsina: " + this.povrsina);
        System.out.println("Zona: " + this.zona);
    }
}
