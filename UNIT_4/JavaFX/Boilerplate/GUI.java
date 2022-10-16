package UNIT_4.JavaFX.Boilerplate;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GUI extends Application {

    @Override
    public void start(Stage stage) throws Exception {    
        //TODO: scene is null you must create a element to be displayed (NOTE: )
        Scene scene = new Scene(null);
        stage.setTitle("Boilerplate");
        stage.setScene(scene);
        stage.show();      
    }

    public static Label label(String text, Color bg_Color, Color textColor)
    {
        Label label = new Label(text);
        label.setAlignment(Pos.CENTER);
        label.setFont(new Font("Arial", 32));
        label.setTextFill(textColor);
        label.setBackground(new Background( new BackgroundFill(bg_Color, CornerRadii.EMPTY, Insets.EMPTY) ));
        return label;
    }

    public static Button button(String text, String path)
    {
        Button button = new Button(text);
        button.setPadding(new Insets(5));
        button.setOnAction(new BtN_ACTN());
        return button;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
