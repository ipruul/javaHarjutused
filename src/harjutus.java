import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collection;


/**
 * Created by ipruu_000 on 2.02.2017.
 */
public class harjutus extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {


        Pane pane = new Pane();
        Scene scene = new Scene(pane, 600, 400);

        primaryStage.show();
        primaryStage.setScene(scene);




        Label lbl1 = new Label();
        Button btn1 = new Button("Add");
        Button btn2 = new Button("Remove all");
        Button btn3 = new Button("remove selected");
        btn1.setLayoutY(50);
        btn2.setLayoutY(80);
        btn3.setLayoutY(110);

        TextField txt1 = new TextField();

        Label lbl2 = new Label();
        lbl2.setLayoutY(50);
        lbl2.setLayoutX(50);

        ArrayList list = new ArrayList();


        ListView listView = new ListView();

        listView.setLayoutY(5);
        listView.setLayoutX(200);

        ;

        btn1.setOnAction(event -> {

            String b = txt1.getText();
            lbl2.setText(b);
            txt1.clear();

            listView.getItems().addAll(b);


        });



        btn2.setOnAction(event -> {
            listView.getItems().clear();

        });




        btn3.setOnAction(event -> {


        });


        pane.getChildren().addAll(btn1, btn2, btn3, lbl1, txt1, lbl2, listView);



    }
}
