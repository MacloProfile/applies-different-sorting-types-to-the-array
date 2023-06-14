package com.mcl.typesofsorts;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    //first window
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 280);
        stage.setTitle("Kinds of sorts");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    //second window
    public static void openSecondWindow() throws IOException {
        Stage secondStage = new Stage();
        secondStage.setTitle("Great!");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sortPage.fxml"));
        Scene secondScene = new Scene(fxmlLoader.load(), 600, 400);
        secondStage.setScene(secondScene);
        secondStage.show();
    }

    //window for point a the exact element
    public static void openInputNumber() throws IOException {
        Stage inputStage = new Stage();
        inputStage.setTitle("Input!");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("input.fxml"));
        Scene secondScene = new Scene(fxmlLoader.load(), 200, 120);
        inputStage.setScene(secondScene);
        inputStage.show();
    }

    public static void error(String errorMessage) throws IOException {
        Stage errorStage = new Stage();
        errorStage.setTitle("Input!");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(""));
        Scene secondScene = new Scene(fxmlLoader.load(), 200, 120);
        errorStage.setScene(secondScene);
        errorStage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}