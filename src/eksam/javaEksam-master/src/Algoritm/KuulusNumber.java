
import java.util.Arrays;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Antud on int[] massiiv. Eemalda kõik nr 3 väärtused ja leia millist numbrit esineb kõige siis rohkem?
 * Mitte siis number, mis on kolmandal indeksil, vaid nr kolm ise.
 */
public class KuulusNumber {

    public static void main(String[] args) {

        int[] naide = {1, 5, 3, 3, 6, 3, 7, 7}; // vastus on 7
        for (int i = 0; i < naide.length; i++) {

            // System.out.println(naide[i]);

//            System.out.println(naide[i]);
                if (naide[i] == 1 || naide[i] == 2 || naide[i] == 4 || naide[i] == 5 || naide[i] == 6 || naide[i] == 7) {


                    System.out.println(naide[i]);


                }


//            int[] naide2 = {naide[i]};
//            System.out.println(naide[i]);

            }
        }

    }
