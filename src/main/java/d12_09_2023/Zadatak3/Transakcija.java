package d12_09_2023.Zadatak3;

public class Transakcija {
    private int id;
    private Racun sender;
    private Racun recipient;

    public Transakcija (int id, Racun sender, Racun recipient) {
     this.id = id;
     this.sender = sender;
     this.recipient = recipient;
    }
    private double transactionFee (double payment) {
        if (payment < 4500) {
            return 45;
        }
        return payment * 0.01;
    }
    public void makeTransaction (double payment) {
        if (this.sender.getCurrentBalance() > (payment + transactionFee(payment))) {
            this.sender.removeFromAccount(payment + transactionFee(payment));
            this.recipient.paymentOnAccount(payment);
        } else {
            System.out.println("Transakcija nije uspela, nemate dovoljno sredstva na racunu!");
        }
    }
    public void print () {
        System.out.println(this.id);
        System.out.println("Racun sa: " + this.sender.getFullName() + " - " + this.sender.getAccountNo());
        System.out.println("Racuna na: " + this.recipient.getFullName() + " - " + this.recipient.getAccountNo());
        System.out.println();
    }

    public int getId () {return this.id;}
    public void setId (int id) {this.id = id;}
    public Racun getSender () {return this.sender;}
    public void setSender (Racun sender) {this.sender = sender;}
    public Racun getRecipient () {return this.recipient;}
    public void setRecipient (Racun recipient) {this.recipient = recipient;}
}
