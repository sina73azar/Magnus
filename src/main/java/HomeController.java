import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HomeController {
    private Scene scene;
    private Stage stage;
    private Parent root;
    @FXML
    public void openDastoorKarHamkarScene(ActionEvent event) throws IOException {
        System.out.println("opening scene DastoorKarChapScene");

        root = FXMLLoader.load(
                Objects.requireNonNull(getClass().getResource("dastoorkarhamkar.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void openDastoorkarClients(ActionEvent event) throws IOException {
        System.out.println("opening scene DastoorkarClients");
        root = FXMLLoader.load(
                Objects.requireNonNull(getClass().getResource("dastoorkarclients.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void openMojoodiAnbar(ActionEvent event) throws IOException {
        System.out.println("opening scene MojoodiAnbar");
        root = FXMLLoader.load(
                Objects.requireNonNull(getClass().getResource("mojoodi_anbar.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void openClientsScene(ActionEvent event) throws IOException {
        System.out.println("opening scene clients");
        root = FXMLLoader.load(
                Objects.requireNonNull(getClass().getResource("clients.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void openHamkaranScene(ActionEvent event) throws IOException {
        System.out.println("opening scene projects");
        root = FXMLLoader.load(
                Objects.requireNonNull(getClass().getResource("hamkaran.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}