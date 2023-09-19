package p18_09_2023.Zadatak3;

import java.util.ArrayList;

public class FigureGenerator {

    public Figura generisiFigure (String figura) {
        if (figura.equals("trougao")) {
            return new JednakostranicniTrougao(5);
        } else if (figura.equals("pravougaonik")) {
            return new Pravougaonik(5,10);
        }
        return null;
    }
    public ArrayList<Figura> kreirajTrouglove (int n) {
        ArrayList<Figura> trouglovi = new ArrayList<>();
        for (int i = 1; i <= n; i ++) {
            trouglovi.add(new JednakostranicniTrougao(i));
        }
        return trouglovi;
    }
    public ArrayList<Figura> kreirajPravougaonike (int n) {
        ArrayList<Figura> pravougaonici = new ArrayList<>();
        for (int i = 1; i <= n; i ++) {
            pravougaonici.add(new Pravougaonik(i,i+1));
        }
        return pravougaonici;
    }
    public ArrayList<Figura> kreirajFigure (int nTrouglova, int nPravougaonika) {
        ArrayList <Figura> figure = new ArrayList<>();
        for (int i = 1; i <= nTrouglova; i ++) {
            figure.add(new JednakostranicniTrougao(i));
        }
        for (int i = 1; i <= nPravougaonika; i ++) {
            figure.add(new Pravougaonik(i,i+1));
        }
        return figure;
    }
}
