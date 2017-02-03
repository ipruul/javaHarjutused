import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Created by ipruu_000 on 2.02.2017.
 */
public class harjutus4 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 600, 400);

        primaryStage.setScene(scene);
        primaryStage.show();


        TextField txt1 = new TextField();

        TextField txt2 = new TextField();


        txt1.setPrefSize(200, 20);
        txt2.setPrefSize(200, 200);
        txt2.setLayoutX(250);

        primaryStage.setScene(scene);
        primaryStage.show();

        pane.getChildren().addAll(txt1, txt2);


    }
}
