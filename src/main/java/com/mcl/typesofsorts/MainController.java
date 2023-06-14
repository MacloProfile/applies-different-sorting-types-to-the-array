package com.mcl.typesofsorts;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.mcl.typesofsorts.logic.FirstWindow;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

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
    private ComboBox<String> searches;

    @FXML
    private ComboBox<String> sorts;

    @FXML
    private TextField split;

    @FXML
    private Button startButton;

    @FXML
    void initialize() {
        assert arrayField != null : "fx:id=\"arrayField\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert linkOnGithub != null : "fx:id=\"linkOnGithub\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert photo != null : "fx:id=\"photo\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert searches != null : "fx:id=\"searches\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert sorts != null : "fx:id=\"sorts\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert split != null : "fx:id=\"split\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert startButton != null : "fx:id=\"startButton\" was not injected: check your FXML file 'hello-view.fxml'.";

        //set values for ComboBox
        searches.setItems(FXCollections.observableArrayList("Linear Search", "Binary Search"));
        sorts.setItems(FXCollections.observableArrayList("Bubble Sort", "Insertion Sort", "Selection Sort",
                "Merge Sort", "Quick Sort"));

        //start button
        startButton.setOnAction(event -> {
            //finds out which sorting or search to use
            String type = "";
            if (searches.getValue() != null)
                type = searches.getValue();
            else if (sorts.getValue() != null)
                type = sorts.getValue();

            if (type.equals("")){

            } else {
                FirstWindow firstWindow = new FirstWindow(arrayField.getText(), split.getText(), photo.isSelected()
                        , type);
                try {
                    //create the second window
                    HelloApplication.openSecondWindow();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

}
