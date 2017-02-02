package eksam;

import java.util.ArrayList;

/**
 * Created by ipruu_000 on 1.02.2017.
 */
public class h07_selakott {
    ArrayList <String> list = new ArrayList<>();
    String omanik;

    public h07_selakott(String omanikuNimi){
        omanik = omanikuNimi;

    }

    public void lisaAsi(String toode){
        list.add(toode);
    }

    public void eemaldaAsi(String toode){
        list.remove(toode);
    }

    public String misOnKotis(){

        String vastus = "";

        for (int i = 0; i <list.size() ; i++) {
            vastus += list.get(i);
            vastus += " ";

        }
        return vastus;
    }

    public String omanikuNimi(){
        return omanik;
    }

    public void  tyhjenda(){
        list.clear();
    }

}
