package d14_09_2023.Zadatak2;

import java.util.ArrayList;

public class Kombinacija {

    private String id;
    ArrayList<Integer> numbers;

    public Kombinacija(String id, int number1, int number2, int number3, int number4, int number5, int number6, int number7) {
        this.id = id;
        this.numbers = new ArrayList<>();
        this.numbers.add(number1);
        this.numbers.add(number2);
        this.numbers.add(number3);
        this.numbers.add(number4);
        this.numbers.add(number5);
        this.numbers.add(number6);
        this.numbers.add(number7);
    }
    public boolean areCombinationsEquals (Kombinacija combination) {
        for (int i = 0; i < numbers.size(); i++) {
            if(this.numbers.get(i)!=combination.numbers.get(i))
                return false;
        }
        return true;
    }
    public void print () {
        System.out.println("ID: " + this.id);
        System.out.print("Numbers: ");
        for (int i = 0; i < this.numbers.size(); i++) {
            if (i != this.numbers.size() - 1) {
                System.out.print(this.numbers.get(i) + ", ");
            } else {
                System.out.println(this.numbers.get(i));
            }
        }
        System.out.println();
    }

    public String getId() {
        return id;
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }
}
