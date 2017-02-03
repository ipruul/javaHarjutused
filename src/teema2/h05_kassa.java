package teema2;

/**
 * Created by HP on 3.02.2017.
 */
public class h05_kassa {
    protected int raha = 0;
    protected String kassapidaja;

    public h05_kassa(int algneRaha, String nimi) {
        raha=algneRaha;
        kassapidaja = nimi;
    }

    public  void  sisestaRaha (int rahaSisse){
        raha = raha + rahaSisse;
    }

    public int kassaSeis(){
return raha;
    }
}
