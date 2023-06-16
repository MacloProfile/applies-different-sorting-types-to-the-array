package com.mcl.typesofsorts.logic.sorts;

import com.mcl.typesofsorts.logic.Main;

import java.util.Arrays;

public class Insertion {
    public static String insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return Arrays.toString(array);
    }
}
