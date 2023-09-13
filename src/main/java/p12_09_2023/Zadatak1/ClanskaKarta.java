package p12_09_2023.Zadatak1;

public class ClanskaKarta {
    private int discount;
    private String cardNo;

    public ClanskaKarta (int discount, String cardNo){
        this.discount = discount;
        this.cardNo = cardNo;
    }
    public void setDiscount (int discount) {
        this.discount = discount;
    }
    public int getDiscount() {
        return this.discount;
    }

    public void setCardNo (String cardNo) {
        this.cardNo = cardNo;
    }
    public String getCardNo () {
        return this.cardNo;
    }
}
