import java.util.Arrays;

/**
 * Loo 9*9 maatriks, millel on kujutatud kikilipsu. Värvitud ala on number 0 ja
 * värvimata on punkt. Kui ei oska siis joonista esiteks rist ja liigu sealt edasi.
 *
 * Näide
 * 0 . . . . . . . 0
 * 0 0 . . . . . 0 0
 * 0 0 0 . . . 0 0 0
 * 0 0 0 0 . 0 0 0 0
 * 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 . 0 0 0 0
 * 0 0 0 . . . 0 0 0
 * 0 0 . . . . . 0 0
 * 0 . . . . . . . 0
 *
 */
public class Kikilips {


    public static void main(String[] args) {
        System.out.println("hrllo");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println(" ");
        }


////     Lihtsalt abiline meetod, et maatriksit välja printida
//    private static void printMaatriks(int[][] laud) {
//        for (int i = 0; i < laud.length; i++) {
//            System.out.println(Arrays.toString(laud[i]));
//        }
//        System.out.println("hello");
//    }
    }
}