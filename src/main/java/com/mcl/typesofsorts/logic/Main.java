package com.mcl.typesofsorts.logic;

import com.mcl.typesofsorts.HelloApplication;
import com.mcl.typesofsorts.logic.search.Binary;
import com.mcl.typesofsorts.logic.search.Linear;

import java.io.IOException;

public class Main {
    private String inputArray;
    private String splitChar;
    private Boolean showGraph;
    private String searchOrSort;
    private boolean flagResult;
    private String findNumber;

    public Main(String inputArray, String splitChar, Boolean showGraph, String searchOrSort, String findNumber) {
        this.inputArray = inputArray;
        this.showGraph = showGraph;
        this.searchOrSort = searchOrSort;
        this.findNumber = findNumber;

        //set the split, default space
        if (splitChar.equals(""))
            this.splitChar = " ";
        else this.splitChar = splitChar;
    }

    //start the program
    public void begin() throws IOException {
        //error check
        this.flagResult = Errors.checkErrors(searchOrSort, inputArray);

        //set fields in result window
        String findResult = add();
        SetResultFields resultFields = new SetResultFields(inputArray, findResult);

        if (flagResult){
            HelloApplication.openResultWindow();
        }
    }


    //gets a ready-made list from the desired method
    private String add() throws IOException {
        String[] array = inputArray.split(" ");
        switch (searchOrSort) {
            case ("Linear Search"):
                return Linear.linearSearch(array, findNumber);
            case ("Binary Search"):
                return Binary.binarySearch(array, findNumber);
            case ("Bubble Sort"):
                return "";
            case ("Insertion Sort"):
                return "";
            case ("Selection Sort"):
                return "";
            case "Merge Sort":
                return "";
            case ("Quick Sort"):
                return "";
            default:
                return "ERROR";
        }
    }
}
