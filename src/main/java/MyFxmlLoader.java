import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;


public class MyFxmlLoader {
    private Pane view;

    Pane getPage(String fileName) throws IOException {
        try {
            URL fileUrl = HomePage.class.getResource(fileName + ".fxml");
            if (fileUrl == null) {
                throw new java.io.FileNotFoundException("file could not be found");
            }
            view = FXMLLoader.load(fileUrl);
        }catch (Exception e){
            e.printStackTrace();
        }
        return view;
    }
}
