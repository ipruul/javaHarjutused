package teema2;

/**
 * Created by HP on 3.02.2017.
 */
public class h05_main {
    public static void main(String[] args) {

        double a = h05_abi.astendaja(2,3);
        System.out.println(a);
        System.out.println(h05_abi.astendaja(3,4));
        System.out.println(h05_abi.arv);


        h05_kassa kassa = new h05_kassa(200, "Maali");
        kassa.sisestaRaha(28);
        kassa.sisestaRaha(10);
        System.out.println(kassa.kassaSeis());

        h05_kassaDollar kassa2 = new h05_kassaDollar(400, "Juuli");


    }
}
