import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Joonista laevade pommitamine kasutades JavaFXi.
 */
public class Peamurdja1_laevad_fx2 extends Application{
    Stage lava;
    GridPane laud;
    int lauaservepikkus = 150;
    int laudPikkus = 4;
    StackPane maailm;
    Image laevaPilt = new Image("teema2/pirate.png");
    ImagePattern laevaMuster = new ImagePattern(laevaPilt);
    @Override
    public void start(Stage primaryStage) throws Exception {

        lava = primaryStage;
        seadistalava();
        genereeriGrid();
        reageeriKlikile();
        KasOnLaevasidAlles();
        gameover();
    }

    private void gameover() {
        Label teskst = new Label("Võitsid");
//        StackPane stack = new StackPane();
//        stack.getChildren().add(teskst);
//        Scene scene = new Scene(stack, 200, 200);
        maailm.getChildren().add(teskst);


    }

    private boolean KasOnLaevasidAlles() {
        for (Node ruut : laud.getChildren()){
            if (ruut.getId().equals("laev")){
                return true;
            }

        }
        return false;
    }


//    private void KasOnLaevasidAlles() {
//        for (Node node : laud.getChildren()){
//            if (node.getId() == "laev") {
//                return false;
//            }
//        }
//        return true;
//
//    }


    private void reageeriKlikile() {
        laud.setOnMouseClicked(event -> {
            Rectangle ruut = (Rectangle) event.getTarget();
            String ruutID = ruut.getId();

            if (ruutID.equals("laev")){
                ruut.setId("Põhjas");
                ruut.setFill(laevaMuster);

            }
            else if (ruutID.equals("meri")){
                ruut.setId("Põhjas");
                ruut.setFill(Color.RED);

            } if (!KasOnLaevasidAlles()){
                System.out.println("Gamer over");
            }
            //if ()
        });
    }

    private void genereeriGrid() {

        for (int i = 0; i <laudPikkus; i++) {
            for (int j = 0; j <laudPikkus ; j++) {
                Rectangle ruut = new Rectangle(lauaservepikkus, lauaservepikkus);
                int rand = (int) (Math.random()* 2);
                if (rand == 1){
                    ruut.setId("meri");
//                    Label meri = new Label();
//                    meri.setId("Meri");
                } else{
                    ruut.setId("laev");
                }
                ruut.setFill(Color.BLUE);
                ruut.setStroke(Color.BLACK);
                laud.add(ruut, i, j);
            }

        }
    }

    private void seadistalava() {

        maailm = new StackPane();       // GridPane laud = new GridPane();
        laud = new GridPane();
        maailm.getChildren().add(laud);

        Scene skene = new Scene(maailm, 700, 700);
        lava.setScene(skene);
        lava.show();
        lava.setOnCloseRequest(event -> System.exit(0));

    }
}

