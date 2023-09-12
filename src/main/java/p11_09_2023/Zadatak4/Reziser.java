package p11_09_2023.Zadatak4;

public class Reziser {
    private String directorName;
    private int born;

    public Reziser (){

    }
    public Reziser (String nameDirector, int born) {
        this.directorName = nameDirector;
        this.born = born;
    }
    public void print () {
        System.out.println(this.directorName + ", " + this.born + ".god");
    }
    public String getDirectorName() {
        return this.getDirectorName();
    }
    public void setDirectorName(String born) {
        this.directorName = born;
    }
    public int getBorn() {
        return this.born;
    }
    public void setBorn(int born) {
        this.born = born;
    }
}
