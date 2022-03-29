package ru.standard.webchat.client;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/window.fxml"));
        Parent root = fxmlLoader.load();
        Controller controller = fxmlLoader.getController();
        primaryStage.setTitle("Web Chat");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.setOnCloseRequest(event -> controller.exit());
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
