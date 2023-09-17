package p15_09_2023.Zadatak2;

public class PlatnaKartica {
    protected double sum;
    protected String cardNo;
    protected int cardYear;
    protected int month;

    public PlatnaKartica(double sum, String cardNo, int cardYear, int month) {
        this.sum = sum;
        this.cardNo = cardNo;
        this.cardYear = cardYear;
        this.month = month;
    }

    public void add (double value) {
        this.sum = this.sum + value;
    }
    public void makeTransaction (double value) {
        this.sum = this.sum - value;
    }
    public void print () {
        System.out.println(this.cardNo + ", " + this.month + "/" + this.cardYear + ", $" + this.sum);
    }

    public double getSum() {
        return sum;
    }

    public String getCardNo() {
        return cardNo;
    }

    public int getCardYear() {
        return cardYear;
    }

    public int getMonth() {
        return month;
    }
}
