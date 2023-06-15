package com.mcl.typesofsorts.logic;

import com.mcl.typesofsorts.HelloApplication;

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
        

        if (flagResult){
            HelloApplication.openSecondWindow();
        }
    }
}
