import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Objects;

public class HomePage extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        System.out.println("start method of home page is called");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(
                Objects.requireNonNull(
                        getClass().getResource("home.fxml")));
        Parent root = fxmlLoader.load();

        primaryStage.setTitle("printing");
        primaryStage.initStyle(StageStyle.DECORATED);
        Scene mainScene = new Scene(root);
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }
}
