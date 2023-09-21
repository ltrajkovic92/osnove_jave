package d19_09_2023.Zadatak1;

public class SuperKartica {
    private String cardNo;
    private String ownerFullName;
    private int discount;

    public SuperKartica() {
    }

    public SuperKartica(String cardNo, String ownerFullName, int discount) {
        this.cardNo = cardNo;
        this.ownerFullName = ownerFullName;
        this.discount = discount;
    }
    public void print () {
        System.out.println("Placeno: ");
        System.out.println(this.cardNo + ", " + this.ownerFullName);
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getOwnerFullName() {
        return ownerFullName;
    }

    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
