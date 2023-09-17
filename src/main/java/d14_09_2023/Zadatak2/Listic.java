package d14_09_2023.Zadatak2;

import java.util.ArrayList;

public class Listic {
    private ArrayList<Kombinacija> combinations;

    public Listic() {
        this.combinations = new ArrayList<>();
    }

    public void addCombination(Kombinacija combination) {
        if (this.combinations.size() <= 7)
            this.combinations.add(combination);
    }

    public boolean isWinningCombination(Kombinacija combination) {
        for (int i = 0; i < this.combinations.size(); i++) {
            if (this.combinations.get(i).areCombinationsEquals(combination))
                return true;
        }
        return false;
    }

    public void stampa() {
        for (int i = 0; i < combinations.size(); i++) {
            combinations.get(i).print();
        }
    }
}
