package eksam;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;



/**
 * Created by ipruu_000 on 30.01.2017.
 */
public class h03_main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

//      lava
        VBox layout = new VBox();
        Scene scene = new Scene(layout, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

//        visuaalid
        Label kasutajaLAbel = new Label("Kasutajanimi");
        TextField kaabaInputInput = new TextField();
        Label paroolLabelLabel = new Label("Parool");
        PasswordField paroolInput = new PasswordField();
        Button nup = new Button("Logi sisse");

        Label teade = new Label();
        layout.getChildren().addAll(kasutajaLAbel, paroolInput, paroolLabelLabel, teade, nup, kaabaInputInput);


        // nuputegevus




    }
}
