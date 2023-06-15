package com.mcl.typesofsorts.logic;

import com.mcl.typesofsorts.HelloApplication;
import com.mcl.typesofsorts.logic.search.Linear;

import java.io.IOException;

public class Main {
    private String inputArray;
    private String splitChar;
    private Boolean showGraph;
    private String searchOrSort;
    private boolean flagResult;

    public Main(String inputArray, String splitChar, Boolean showGraph, String searchOrSort) {
        this.inputArray = inputArray;
        this.showGraph = showGraph;
        this.searchOrSort = searchOrSort;
        //set the split, default space
        if (splitChar.equals(""))
            this.splitChar = " ";
        else this.splitChar = splitChar;
    }

    public void begin() throws IOException {
        this.flagResult = Errors.checkErrors(searchOrSort, inputArray);
        add();
        if (flagResult){
            HelloApplication.openSecondWindow();
        }
    }

    private String add() {
        String[] array = inputArray.split(" ");
        return switch (searchOrSort) {
            case ("Linear Search") -> Linear.linearSearch(array, "s");
            case ("Binary Search") -> "";
            case ("Bubble Sort") -> "";
            case ("Insertion Sort") -> "";
            case ("Selection Sort") -> "";
            case "Merge Sort" -> "";
            case ("Quick Sort") -> "";
            default -> "ERROR";
        };
    }
}
