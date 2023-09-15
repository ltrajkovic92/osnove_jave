package p14_09_2023.Zadatak1;

import java.util.ArrayList;

public class Pasta {
    private ArrayList<Sastojak> ingredients;

    public Pasta() {
        this.ingredients = new ArrayList<>();
    }
    public void dodajSastojak (Sastojak newIngredient) {
        this.ingredients.add(newIngredient);
    }
    public double pastaPrice() {
        double sum = 0;
        for (int i = 0; i < this.ingredients.size(); i++) {
            sum = sum + this.ingredients.get(i).getPrice();
        }
        return sum;
    }
    public void print () {
        System.out.println("Pasta sa sastojcima: ");
        for (int i = 0; i < this.ingredients.size(); i++) {
            this.ingredients.get(i).print();
        }
        System.out.println("Cena paste je: " + pastaPrice());
        System.out.println();
    }
    public void deleteIngredient(String naziv) {
        for (int i = 0; i < this.ingredients.size(); i++) {
            if (this.ingredients.get(i).getName().equals(naziv)) {
                this.ingredients.remove(i);
            }
        }
    }
}
