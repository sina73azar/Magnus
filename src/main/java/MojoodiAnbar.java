import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MojoodiAnbar {
    private Scene scene;
    private Stage stage;
    private Parent root;
    @FXML
    private void goBackToHomePage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(
                Objects.requireNonNull(getClass().getResource("home.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
