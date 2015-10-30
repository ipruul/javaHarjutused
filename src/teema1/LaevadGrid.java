package teema1;

import java.util.Arrays;
import java.util.Scanner;

public class LaevadGrid {
    static int[][] laud;
    static int lauaLaius = 4;
    static int lauaKorgus = 3;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        genereeriLaud();
        paigutaLaevad();
        int[] xy = kysiKasutajalt();
        kontrolliTabamust(xy);
        // kasOnLaevuAlles();
        // gameover();
    }

    private static void kontrolliTabamust(int[] xy) {
        int tabamus = laud[xy[0]][xy[1]];
        if (tabamus == 0) {
            System.out.println("läks mööda");
        } else if (tabamus == 1) {
            System.out.println("pihjta");
            laud[xy[0]][xy[1]] = 2;
        }
    }

    private static int[] kysiKasutajalt() {
        System.out.println("Sisesta x ja y kordinaadid (tühik vahel)");
        String sisestus = sc.nextLine(); // 5 6
        System.out.println();
        int x = Integer.parseInt( sisestus.substring(0, 1) );
        int y = Integer.parseInt(sisestus.substring(2, 3));
        System.out.println("Kasutaja sisestas: x " + x + " y " + y);
        int[] xy = new int[]{x, y};
        return xy;
    }

    private static void paigutaLaevad() {
        for (int i = 0; i < lauaKorgus; i++) {
            for (int j = 0; j < lauaLaius; j++) {
                laud[i][j] = (int) Math.round( Math.random() * 0.7 );
            }
            System.out.println(Arrays.toString(laud[i]));
        }
    }

    public static void genereeriLaud() {
        laud = new int[lauaKorgus][lauaLaius];
    }
}