package d12_09_2023.Zadatak1;

public class Ugovor {
    private String contractDate;
    private FizickoLice seller;
    private FizickoLice buyer;
    private double price;
    private String address;

    public Ugovor (String contractDate, FizickoLice seller, FizickoLice buyer, double price, String address) {
        this.contractDate = contractDate;
        this.seller = seller;
        this.buyer = buyer;
        this.price = price;
        this.address = address;
    }
    public double percentage () {
        if (this.buyer.getWasAlreadyCustomer()) {
            return 0.02;
        }
        return 0.03;
    }
    public double sellingProfit () {
        return 1000 + this.price * this.percentage();
    }
    public void print () {
        System.out.println("Dana " + this.contractDate + "god. sklopljen je ugovor izmedju "
                + this.seller.getFullName() + " o kupovini nekretnine " + this.address);
        System.out.println( ",po ceni od " + this.price + ", pri cemu je kupac u obavezi da agenciji isplati novncanu vrednost u iznosu od " + this.sellingProfit() + "din.");
    }
}
