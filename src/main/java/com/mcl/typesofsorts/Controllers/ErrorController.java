package com.mcl.typesofsorts.Controllers;

import com.mcl.typesofsorts.Application;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ErrorController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField errorField;

    @FXML
    void initialize() {
        assert errorField != null : "fx:id=\"errorField\" was not injected: check your FXML file 'error.fxml'.";
        errorField.setText(Application.getErrorMessage());
    }


}
