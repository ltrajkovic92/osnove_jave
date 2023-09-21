package p19_09_2023.Zadatak2;

import java.util.ArrayList;

public class Disciplina {
    private String imeDiscipline;
    private String tip;
    private ArrayList<Atleticar> atleticari;

    public Disciplina() {
        this.atleticari = new ArrayList<>();
    }

    public Disciplina(String imeDiscipline, String tip) {
        this.imeDiscipline = imeDiscipline;
        this.tip = tip;
        this.atleticari = new ArrayList<>();
    }
    public void dodajAtleticara (Atleticar atleticar) {
        this.atleticari.add(atleticar);
    }
    public void diskvalifikujeAtleticara (String punoIme) {
        for (int i = 0; i < this.atleticari.size(); i++) {
            if (this.atleticari.get(i).getPunoIme().equals(punoIme)) {
                this.atleticari.remove(i);
            }
        }
    }
    private Atleticar najboljiRezultat () {
        if (this.atleticari.isEmpty()) {
            return null;
        }
        Atleticar najbolji = this.atleticari.get(0);
        for (int i = 0; i < this.atleticari.size();i++) {
            if (this.atleticari.get(i).daLiJeBoljiRezultat(najbolji)) {
                najbolji = this.atleticari.get(i);
            }
        }
        return najbolji;
    }
    public void printNajboljiRezultat () {
        System.out.print("Najbolji rezultat: ");
        this.najboljiRezultat().print();
    }

    public String getImeDiscipline() {
        return imeDiscipline;
    }

    public void setImeDiscipline(String imeDiscipline) {
        this.imeDiscipline = imeDiscipline;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public ArrayList<Atleticar> getAtleticari() {
        return atleticari;
    }

    public void setAtleticari(ArrayList<Atleticar> atleticari) {
        this.atleticari = atleticari;
    }
}
