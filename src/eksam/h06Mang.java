package eksam;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



/**
 * Created by ipruu_000 on 31.01.2017.
 */
public class h06Mang {
    TextField kasutajanimi;
    TextField parool;
    Button loginButton;
    Button registerButton;
    Stage stage = new Stage();

    h06Mang(){
        setupScene();
        helloScreen();
    }

    private void helloScreen() {

        String nimi = kasutajanimi.getText();

//        String parool = registerButton.getText();
        System.out.println(nimi);
        Label l2 = new Label();
        l2.setLayoutY(70);
        System.out.println(l2.toString());
        loginButton.setOnAction(event -> l2.setText(nimi));
    }

    private void setupScene() {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 800, 600);

        Label l1 = new Label("Kasutaja");
        kasutajanimi = new TextField();
        parool = new TextField();
        loginButton = new Button("Login");
        loginButton.setLayoutY(40);

        pane.getChildren().addAll(kasutajanimi, loginButton);


        stage.setScene(scene);
        stage.show();
    }


}
