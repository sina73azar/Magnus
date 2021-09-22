import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ControllerDastoorHamkar {
    private Scene scene;
    private Stage stage;
    private Parent root;
    MyFxmlLoader myLoader;
    @FXML
    public BorderPane myBorderPane;
    @FXML
    private void goBackToHomePage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(
                Objects.requireNonNull(getClass().getResource("home.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void openAddNewDastoorHamkar(ActionEvent event) throws IOException {

        Pane view = myLoader.getPage("add_new_dastoor_hamkar");
        myBorderPane.setCenter(view);
    }
    @FXML
    private void openDastoorHamkarList(ActionEvent event) throws IOException {
        Pane view = myLoader.getPage("list_dastoor_hamkar");
        myBorderPane.setCenter(view);
    }

    @FXML
    public void initialize() {
        System.out.println("initialize method running");
        myLoader = new MyFxmlLoader();
    }

}
