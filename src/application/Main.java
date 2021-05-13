package application;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        //creating a label
        Label label = new Label(); //we are creating a new label class
        label.setText("Hello World!");

        //creating a pane
        VBox myFirstPane = new VBox();

        //adding a label into the pane
        myFirstPane.getChildren().add(label);

        //creating scene
        Scene myFirstScene = new Scene(myFirstPane);



        stage.setTitle("My First JFX project");
        stage.setWidth(600);
        stage.setHeight(400);
        stage.setScene(myFirstScene);
        stage.show();

    }
}