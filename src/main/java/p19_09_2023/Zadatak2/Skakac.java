package p19_09_2023.Zadatak2;

public class Skakac extends Atleticar{
    public Skakac(String punoIme, double rezultat) {
        super(punoIme, rezultat);
    }

    public boolean daLiJeBoljiRezultat (Atleticar atleticar) {
        if (this.rezultat > atleticar.rezultat) {
            return true;
        }
        return false;
    }
}
