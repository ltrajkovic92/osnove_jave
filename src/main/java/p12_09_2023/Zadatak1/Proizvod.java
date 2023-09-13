package p12_09_2023.Zadatak1;

public class Proizvod {
    private String productName;
    private int costOfProdaction;
    private Kupac customer;

    public Proizvod (String productName, int costOfProdaction, Kupac customer) {
        this.productName = productName;
        this.costOfProdaction = costOfProdaction;
        this.customer = customer;
    }
    public double productPrice (){
        return this.costOfProdaction * 1.9 * (100 - this.customer.getMembershipCard().getDiscount()) / 100;
    }

    public void print () {
        System.out.println(this.productName + " - " + this.productPrice());
        if(this.customer != null) {
            this.customer.print();
        }
    }
    public void setCustomer (Kupac customer) {
        this.customer = customer;
    }
}
