import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class bankGUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }
        private TextField name;
        private TextField pin;
    @Override
    public void start(Stage stage) {
        Button wordUpButt = new Button("Create Account");
        //wordUpButt.setOnAction(this::wordUpPress);
        Button depoButt = new Button("Deposit money");
        //depoButt.setOnAction(this::depoPress);
        Button withdrawButt = new Button("Withdraw money");
        //withdrawButt.setOnAction(this::withdrawPress);
        Button statusButt = new Button("Check status");
        //statusButt.setOnAction(this::statusPress);
        Button interestButt = new Button("Add interest");
        //interestButt.setOnAction(this::interestPress);

        FlowPane tayK = new FlowPane(wordUpButt, depoButt, withdrawButt, statusButt, interestButt);
        tayK.setAlignment(Pos.CENTER);
        tayK.setHgap(20);
        tayK.setVgap(10);
        tayK.setStyle("-fx-background-color: pink");

        Scene scene = new Scene(tayK, 300, 400);

        stage.setScene(scene);
        stage.show();
    }

}
