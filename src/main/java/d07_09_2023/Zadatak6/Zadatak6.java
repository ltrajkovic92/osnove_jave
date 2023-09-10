package d07_09_2023.Zadatak6;

public class Zadatak6 {
    public static void main(String[] args) {

        // Zadatak 6: (za vezbanje ali topla prepuka svakom): Upravljanje Flotom Vozila - Rešite Poslovni Problem
        //
        //Pretvorite se u softverskog arhitektu koji će rešiti konkretan poslovni problem. Radite za kompaniju za dostavu koja se suočava sa sve većim izazovima u upravljanju svojom flotom vozila. Vaš zadatak je da razvijete softver za efikasno praćenje i upravljanje resursima kompanije.
        //
        //Kompanija ima vozila, vozače, rute za dostavu i potrebu da prati status svake dostave. Vaš cilj je da identifikujete potrebne klase za rešavanje ovog problema.
        //
        //**Scenario:**
        //
        //Kompanija poseduje različite vrste vozila, svako vozilo ima svoje karakteristike, uključujući marku, model, registarski broj i godinu proizvodnje. Vozači su takođe deo flote i svaki vozač ima svoje lične informacije, uključujući ime, prezime, JMBG, broj vozačke dozvole i datum isteka vozačke dozvole.
        //
        //Dostave se odvijaju duž različitih ruta, a svaka ruta ima svoju polaznu tačku, odredište, dužinu rute (u kilometrima) i očekivano vreme putovanja.
        //Vaš zadatak je da definišete potrebne klase za praćenje i upravljanje ovim resursima kako biste pomogli kompaniji da optimizuje svoje poslovanje.
        //
        //Kroz analizu ovog scenarija, razmislite koje klase su potrebne da biste efikasno rešili problem upravljanja vozilima, vozačima, rutama i dostavama. Kreirajte klase sa odgovarajućim atributima kako biste omogućili upravljanje ovim resursima i u glavnom programu kreirajte objekte.

        Vozac firstDriver = new Vozac();
        firstDriver.name = "Petar";
        firstDriver.lastName = "Petrovic";
        firstDriver.personalNo = "1203995875455";
        firstDriver.drivingLicenceNo = 002365123;
        firstDriver.drivingLicenceDate = "06.2025";

        Vozilo firstVehicle = new Vozilo();
        firstVehicle.brand = "VW";
        firstVehicle.model = "Polo";
        firstVehicle.vehicleYear = 2015;
        firstVehicle.regNo = "NI-545-JL";

        Ruta firstRoute = new Ruta();
        firstRoute.startingPoint = "Nis";
        firstRoute.destination = "Novi Sad";
        firstRoute.routeLength = 328.9;
        firstRoute.numberOfDays = 2;

        Dostava firstDelivery = new Dostava();
        firstDelivery.deliveryNumber = 56325;
        firstDelivery.driver = firstDriver;
        firstDelivery.vehicle = firstVehicle;
        firstDelivery.route = firstRoute;
        firstDelivery.status = "U toku je isporuka.";

        firstDelivery.print();
    }
}
