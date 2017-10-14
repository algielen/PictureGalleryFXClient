import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Helloworld");
        Button button = new Button("Say HelloWorld");
        button.setOnAction(event -> {
            System.out.println("Hellooo");
        });

        StackPane root = new StackPane();
        root.getChildren().add(button);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
