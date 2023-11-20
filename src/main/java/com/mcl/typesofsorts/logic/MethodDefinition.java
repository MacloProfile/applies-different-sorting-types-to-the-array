package com.mcl.typesofsorts.logic;

import com.mcl.typesofsorts.Application;
import com.mcl.typesofsorts.logic.features.Timer;
import com.mcl.typesofsorts.logic.search.Binary;
import com.mcl.typesofsorts.logic.search.Linear;
import com.mcl.typesofsorts.logic.sorts.Bubble;
import com.mcl.typesofsorts.logic.sorts.Insertion;
import com.mcl.typesofsorts.logic.sorts.Merge;
import com.mcl.typesofsorts.logic.sorts.Quick;

import java.io.IOException;
import java.util.Arrays;

public class MethodDefinition {

    protected String define(String findNumber, String searchOrSort, int[] array) throws IOException {
        int target;
        String result;
        switch (searchOrSort) {
            case ("Linear Search"):
                target = Integer.parseInt(findNumber);
                Timer.timeStart();
                result = Linear.linearSearch(array, target);
                Timer.timeEnd();
                break;
            case ("Binary Search (only sorted)"):
                target = Integer.parseInt(findNumber);
                result = Binary.binarySearch(array, target);
                break;
            case ("Bubble Sort"):
                Timer.timeStart();
                result = Arrays.toString(Bubble.bubbleSort(array));
                Timer.timeEnd();
                result = result.substring(1, result.length() - 1);
                break;
            case ("Insertion Sort"):
                Timer.timeStart();
                result = Arrays.toString(Insertion.insertionSort(array));
                Timer.timeEnd();
                result = result.substring(1, result.length() - 1);
                break;
            case "Merge Sort":
                Timer.timeStart();
                result = Arrays.toString(Merge.mergeSort(array));
                Timer.timeEnd();
                result = result.substring(1, result.length() - 1);
                break;
            case ("Quick Sort"):
                Timer.timeStart();
                result = Arrays.toString(Quick.quickSort(array));
                Timer.timeEnd();
                result = result.substring(1, result.length() - 1);
                break;
            default:
                result = "ERROR";
                Main.flagResult = false;
                Application.error("incorrect method");
        }
        return result;
    }
}
