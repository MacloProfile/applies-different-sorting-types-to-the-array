package com.mcl.typesofsorts.logic;

import com.mcl.typesofsorts.HelloApplication;
import com.mcl.typesofsorts.logic.search.Binary;
import com.mcl.typesofsorts.logic.search.Linear;
import com.mcl.typesofsorts.logic.sorts.Bubble;
import com.mcl.typesofsorts.logic.sorts.Insertion;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    private String inputArrayString;
    private static String[] inputArray;

    private String splitChar;
    private Boolean showGraph;
    private String searchOrSort;
    private boolean flagResult;
    private String findNumber;

    //constructor
    public Main(String inputArray, String splitChar, Boolean showGraph, String searchOrSort, String findNumber) {
        this.inputArrayString = inputArray;
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
        this.flagResult = Errors.checkErrors(searchOrSort, inputArrayString);

        //set fields in result window
        String findResult = add();
        SetResultFields resultFields = new SetResultFields(inputArrayString, findResult);


        if (flagResult){
            HelloApplication.openResultWindow();

            //graph view
            graph();
        }
    }


    //gets a ready-made list from the desired method
    private String add() throws IOException {
        //search number
        int target;
        //from an array of strings to an array of numbers
        inputArray = inputArrayString.split(" ");
        int[] array = Arrays.stream(inputArray)
                .mapToInt(Integer::parseInt)
                .toArray();

        switch (searchOrSort) {
            case ("Linear Search"):
                target = Integer.parseInt(findNumber);
                return Linear.linearSearch(array, target);
            case ("Binary Search"):
                target = Integer.parseInt(findNumber);
                return Binary.binarySearch(array, target);
            case ("Bubble Sort"):
                return Bubble.bubbleSort(array);
            case ("Insertion Sort"):
                return Insertion.insertionSort(array);
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
    //create a chart
    private void graph() throws IOException {
        switch (searchOrSort) {
            case ("Linear Search"):
                break;
            case ("Binary Search"):
                break;
            case ("Bubble Sort"):
                Bubble bubble = new Bubble();
                bubble.start();
                break;
            case ("Insertion Sort"):
                break;
            case ("Selection Sort"):
                break;
            case "Merge Sort":
                break;
            case ("Quick Sort"):
                break;
            default:
                break;
        }
    }
}
