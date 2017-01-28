import java.util.Arrays;

/**
 * Loo 9*9 maatriks, millel on kujutatud liivakella. Värvitud ala on number 0 ja
 * värvimata on punkt. Kui ei oska siis joonista esiteks rist ja liigu sealt edasi.
 *
 * Näide
 * 0 0 0 0 0 0 0 0 0
 * . 0 0 0 0 0 0 0 .
 * . . 0 0 0 0 0 . .
 * . . . 0 0 0 . . .
 * . . . . 0 . . . .
 * . . . 0 0 0 . . .
 * . . 0 0 0 0 0 . .
 * . 0 0 0 0 0 0 0 .
 * 0 0 0 0 0 0 0 0 0
 *
 */
public class Liivakell {

    // Lihtsalt abiline meetod, et maatriksit välja printida
    public static void main(String[] args) {


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if ((i >= j && i + j > 7) || (i <= j && i + j <= 8)) {
                    System.out.print(" 0 ");

                } else {
                    System.out.print(" - ");
                }

            }
            System.out.println();

        }
    }
}