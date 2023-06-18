package com.mcl.typesofsorts.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.mcl.typesofsorts.logic.SetResultFields;
import com.mcl.typesofsorts.logic.features.InformationAboutMethod;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
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
    private Label field1;

    @FXML
    private Label field2;

    @FXML
    private Label field3;

    @FXML
    private Label field4;

    @FXML
    private Label field5;

    @FXML
    void initialize() {
        assert sourceField != null : "fx:id=\"sourceField\" was not injected: check your FXML file 'result.fxml'.";
        assert sourceField1 != null : "fx:id=\"sourceField1\" was not injected: check your FXML file 'result.fxml'.";

        sourceField.setText(SetResultFields.getCourse());
        sourceField1.setText(SetResultFields.getResult());
        runtimeField.setText(SetResultFields.getRuntime());

        InformationAboutMethod info = new InformationAboutMethod();
        info.setDescription(SetResultFields.getMethod());

        field1.setText(info.getField1());
        field2.setText(info.getField2());
        field3.setText(info.getField3());
        field4.setText(info.getField4());
        field5.setText(info.getField5());

    }

}
