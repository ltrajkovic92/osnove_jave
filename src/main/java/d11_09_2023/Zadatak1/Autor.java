package d11_09_2023.Zadatak1;

public class Autor {
    private String name;
    private String lastName;

    public Autor (String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    public void print () {
        System.out.println(this.name + " " + this.lastName);
    }
    public void setName (String name) {
        this.name = name;
    }
    public String getName () {
        return this.name;
    }
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }
    public String getLastName () {
        return this.lastName;
    }
}
