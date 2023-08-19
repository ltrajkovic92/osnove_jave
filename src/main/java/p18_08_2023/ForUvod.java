package p18_08_2023;

public class ForUvod {
    public static void main(String[] args) {


//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }

//      0 ....1.....2.....3....4....5
//                                  i
//      0     1     2     3    4
//        a = a + 1; <==> a++;

//        0 .................. 5
//        0 ..........................................10
//                   3 ....................7
//                                         7 .........10
//
//      0 2 4 6 ...
//        7, 9, 11



        for (int i = 7; i < 10; i = i + 2) {
            System.out.println(i);
        }

        int i = 0;
        System.out.println(i);
        i++; // 1
        System.out.println(i);
        i++; // 2
        System.out.println(i);
        i++; // 3
        System.out.println(i);
        i++; // 4
        System.out.println(i);
        i++; // 5
        System.out.println(i);
        i++; // 6
//      BREAK





        System.out.println("KRAJ");

    }
}
