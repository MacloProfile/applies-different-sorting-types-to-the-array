package com.mcl.typesofsorts.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import com.mcl.typesofsorts.logic.CreateRandomArray;
import com.mcl.typesofsorts.logic.Main;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

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
    private TextField findNumber;

    @FXML
    private Button randomArray;

    @FXML
    private Button randomArrayStart;

    @FXML
    private CheckBox valuesInOrder;

    @FXML
    private TextField countOfNumbers;

    @FXML
    void initialize() {
        //create random array and initialize the arrayField
        randomArrayStart.setOnAction(event -> {
            try {
                arrayField.setText(CreateRandomArray.create(countOfNumbers.getText(), valuesInOrder.isSelected()));
            } catch (IOException e) {
                Main.flagResult = false;
            }

        });

        //set values for ComboBox
        searches.setItems(FXCollections.observableArrayList("Linear Search", "Binary Search"));
        sorts.setItems(FXCollections.observableArrayList("Bubble Sort", "Insertion Sort",
                "Merge Sort", "Quick Sort"));


        //start button
        startButton.setOnAction(event -> {
            //finds out which sorting or search to use
            String type = "";
            if (searches.getValue() != null)
                type = searches.getValue();
            else if (sorts.getValue() != null)
                type = sorts.getValue();

            //findNumber if user chose the search
            String number = "void";
            if (findNumber.getText() != null)
                number = findNumber.getText();

            //Checking for the correctness of the specified data
            Main firstWindow = new Main(arrayField.getText(), split.getText(), photo.isSelected()
                    , type, number);

            //start the program
            try {
                firstWindow.begin();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
