package com.mcl.typesofsorts.logic.search;

import java.util.Arrays;
import java.util.Objects;

public class Linear {
    public static String linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return String.valueOf(i);
            }
        }
        //element not found
        return "element not found";
    }
}
