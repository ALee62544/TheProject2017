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
        stage.setTitle("Quiz Application");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

        HBox boxOfButtons = new HBox(30);
        Button[] myButtons = new Button[4];

        myButtons[0] = new Button("Create");
        myButtons[0].setPrefSize(200, 50);
        myButtons[0].setLayoutX(40);
        myButtons[0].setLayoutY(400);
        myButtons[0].setOnAction((ActionEvent ae) -> doSomething(ae));

        myButtons[1] = new Button("Delete");
        myButtons[1].setPrefSize(200, 50);
        myButtons[1].setLayoutX(280); //add 225 to previous x
        myButtons[1].setLayoutY(400);
        myButtons[1].setOnAction((ActionEvent ae) -> doSomething(ae));

        myButtons[2] = new Button("Edit");
        myButtons[2].setPrefSize(200, 50);
        myButtons[2].setLayoutX(525);
        myButtons[2].setLayoutY(400);
        myButtons[2].setOnAction((ActionEvent ae) -> doSomething(ae));

        myButtons[3] = new Button("Quiz");
        myButtons[3].setPrefSize(200, 50);
        myButtons[3].setLayoutX(775);
        myButtons[3].setLayoutY(400);
        myButtons[3].setOnAction((ActionEvent ae) -> doSomething(ae));



        root.getChildren().addAll(myButtons);

    }


    public static void main(String[] args) {
        launch(args);
    }

    public static void doSomething(ActionEvent ae) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Wow, you clicked the button with style!");
        alert.showAndWait();
    }


    public static void sceneCreate(ActionEvent ae) {
    }
    public static void sceneEdit(ActionEvent ae) {
    }
    public static void sceneDelete(ActionEvent ae) {
    }
    public static void sceneQuiz(ActionEvent ae) {
    }
}
  /*  Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Quiz Application");
                primaryStage.setScene(new Scene(root, 1080, 800));
                primaryStage.show(); */