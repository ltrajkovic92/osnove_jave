package d19_09_2023.Zadatak2;

import java.util.ArrayList;

public class PlaninarskiDom {
    private String homeName;
    private int year;
    private ArrayList<Planinar> members;

    public PlaninarskiDom() {
        this.members = new ArrayList<>();
    }

    public PlaninarskiDom(String homeName, int year) {
        this.homeName = homeName;
        this.year = year;
        this.members = new ArrayList<>();
    }
    public void addMountaineer (Planinar mountaineer) {
        this.members.add(mountaineer);
    }
    public int numberSuccessClimbers (Planina planina) {
        int counter = 0;
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).successfulClimb(planina)) {
                counter++;
            }
        }
        return counter;
    }
    public void removeMember (int id) {
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).id == id) {
                members.remove(members.get(i));
            }
        }
    }
    public void print () {
        System.out.println("Planinarski dom " + this.homeName + ", osnovan " + this.year + " godine.");
        System.out.println("Clanovi: ");
        for (Planinar planinar : members) {
            planinar.print();
        }
        System.out.println("Mesecni prihod " + this.monthlyIncome() + " din.");
    }
    public int monthlyIncome () {
        int membership = 0;
        for (int i = 0; i < members.size(); i ++) {
            membership += members.get(i).membershipFee();
        }
        return membership;
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<Planinar> getMountaineers() {
        return members;
    }
}
