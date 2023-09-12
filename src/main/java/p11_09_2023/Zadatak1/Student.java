package p11_09_2023.Zadatak1;

public class Student {

    private String name;
    private String lastName;
    private int index;
    private boolean isOnBudget;

    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getIndex() {
        return this.index;
    }
    public void setIndex(int index){
        this.index = index;
    }

    public boolean getOnBudget() {
        return this.isOnBudget;
    }
    public void setOnBudget(boolean onBudget){
        this.isOnBudget = onBudget;
    }

    public void print (){
        System.out.println(this.name);
        System.out.println(this.lastName);
        System.out.println(this.index);

        if (this.isOnBudget) {
            System.out.println("Na budzetu.");
        } else {
            System.out.println("Samofinansirajuci.");
        }
    }
}
