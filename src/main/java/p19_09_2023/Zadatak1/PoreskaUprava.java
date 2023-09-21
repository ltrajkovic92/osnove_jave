package p19_09_2023.Zadatak1;

import java.util.ArrayList;

public class PoreskaUprava{
    private String imeGrada;
    private ArrayList<Objekat> objekti;


    public PoreskaUprava(String imeGrada) {
        this.imeGrada = imeGrada;
        this.objekti = new ArrayList<>();
    }

    public void dodajObjekat (Objekat objekat) {
        this.objekti.add(objekat);
    }
    public Objekat najveciPorez () {
        Objekat max = objekti.get(0);
        for (int i = 0; i < objekti.size(); i++) {
            if (max.porez() < objekti.get(i).porez()) {
              max = objekti.get(i);
            }
        }
        return max;
    }
    public Objekat najmanjiPorez () {
        Objekat min = objekti.get(0);
        for (int i = 0; i < objekti.size(); i++) {
            if (min.porez() > objekti.get(i).porez()) {
              min = objekti.get(i);
            }
        }
        return min;
    }
    public double ukupanPorez () {
        double sum = 0;
        for (int i = 0; i < objekti.size(); i++) {
            sum = sum + objekti.get(i).porez();
        }
        return sum;
    }

    public void  printAll () {
        for (int i = 0; i < objekti.size(); i++) {
            objekti.get(i).print();
        }
    }
    public String getImeGrada() {
        return imeGrada;
    }

    public void setImeGrada(String imeGrada) {
        this.imeGrada = imeGrada;
    }
}
