package com.mcl.typesofsorts.logic.search;

import com.mcl.typesofsorts.Visualization.ViewSearch;
import com.mcl.typesofsorts.logic.sorts.Quick;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.util.Duration;

import java.util.Arrays;

public class Binary extends ViewSearch {

    //search the input number
    public static String binarySearch(int[] array, int target) {
        //Binary search needs a sorted array. Sort the array in one of the fastest ways
        Quick.quickSort(array);

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (array[middle] == target) {
                return String.valueOf(middle);
            } else if (array[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return "element not found";
    }

}
