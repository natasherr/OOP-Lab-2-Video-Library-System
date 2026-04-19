import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Rentals extends Application {
    @Override
    public void start(Stage stage) {
        // Create nodes 
        Text textCustomer = new Text("Customer:");
        ComboBox<String> comboCustomer = new ComboBox<>();
        
        Text textGenre = new Text("Genre:");
        ComboBox<String> comboGenre = new ComboBox<>();
        
        Text textMovies = new Text("Movies:");
        ComboBox<String> comboMovies = new ComboBox<>();
        
        Button btnSave = new Button("Save Rental");
        
        Text textBorrowed = new Text("Borrowed:");
        ComboBox<String> comboBorrowed = new ComboBox<>();
        
        Button btnReturn = new Button("Return Movie");
        
        Text textReturned = new Text("Returned:");
        ComboBox<String> comboReturned = new ComboBox<>();

        // Setup GridPane
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(600, 500); 
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment(Pos.CENTER);

        // Arrange nodes (Column, Row)
        gridPane.add(textCustomer, 0, 0);
        gridPane.add(comboCustomer, 1, 0);
        
        gridPane.add(textGenre, 0, 1);
        gridPane.add(comboGenre, 1, 1);
        
        gridPane.add(textMovies, 0, 2);
        gridPane.add(comboMovies, 1, 2);
        
        gridPane.add(btnSave, 1, 3);
        
        gridPane.add(textBorrowed, 0, 4);
        gridPane.add(comboBorrowed, 1, 4);
        
        gridPane.add(btnReturn, 1, 5);
        
        gridPane.add(textReturned, 0, 6);
        gridPane.add(comboReturned, 1, 6);

        // Styling
        btnSave.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        btnReturn.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        textCustomer.setStyle("-fx-font: normal bold 16px 'serif';");
        textGenre.setStyle("-fx-font: normal bold 16px 'serif';");
        textMovies.setStyle("-fx-font: normal bold 16px 'serif';");
        textBorrowed.setStyle("-fx-font: normal bold 16px 'serif';");
        textReturned.setStyle("-fx-font: normal bold 16px 'serif';");
        gridPane.setStyle("-fx-background-color: WHITE;");

        // Setup Scene and Stage
        Scene scene = new Scene(gridPane);
        stage.setTitle("Rentals - Video Library System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}