package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */
public class Peamurdja2_ristmik extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {


        Foor foor1 = new Foor(Foor.YLEMINE, primaryStage);
        Foor foor2 = new Foor(Foor.ALUMINE, primaryStage);
        Foor foor3 = new Foor(Foor.VASAK, primaryStage);
        Foor foor4 = new Foor(Foor.PAREM, primaryStage);
        tsykkel(foor1, 0);
        tsykkel(foor2, 0);
        tsykkel(foor3, 1);
        tsykkel(foor4, 1);




//        Foor foor1 = new Foor(Foor.YLEMINE, primaryStage);
//        Foor foor2 = new Foor(Foor.ALUMINE, primaryStage);
//        Foor foor3 = new Foor(Foor.VASAK, primaryStage);
//        Foor foor4 = new Foor(Foor.PAREM, primaryStage);
//        vertikaalne(foor1 );
//        vertikaalne(foor2 );
//        horisontaalne(foor3);
//        horisontaalne(foor4);


    }

    public void tsykkel(Foor foor, int suund) {
        System.out.println(suund);


        for (int i=suund ; i < 6; i++){

        if (suund != 0) {

            foor.syytaPunane();
            foor.paus(2);


            foor.syytaKollane();
            foor.paus(1);
            foor.vahetaPunast();
            foor.vahetaKollast();

            foor.vahetaRohelist();
            foor.paus(3);
            foor.kustutaRoheline();


            foor.vahetaKollast();
            foor.paus(1);
            foor.kustutaKollane();


            foor.vahetaPunast();
            foor.paus(2);
            foor.kustutaPunane();

        }
            foor.syytaRoheline();
            foor.paus(3);
            foor.kustutaRoheline();
            foor.syytaKollane();
            foor.paus(1);
            foor.kustutaKollane();
            foor.syytaPunane();
            foor.paus(2);
            foor.kustutaPunane();

            foor.syytaKollane();
            foor.paus(1);
            foor.kustutaKollane();
            foor.syytaRoheline();
            foor.paus(3);
            foor.kustutaRoheline();




        }



        }
    }

//    public void vertikaalne(Foor foor) {
//       int i;
//        for (i = 0; i < 6; i++) {
//            foor.syytaPunane();
//            foor.paus(2);
//
//
//            foor.syytaKollane();
//            foor.paus(1);
//            foor.vahetaPunast();
//            foor.vahetaKollast();
//
//            foor.vahetaRohelist();
//            foor.paus(3);
//            foor.kustutaRoheline();
//
//
//            foor.vahetaKollast();
//            foor.paus(1);
//            foor.kustutaKollane();
//
//
//            foor.vahetaPunast();
//            foor.paus(2);
//            foor.kustutaPunane();
//
//        }
//
//
//
//    }
//    public void horisontaalne (Foor foor){
//        int i;
//        foor.paus(4.5);
//        for (i = 0; i < 6; i++) {
//
//            foor.syytaPunane();
//            foor.paus(2);
//
//
//            foor.syytaKollane();
//            foor.paus(1);
//            foor.vahetaPunast();
//            foor.vahetaKollast();
//
//            foor.vahetaRohelist();
//            foor.paus(3);
//            foor.kustutaRoheline();
//
//
//            foor.vahetaKollast();
//            foor.paus(1);
//            foor.kustutaKollane();
//
//
//            foor.vahetaPunast();
//            foor.paus(2);
//            foor.kustutaPunane();
//
//        }


