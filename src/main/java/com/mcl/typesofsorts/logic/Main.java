package com.mcl.typesofsorts.logic;

import com.mcl.typesofsorts.HelloApplication;
import com.mcl.typesofsorts.logic.search.Binary;
import com.mcl.typesofsorts.logic.search.Linear;
import com.mcl.typesofsorts.logic.sorts.Bubble;
import com.mcl.typesofsorts.logic.sorts.Insertion;
import com.mcl.typesofsorts.logic.sorts.Merge;
import com.mcl.typesofsorts.logic.sorts.Quick;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    private String inputArrayString;
    private static String[] inputArray;

    private String splitChar;
    private Boolean showGraph;
    private String searchOrSort;
    private boolean flagResult;
    //if user chose the search
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
            if (showGraph)
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
            case "Merge Sort":
                Merge.mergeSort(array);
                return "";
            case ("Quick Sort"):
                Quick.quickSort(array);
                return "";
            default:
                return "ERROR";
        }
    }
    //create a chart
    private void graph() throws IOException {
        switch (searchOrSort) {
            case ("Linear Search"):
                Linear linear = new Linear();
                linear.start();
                break;
            case ("Binary Search"):
                break;
            case ("Bubble Sort"):
                Bubble bubble = new Bubble();
                bubble.start();
                break;
            case ("Insertion Sort"):
                Insertion insertion = new Insertion();
                insertion.start();
                break;
            case "Merge Sort":
                Merge merge = new Merge();
                merge.start();
                break;
            case ("Quick Sort"):
                Quick quick = new Quick();
                quick.start();
                break;
            default:
                break;
        }
    }
}
