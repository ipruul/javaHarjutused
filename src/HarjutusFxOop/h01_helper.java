package HarjutusFxOop;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Created by ipruu_000 on 6.02.2017.
 */
public class h01_helper {

    Stage stage = new Stage();

    h01_helper(){
            setupScene();
        readcsv();
        
        
        }

    private void readcsv() {
        
    }

    private void algus(Pane pane) {
        Label lbl01 = new Label();
        
        

        TextField txt01 = new TextField();




        pane.getChildren().addAll(lbl01);
        pane.setLayoutY(10);
        pane.setLayoutX(10);




    }
    private void setupScene() {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 800, 600);
        algus(pane);
        pane.getChildren().addAll();
        stage.setScene(scene);
        stage.show();
    }
}
