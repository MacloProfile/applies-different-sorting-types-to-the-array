package com.mcl.typesofsorts;

import javafx.scene.control.Button;

import java.io.IOException;

public class FirstWindow {
    private String inputArray;
    private String splitChar;
    private Boolean showGraph;
    private String searchOrSort;

    public FirstWindow(String inputArray, String splitChar, Boolean showGraph, String searchOrSort) {
        this.inputArray = inputArray;
        this.splitChar = splitChar;
        this.showGraph = showGraph;
        this.searchOrSort = searchOrSort;
    }

    public void begin(Button startButton) {

    }
}
