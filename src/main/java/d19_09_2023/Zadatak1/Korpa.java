package d19_09_2023.Zadatak1;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Ambalaza> packagings;

    public Korpa() {
        this.packagings = new ArrayList<>();
    }
    public void addPackaging (Ambalaza packaging) {this.packagings.add(packaging);}
    public void removePackaging (String barcode) {
        for (int i = 0; i < this.packagings.size(); i++) {
            if (this.packagings.get(i).barcode.equals(barcode)) {
                this.packagings.remove(i);
            }
        }
    }
    private double packagingsPriceWithDiscount (double discount) {
        double packagingsPrice = 0;
        for (int i = 0; i < packagings.size(); i++) {
            packagingsPrice += packagings.get(i).articalPrice();
        }
        return packagingsPrice - discount;
    }
    public double totalCartPrice (SuperKartica superKartica) {
        return packagingsPriceWithDiscount(superKartica.getDiscount());
    }

    public ArrayList<Ambalaza> getPackagings() {
        return packagings;
    }
}
