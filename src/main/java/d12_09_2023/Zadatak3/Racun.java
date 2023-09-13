package d12_09_2023.Zadatak3;

public class Racun {
    private String accountNo;
    private String fullName;
    private double currentBalance;

    public Racun (String accountNo, String fullName, double currentBalance) {
        this.accountNo = accountNo;
        this.fullName = fullName;
        this.currentBalance = currentBalance;
    }
    public void paymentOnAccount (double payment) {
        this.currentBalance += payment;
    }
    public void removeFromAccount (double remove) {
        this.currentBalance -= remove;
    }
    public void print () {
        System.out.println(this.fullName + " - " + this.accountNo);
        System.out.println("Stanje na racunu je: " + this.currentBalance + " rsd.");
        System.out.println();
    }

    public void setAccountNo (String accountNo) {this.accountNo = accountNo;}
    public String getAccountNo () {return this.accountNo;}
    public void setFullName (String fullName) {this.fullName = fullName;}
    public String getFullName () {return this.fullName;}
    public double getCurrentBalance () {return this.currentBalance;}
}
