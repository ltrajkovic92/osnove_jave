package p21_08_2023;

public class PetljeNastavak {
    public static void main(String[] args) {


//   1,2,3,4,5,6....10
//   suma = 1 + 2 + 3 + 4 ... + 10
//   suma = 0
//   suma = suma + 1
//   suma = suma + 2
//   suma = suma + 3
//   suma = suma + 4
//   suma = suma + 5
//   sout (15)

        int suma = 0;

        for (int i= 1; i <= 10; i++) {
           int x = suma + i;
            suma = x;
        }
        System.out.println("Suma je " + suma);
    }
}
