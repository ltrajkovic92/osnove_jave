package p19_09_2023.Zadatak2;

public abstract class Atleticar {
    private String punoIme;
    protected double rezultat;

    public Atleticar(String punoIme, double rezultat) {
        this.punoIme = punoIme;
        this.rezultat = rezultat;
    }
    public abstract boolean daLiJeBoljiRezultat (Atleticar atleticar);

    public void print () {
        System.out.println(this.punoIme + ", " + this.rezultat);
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public double getRezultat() {
        return rezultat;
    }

    public void setRezultat(double rezultat) {
        this.rezultat = rezultat;
    }
}
