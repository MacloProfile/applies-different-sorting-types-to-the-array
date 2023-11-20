package com.mcl.typesofsorts.logic;

import com.mcl.typesofsorts.Application;
import com.mcl.typesofsorts.logic.features.Errors;

import java.io.IOException;
import java.util.Arrays;

import static com.mcl.typesofsorts.logic.features.Graph.graph;

public class Main {
    private String inputArrayString;
    private static String[] inputArray;

    private Boolean showGraph;
    private String searchOrSort;
    public static boolean flagResult;
    //if user chose the search
    private String findNumber;

    //constructor
    public Main(String inputArray, Boolean showGraph1, String searchOrSort, String findNumber) {
        this.inputArrayString = inputArray;
        showGraph = showGraph1;
        this.searchOrSort = searchOrSort;
        this.findNumber = findNumber;
        flagResult = true;
    }

    //start the program
    public void begin() throws IOException {
        //error check
        Errors.checkErrors(searchOrSort, inputArrayString, findNumber);

        if (flagResult){
            //set fields in result window
            String findResult = add();
            if (flagResult) {
                SetResultFields resultFields = new SetResultFields(inputArrayString, findResult, searchOrSort);

                Application.openResultWindow();
                //graph view
                if (showGraph)
                    graph(searchOrSort);
            }
        }
    }

    //gets a ready-made list from the desired method
    private String add() throws IOException {
        int[] array = ifSort();
        //correct display of the sorted list in the final window
        if (searchOrSort.equals("Binary Search (only sorted)")) {
            inputArrayString = Arrays.toString(Arrays.stream(array).sorted().toArray());
            inputArrayString = inputArrayString.substring(1, inputArrayString.length() - 1);
        }
        MethodDefinition methodDefinition = new MethodDefinition();
        //define algorithm
        return methodDefinition.define(findNumber, searchOrSort, array);
    }

    //from an array of strings to an array of numbers
    private int[] ifSort() {
        inputArray = inputArrayString.split(" ");
        return Arrays.stream(inputArray)
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
