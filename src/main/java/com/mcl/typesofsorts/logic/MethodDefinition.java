package com.mcl.typesofsorts.logic;

import com.mcl.typesofsorts.Application;
import com.mcl.typesofsorts.logic.features.Timer;
import com.mcl.typesofsorts.logic.search.Binary;
import com.mcl.typesofsorts.logic.search.Linear;
import com.mcl.typesofsorts.logic.sorts.*;

import java.io.IOException;
import java.util.Arrays;

public class MethodDefinition {

    protected String define(String findNumber, String searchOrSort, int[] array) throws IOException {
        int target;
        String result;
        Timer.timeStart();
        switch (searchOrSort) {
            case ("Linear Search"):
                target = Integer.parseInt(findNumber);
                result = Linear.linearSearch(array, target);
                break;
            case ("Binary Search (only sorted)"):
                target = Integer.parseInt(findNumber);
                result = Binary.binarySearch(array, target);
                break;
            case ("Bubble Sort"):
                result = Arrays.toString(Bubble.bubbleSort(array));
                result = result.substring(1, result.length() - 1);
                break;
            case ("Insertion Sort"):
                result = Arrays.toString(Insertion.insertionSort(array));
                result = result.substring(1, result.length() - 1);
                break;
            case "Merge Sort":
                result = Arrays.toString(Merge.mergeSort(array));
                result = result.substring(1, result.length() - 1);
                break;
            case ("Quick Sort"):
                result = Arrays.toString(Quick.quickSort(array));
                result = result.substring(1, result.length() - 1);
                break;
            case ("Selection Sort"):
                result = Arrays.toString(Selection.selectionSort(array));
                result = result.substring(1, result.length() - 1);
                break;
            case ("Bucket Sort"):
                result = Arrays.toString(Bucket.bucketSort(array));
                result = result.substring(1, result.length() - 1);
                break;
            default:
                result = "ERROR";
                Main.flagResult = false;
                Application.error("incorrect method");
        }
        Timer.timeEnd();
        return result;
    }
}
