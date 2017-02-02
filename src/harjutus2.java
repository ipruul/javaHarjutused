import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;


/**
 * Created by ipruu_000 on 2.02.2017.
 */
public class harjutus2 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 600, 400);

        primaryStage.setScene(scene);
        primaryStage.show();

        ArrayList<String> list = new ArrayList();
        ListView olist = new ListView();

//        list.add(a);
        list.add("Hambahari");

        TextField txt = new TextField();
        String a = txt.getText();
        Button btn = new Button();
        btn.setLayoutY(30);
        btn.setText("Nupp");
        btn.setOnAction(event -> {
            list.add(a);
        });
        System.out.println(list);



        olist.setLayoutY(60);

        pane.getChildren().addAll(txt, olist, btn);






    }
}
