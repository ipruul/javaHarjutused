package teema2;

/**
 * Created by HP on 3.02.2017.
 */
public class h05_kassa {
    int raha = 0;
    public  void  sisestaRaha (int rahaSisse){
        raha = raha + rahaSisse;
    }

    public int kassaSeis(){
return raha;
    }
}
