package p19_09_2023.Zadatak2;

import org.jetbrains.annotations.NotNull;

public class Trkac extends Atleticar{

    public Trkac(String punoIme, double rezultat) {
        super(punoIme, rezultat);
    }

    public boolean daLiJeBoljiRezultat (Atleticar atleticar) {
        if (this.rezultat < atleticar.rezultat) {
            return true;
        }
        return false;
    }
}
