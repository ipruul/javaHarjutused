package eksam;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


/**
 * Created by ipruu_000 on 1.02.2017.
 */
public class h07_oop extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 800, 600);

        primaryStage.setScene(scene);
        primaryStage.show();


        String omanikuNimi = "Indrek Pruul";
        h07_selakott kott = new h07_selakott(omanikuNimi);

        kott.lisaAsi("Hambahari");
        kott.lisaAsi("Hambapasta");
        kott.lisaAsi("Vangevari");
        kott.lisaAsi("Vihmavari");

        kott.eemaldaAsi("Vihmavari");

        kott.misOnKotis();

       // System.out.println("kotis on järgnevad asjad " + kott.misOnKotis() + " ");


        ListView listView = new ListView();

        listView.getItems().addAll(kott.list);


        pane.getChildren().addAll(listView);




    }





}
