package eksam;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;


/**
 * Created by ipruu_000 on 30.01.2017.
 */
public class h04_main extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane  = new Pane();
        Scene scene = new Scene(pane,  800, 600);

        primaryStage.show();
        primaryStage.setScene(scene);

        Label lbl01 = new Label("Minu proge");

        TextField txt01 = new TextField("tere");
        txt01.setLayoutY(30);
        txt01.getText();
        System.out.println(txt01.getText());
        pane.getChildren().addAll(lbl01, txt01);

        kujund(pane);



    }

    private void kujund(Pane pane) {
        System.out.println("hel");
        Line joon1 = new Line(100, 100, 200, 200);
        pane.getChildren().addAll(joon1);

    }


}
