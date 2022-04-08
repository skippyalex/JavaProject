package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
       Parent root = FXMLLoader.load(getClass().getResource("main/java/sample.fxml"));
   primaryStage.setTitle("Hello Worldd");
       primaryStage.setScene(new Scene(root, 300, 275));
//
      JLabel centerLabel = new JLabel("Bottom");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
