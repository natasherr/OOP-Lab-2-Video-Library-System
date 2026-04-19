import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Movies extends Application {
    @Override
    public void start(Stage stage) {
        
        Text textGenre = new Text("Genres:");
        ComboBox<String> comboGenre = new ComboBox<>();
        
        Text textName = new Text("Name:");
        TextField fieldName = new TextField();
        
        Button btnSave = new Button("Save Movie");
        
        Text textRegistered = new Text("Registered:");
        ComboBox<String> comboRegistered = new ComboBox<>();
        
        Button btnRemove = new Button("Remove Movie");

        // Setup GridPane
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(600, 400);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment(Pos.CENTER);

        
        gridPane.add(textGenre, 0, 0);
        gridPane.add(comboGenre, 1, 0);
        
        gridPane.add(textName, 0, 1);
        gridPane.add(fieldName, 1, 1);
        
        gridPane.add(btnSave, 1, 2);
        
        gridPane.add(textRegistered, 0, 3);
        gridPane.add(comboRegistered, 1, 3);
        
        gridPane.add(btnRemove, 1, 4);

        // Styling of the window
        btnSave.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        btnRemove.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        textGenre.setStyle("-fx-font: normal bold 16px 'serif';");
        textName.setStyle("-fx-font: normal bold 16px 'serif';");
        textRegistered.setStyle("-fx-font: normal bold 16px 'serif';");
        gridPane.setStyle("-fx-background-color: WHITE;");

        // Setup Scene and Stage
        Scene scene = new Scene(gridPane);
        stage.setTitle("Movies - Video Library System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}