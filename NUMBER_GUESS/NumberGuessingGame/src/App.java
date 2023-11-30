import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    @Override
    public void start(Stage primarystage){
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("home.fxml"));
            Scene scene = new Scene(root);
            primarystage.setScene(scene);
            primarystage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    public static void main(String[] args) {
        launch(args);
    }
}
