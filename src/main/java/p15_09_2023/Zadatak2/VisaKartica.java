package p15_09_2023.Zadatak2;

public class VisaKartica extends PlatnaKartica{
    private String ovlascenoLice;
    public VisaKartica(double sum, String cardNo, int cardYear, int month, String ovlascenoLice) {
        super(sum, cardNo, cardYear, month);
        this.ovlascenoLice = ovlascenoLice;
    }
    @Override
    public void makeTransaction (double value) {
        double fee = value * 0.018;
        if (value<4) {
            fee = 4.0;
        }
        super.sum -= value + fee;
    }
    @Override
    public void print () {
        System.out.print("Visa Card: ");
        super.print();
    }
    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }

}
