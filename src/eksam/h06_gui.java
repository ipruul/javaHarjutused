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
        Label l = new Label("test");

        TextField tx = new TextField();
        tx.setText("Helll");
        String txt = tx.getText();
        System.out.println(txt);



        l.setLayoutY(100);
        l.setLayoutX(100);
       // String nimi = kasutajanimi.getText();


        Button button = new Button("klikk");
        button.setOnAction(event -> {
            l.setText(txt);
        });




        ListView<String> list = new ListView<String>();
        ObservableList<String> items =FXCollections.observableArrayList (
                "Single", "Double", "Suite", "Family App");
        list.setItems(items);
        list.setLayoutX(120);
        list.setLayoutY(120);

        button.setLayoutX(50);
        button.setLayoutY(50);

        items.add(txt);
        



        pane.getChildren().addAll(l, button, tx, list);



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
