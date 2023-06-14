package com.mcl.typesofsorts;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField arrayField;

    @FXML
    private Hyperlink linkOnGithub;

    @FXML
    private CheckBox photo;

    @FXML
    private ChoiceBox<?> sortType;

    @FXML
    private Button startButton;

    @FXML
    private ChoiceBox<?> type;

    @FXML
    void initialize() {
        assert arrayField != null : "fx:id=\"arrayField\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert linkOnGithub != null : "fx:id=\"linkOnGithub\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert photo != null : "fx:id=\"photo\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert sortType != null : "fx:id=\"sortType\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert startButton != null : "fx:id=\"startButton\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert type != null : "fx:id=\"type\" was not injected: check your FXML file 'hello-view.fxml'.";
        startButton.setOnAction(event -> {
            System.out.println("pushed");
            try {
                HelloApplication.openSecondWindow();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

}
