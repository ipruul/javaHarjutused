import java.awt.*;
import java.util.Arrays;

/**
 * Antud on int[] massiiv. Eemalda kõik nr 3 väärtused ja leia millist numbrit esineb kõige siis rohkem?
 * Mitte siis number, mis on kolmandal indeksil, vaid nr kolm ise.
 */
public class KuulusNumber {

    public static void main(String[] args) {

        int[] naide = {1, 5, 3, 3, 6, 3, 7, 7}; // vastus on 7
        for (int i = 0; i <naide.length ; i++) {
            System.out.println(naide[i]);
            if (naide[i] == 3){
                System.out.println("kolm");
                Arrays.asList(naide[i]);
                System.out.println(naide[i]);


            }
//            int[] naide2 = {naide[i]};
//            System.out.println(naide[i]);

        }
    }

}
