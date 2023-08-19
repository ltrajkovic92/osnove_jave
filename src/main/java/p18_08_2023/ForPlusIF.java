package p18_08_2023;

public class ForPlusIF {
    public static void main(String[] args) {


        System.out.print("<");
//      0 1 2 0 1 2 0 1 2 0 ..
//      0 1 2 3 4 5 6 7 8 9 x
//  | | | | | 50% | | | | 9

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.print(" 50%");
            }
            System.out.print(" |");
        }
//        | | | | | 50% | | | | |
    }
}
