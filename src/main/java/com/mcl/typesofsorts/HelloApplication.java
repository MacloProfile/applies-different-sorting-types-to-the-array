package com.mcl.typesofsorts;

import com.mcl.typesofsorts.Controllers.ErrorController;
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

    //array random window
    public static void randomWindow() throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Create an array!");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("array.fxml"));
        Scene secondScene = new Scene(fxmlLoader.load(), 300, 220);
        stage.setScene(secondScene);
        stage.show();
    }

    //second window
    public static void openResultWindow() throws IOException {
        Stage inputStage = new Stage();
        inputStage.setTitle("Input!");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("result.fxml"));
        Scene secondScene = new Scene(fxmlLoader.load(), 600, 400);
        inputStage.setScene(secondScene);
        inputStage.show();
    }

    //error message
    public static String errorMessage = "ERROR";

    public static String getErrorMessage() {
        return errorMessage;
    }
    //error window
    public static void error(String message) throws IOException {
        Stage errorStage = new Stage();
        errorStage.setTitle("ERROR");
        errorMessage = message;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("error.fxml"));
        Scene secondScene = new Scene(fxmlLoader.load(), 200, 120);
        errorStage.setScene(secondScene);
        errorStage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}
