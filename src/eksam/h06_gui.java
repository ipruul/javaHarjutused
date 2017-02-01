package eksam;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



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
        button.setLayoutX(50);
        button.setLayoutY(50);



        pane.getChildren().addAll(l, button, tx);



       // pane.getChildren().addAll(label);



//        String parool = registerButton.getText();

    }

    private void setupScene() {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 800, 600);

      //  Label l1 = new Label("Kasutaja");
        //kasutajanimi = new TextField();

        //lbl1 = new Label();
       // btn1 = new Button();



        helloScreen(pane);

        pane.getChildren().addAll();


        stage.setScene(scene);
        stage.show();
    }


}
