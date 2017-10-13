package sample;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        Scene scene = new Scene(root, 1000, 900);
        scene.getStylesheets().add("fontstyle.css");
        Stage stage = new Stage();
        String sceneName = "Main";
        stage.setTitle("Quiz Application - " + sceneName);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

        HBox boxOfButtons = new HBox(30);
        Button[] myButtons = new Button[4];


        myButtons[0] = new Button("Create");
        myButtons[0].setPrefSize(200, 125);
        myButtons[0].setLayoutX(40);
        myButtons[0].setLayoutY(375);
        myButtons[0].setOnAction((ActionEvent ae) -> unusedAction(ae));

        myButtons[1] = new Button("Delete");
        myButtons[1].setPrefSize(200, 125);
        myButtons[1].setLayoutX(280); //add 225 to previous x
        myButtons[1].setLayoutY(375);
        myButtons[1].setOnAction((ActionEvent ae) -> unusedAction(ae));

        myButtons[2] = new Button("Edit");
        myButtons[2].setPrefSize(200, 125);
        myButtons[2].setLayoutX(525);
        myButtons[2].setLayoutY(375);
        myButtons[2].setOnAction((ActionEvent ae) -> unusedAction(ae));

        myButtons[3] = new Button("Quiz");
        myButtons[3].setPrefSize(200, 125);
        myButtons[3].setLayoutX(775);
        myButtons[3].setLayoutY(375);
        myButtons[3].setOnAction((ActionEvent ae) -> unusedAction(ae));


        root.getChildren().addAll(myButtons);

    }


    public static void main(String[] args) {
        launch(args);
    }

    public static void unusedAction(ActionEvent ae) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Unused controller");
        alert.setHeaderText(null);
        alert.setContentText("Hey, this isn't being used at the moment!");
        alert.showAndWait();
    }
}

