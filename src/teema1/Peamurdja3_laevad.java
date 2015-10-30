package teema1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * NB! Lahenda käesolev ülesanne konsoolis. Pole vaja JavaFXi siia segada.
 *
 * 1. Kirjuta lihtne laevade pommitamise mäng, kus arvuti genereerib 1x1
 *    laevad mööda 1 dimensioonilist lauda. See tähendab, et mängulaud
 *    ei ole mitte ruudustik, vaid üks rida.
 *
 * 2. Täienda mängu nii, et nüüd oleks laual ruudustik.
 *
 * 3. Kas oskad ka nii, et laevad ei ole 1x1 vaid 1x2 ja 1x3 ja orienteeruvad
 *    nii vertikaalselt kui ka horisontaalselt?
 */
public class Peamurdja3_laevad {
    public static void main(String[] args) {
        //  int [] laud = new int[9];
        //  laud[0] = 8;
        int[] laud = {1, 0, 1, 0, 1};

        System.out.println(laud[1]);
        //  System.out.println(laud.length );
        //hello halloween

        Scanner kasutaja = new Scanner(System.in);
        System.out.println("Sisesta no kuni " + laud.length);
        int sisestus = kasutaja.nextInt();
        System.out.println(laud[sisestus]);
        System.out.println(Arrays.toString(laud));

        // int sum = 0;
        //while ( sum = IntStream.of(laud).sum())
        while (gameover(laud)) {
            int hit = laud[sisestus];

            if (hit == 0) {
                System.out.println("Mööda");
            } else if (hit == 1) {
                System.out.println("Pihta");
            }

//                System.out.println("Mööda");
//            }
//            else {
//                System.out.println("Pihta");
//                laud[sisestus] = 1;
//                System.out.println(Arrays.toString(laud));
//            }
        }


    }

    public static boolean gameover(int[] laud) {
        for (int i = 0; i < laud.length; i++) {
            if (laud[i] == 1) {
                return true;
            }

        }
        return false;
    }
}


