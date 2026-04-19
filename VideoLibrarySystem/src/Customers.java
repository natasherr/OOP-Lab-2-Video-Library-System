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

public class Customers extends Application {
    @Override
    public void start(Stage stage) {
        // Create nodes 
        Text textName = new Text("Name:");
        TextField fieldName = new TextField();
        
        Text textPhone = new Text("Phone:");
        TextField fieldPhone = new TextField();
        
        Text textEmail = new Text("Email:");
        TextField fieldEmail = new TextField();
        
        Button btnSave = new Button("Save Customer");
        
        Text textRegistered = new Text("Registered:");
        ComboBox<String> comboRegistered = new ComboBox<>();
        
        Button btnRemove = new Button("Remove Customer");

        // Setup GridPane
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(600, 400);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment(Pos.CENTER);

        // Arrange nodes (Column, Row)
        gridPane.add(textName, 0, 0);
        gridPane.add(fieldName, 1, 0);
        
        gridPane.add(textPhone, 0, 1);
        gridPane.add(fieldPhone, 1, 1);
        
        gridPane.add(textEmail, 0, 2);
        gridPane.add(fieldEmail, 1, 2);
        
        gridPane.add(btnSave, 1, 3);
        
        gridPane.add(textRegistered, 0, 4);
        gridPane.add(comboRegistered, 1, 4);
        
        gridPane.add(btnRemove, 1, 5);

        // Styling
        btnSave.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        btnRemove.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        textName.setStyle("-fx-font: normal bold 16px 'serif';");
        textPhone.setStyle("-fx-font: normal bold 16px 'serif';");
        textEmail.setStyle("-fx-font: normal bold 16px 'serif';");
        textRegistered.setStyle("-fx-font: normal bold 16px 'serif';");
        gridPane.setStyle("-fx-background-color: WHITE;");

        // Setup Scene and Stage
        Scene scene = new Scene(gridPane);
        stage.setTitle("Customers - Video Library System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}