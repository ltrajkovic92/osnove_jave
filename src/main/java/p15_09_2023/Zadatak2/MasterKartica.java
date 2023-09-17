package p15_09_2023.Zadatak2;

public class MasterKartica extends PlatnaKartica{
    public MasterKartica(double sum, String cardNo, int cardYear, int month) {
        super(sum, cardNo, cardYear, month);
    }
    @Override
    public void makeTransaction (double value) {
        double fee = value * 1.5;
        super.sum -= fee;
    }
    public void chargeMaintenance() {
        super.sum -= 2;
    }
    @Override
    public void print () {
        System.out.println("Master card: " + this.month + "/" + this.cardYear + ", " +  this.cardNo + ", $" + this.sum);
    }
}
