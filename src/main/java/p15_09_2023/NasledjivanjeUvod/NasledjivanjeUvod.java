package p15_09_2023.NasledjivanjeUvod;

public class NasledjivanjeUvod {
    public static void main(String[] args) {

        Auto a = new Auto();
        a.setRegistracija("NI-293-JV");
        a.dodajGas();
        a.dodajGas();
        a.dodajGas();
        a.dodajGas();
        a.setMarka("BMW");
        a.setBrojVrata(5);

        Kamion k = new Kamion();
        k.setRegistracija("NI-323-KM");
        k.dodajGas();
        k.dodajGas();
        k.dodajGas();
        k.koci();
        k.setMarka("FAP");
        k.setNosivost(2000);

        a.print();
        k.print();

        //System.out.println("Kraj");
    }
}
