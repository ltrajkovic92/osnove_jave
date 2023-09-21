package d19_09_2023.Zadatak2;

public class Planina {
    private String name;
    private String countryName;
    private double mountainHeight;

    public Planina() {
    }

    public Planina(String name, String countryName, double mountainHeight) {
        this.name = name;
        this.countryName = countryName;
        this.mountainHeight = mountainHeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public double getMountainHeight() {
        return mountainHeight;
    }

    public void setMountainHeight(double mountainHeight) {
        this.mountainHeight = mountainHeight;
    }
}
