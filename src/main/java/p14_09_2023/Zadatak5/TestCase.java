package p14_09_2023.Zadatak5;

import java.util.ArrayList;

public class TestCase {
    private int id;
    private String name;
    private ArrayList<TestStep> steps;

    public TestCase(int id, String name) {
        this.id = id;
        this.name = name;
        this.steps = new ArrayList<>();
    }
    public void addTestSteps (TestStep step) {
        this.steps.add(step);
    }
    public int failed () {
        int counter = 0;
        for (int i = 0; i < this.steps.size(); i++) {
            if (!this.steps.get(i).validate()) {
                counter++;
            }
        }
        return counter;
    }
    private String status () {
        if (failed() == 0) {
            return "Passed";
        }
        return "Failed";
    }
    public void print () {
        System.out.println(this.id + " - " + this.name);
        for (int i = 0; i < steps.size(); i++) {
            this.steps.get(i).print();
        }
        System.out.println(this.steps.size() + " / " + this.failed());
        System.out.println("Stanje test case-a " + this.status());
    }
}
