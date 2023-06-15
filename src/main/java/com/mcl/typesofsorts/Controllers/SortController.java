package com.mcl.typesofsorts.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SortController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField sourceField;

    @FXML
    private TextField sourceField1;

    @FXML
    void initialize() {
        assert sourceField != null : "fx:id=\"sourceField\" was not injected: check your FXML file 'sortPage.fxml'.";
        assert sourceField1 != null : "fx:id=\"sourceField1\" was not injected: check your FXML file 'sortPage.fxml'.";

    }


}
