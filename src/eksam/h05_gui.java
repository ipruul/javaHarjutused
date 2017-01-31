package eksam;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Created by ipruu_000 on 31.01.2017.
 */
public class h05_gui extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

        Label lbl = new Label();
        h05_gui b = new h05_gui();
        ArrayList arr3 = new ArrayList();

        arr3 = b.myNames();
//
        pane.getChildren().addAll(arr3);


        ArrayList<Integer> mynumbers; {
            ArrayList<Integer> numbers = new ArrayList<Integer>();

            numbers.add(5);
            numbers.add(8);
            numbers.add(12);


        }

        ArrayList<String> myNames; {




        }
    }

    private ArrayList myNames() {
        ArrayList<String> names = new ArrayList<>();

        names.add("Steve");
        names.add("Frank");
        names.add("Joe");

        return names;
    }
}