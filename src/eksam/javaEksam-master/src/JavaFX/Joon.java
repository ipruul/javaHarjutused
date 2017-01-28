import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt alguse ja lõpu x-y kordinaadid ning joonista talle joon.
 * Akna võime limiteerida 500x500 piksli peale.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */


public class Joon extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);

        primaryStage.setScene(scene);


        Circle ring = new Circle(30);
        pane.getChildren().addAll(ring);

        Line joon = new Line(100, 400, 100, 100);
        pane.getChildren().addAll(joon);

        primaryStage.show();
    }
}
