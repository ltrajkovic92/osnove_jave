package p21_08_2023;

public class Zadatak4 {
   public static void main(String[] args) {

       //4.	Napisati program koji pronalazi 7 stepen broja 2. Koristeci FOR petlju
       //Izvrsenje:
       // 2 na stepen 7 je 128


       int osnova = 2;
       int stepen = 7;
       int prod = 1;

       for (int i = 0; i < 7; i++) {
           prod = prod * osnova;
      }
       System.out.println(osnova +  " na stepen " + stepen + " je " + prod);
    }
}
