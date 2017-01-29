package eksam;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Collection;

/**
 * Created by ipruu_000 on 29.01.2017.
 */
public class h02_main extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 600, 500);


        primaryStage.setScene(scene);
        primaryStage.show();

        Circle ring = new Circle(49);

        ring.setLayoutX(100);
        ring.setLayoutY(100);

        klass Kl = new klass();
        Kl.meetod();

        button B1 = new button();
        B1.klik();


        pane.getChildren().addAll(ring);
        


    }

    public class klass{
        public void meetod(){
            System.out.println("Tere hommikust");
        }


    }
    public class button{
        public void klik()
        {
            System.out.println("Nupp");
        }
    }
}
