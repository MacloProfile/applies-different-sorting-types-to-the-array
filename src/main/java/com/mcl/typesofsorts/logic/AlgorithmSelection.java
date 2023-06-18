package com.mcl.typesofsorts.logic;

import javafx.scene.control.ComboBox;

public class AlgorithmSelection {

    public static String setAlgorithm(ComboBox<String> searches, ComboBox<String> sorts) {
        if (searches.getValue() != null && !(searches.getValue().equals("Types of searches")))
            return searches.getValue();
        else if (sorts.getValue() != null && !(sorts.getValue().equals("Types of searches")))
            return sorts.getValue();
        return "";
    }
}
