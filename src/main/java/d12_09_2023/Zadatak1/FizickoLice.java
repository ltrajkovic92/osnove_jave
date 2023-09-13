package d12_09_2023.Zadatak1;

public class FizickoLice {
    private String fullName;
    private int idNumber;
    private String personalNo;
    private boolean wasAlreadyCustomer;

    public FizickoLice (String fullName,int idNumber,String personalNo) {
        this.fullName = fullName;
        this.idNumber = idNumber;
        this.personalNo = personalNo;
        this.wasAlreadyCustomer = false;
    }
    public void print () {
        System.out.println(this.fullName + ", " + this.idNumber);
    }
    public String getFullName () {return this.fullName;}
    public void setFullName (String fullName) {this.fullName = fullName;}
    public int getIdNumber () {return this.idNumber;}
    public void setIdNumber (int idNumber) {this.idNumber = idNumber;}
    public String getPersonalNo () {return this.personalNo;}
    public boolean getWasAlreadyCustomer () {return this.wasAlreadyCustomer;}
    public void setWasAlreadyCustomer (boolean wasAlreadyCustomer) {this.wasAlreadyCustomer = wasAlreadyCustomer;}
}
