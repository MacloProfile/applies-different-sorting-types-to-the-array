package com.mcl.typesofsorts.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.mcl.typesofsorts.logic.Main;
import com.mcl.typesofsorts.logic.SetResultFields;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ResultController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField sourceField;

    @FXML
    private TextField sourceField1;

    @FXML
    private TextField runtimeField;

    @FXML
    void initialize() {
        assert sourceField != null : "fx:id=\"sourceField\" was not injected: check your FXML file 'result.fxml'.";
        assert sourceField1 != null : "fx:id=\"sourceField1\" was not injected: check your FXML file 'result.fxml'.";

        sourceField.setText(SetResultFields.getCourse());
        sourceField1.setText(SetResultFields.getResult());
        runtimeField.setText(SetResultFields.getRuntime());
    }

}
