package p21_08_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        //1.Napisati program koji sumira parne brojeve od 1 do 50 i na kraju programa ispisuje sumu.

        int suma = 0;

        for (int i = 0; i <=50; i++) {
            if (i%2==0) {
                suma = suma + i;
            }
        }
        System.out.println("Suma: " + suma);
    }
}
