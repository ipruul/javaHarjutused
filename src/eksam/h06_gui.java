package eksam;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by ipruu_000 on 31.01.2017.
 */
public class
h06_gui {
    TextField kasutajanimi;
    Label lbl1;
    Button btn1;



    Stage stage = new Stage();

    h06_gui(){
        setupScene();
      //  helloScreen();
    }

    private void helloScreen(Pane pane) {
        String txt = null;
        Label l = new Label("hell");


        TextField tx = new TextField();
        //     tx.setText(txt);


        txt = tx.getText();
        System.out.println(txt);


        l.setLayoutY(100);
        l.setLayoutX(100);
        // String nimi = kasutajanimi.getText();


        Button nupp = new Button("klikk");
        final String finalTxt = txt;
        nupp.setOnAction(event -> {
            l.setText(finalTxt);
        });


        ListView<String> list = new ListView<String>();
        ObservableList<String> items = FXCollections.observableArrayList(
                "Single", "Double", "Suite", "Family App");
        list.setItems(items);
        list.setLayoutX(120);
        list.setLayoutY(120);

        nupp.setLayoutX(50);
        nupp.setLayoutY(50);


        Button lisa = new Button("lisa");
        items.add(txt);
        lisa.setLayoutX(100);
        lisa.setLayoutY(50);
        System.out.println(txt);

        Button eemalda = new Button("eemalda");

        items.remove(txt);

        eemalda.setLayoutX(100);
        eemalda.setLayoutY(75);


        pane.getChildren().addAll(l, nupp, tx, list, eemalda, lisa);


        // pane.getChildren().addAll(label);


//        String parool = registerButton.getText();

    }

    private void setupScene() {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 800, 600);





        helloScreen(pane);

        pane.getChildren().addAll();


        stage.setScene(scene);
        stage.show();
    }


}
