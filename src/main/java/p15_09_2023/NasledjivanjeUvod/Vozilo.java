package p15_09_2023.NasledjivanjeUvod;

public class Vozilo {
    protected String registracija;
    protected String marka;
    protected int brzina;

    public Vozilo() {
    }

    public void dodajGas () {
        this.brzina +=10;
    }
    public void koci () {
        this.brzina -=10;
    }
    public void print () {
        System.out.println("Registracija: "+this.registracija);
        System.out.println("Brzina: "+this.brzina);
        System.out.println("Marka: "+this.marka);
    }

    public String getRegistracija() {
        return registracija;
    }

    public void setRegistracija(String registracija) {
        this.registracija = registracija;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

//    public int getBrzina() {
//        return brzina;
//    }
//
//    public void setBrzina(int brzina) {
//        this.brzina = brzina;
//    }

}
