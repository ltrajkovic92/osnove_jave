package d07_09_2023.Zadatak6;

import java.sql.Driver;

public class Dostava {
    public int deliveryNumber;
    public Vozac driver;
    public Ruta route;
    public Vozilo vehicle;
    public String status;

    public void print() {
        System.out.println("Dostava broj: " + this.deliveryNumber);
        System.out.println("Vozac: " + driver.name + " " + driver.lastName);
        System.out.println("Vozilo: " + vehicle.brand + " " + vehicle.model);
        System.out.println("Ruta: " + route.startingPoint + " - " + route.destination + ", " + route.routeLength + "km");
        System.out.println("Vreme dostave: " + route.routeLength);
        System.out.println("Status: " + status);
    }
}
