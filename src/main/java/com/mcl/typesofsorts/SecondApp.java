package com.mcl.typesofsorts;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class SecondApp extends Application {
    private Button button;

    public SecondApp(Button button) {
        this.button = button;
    }

    @Override
    public void start(Stage primaryStage) {
        Button openButton = new Button("Открыть второе окно");
        openButton.setOnAction(e -> {

        });

        VBox root = new VBox(openButton);
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
