package com.mcl.typesofsorts.logic.search;

import java.util.Arrays;

public class Binary {
    public static String binarySearch(int[] array, int target) {
        int lift = Arrays.binarySearch(array, target);
        if (lift == -1)
            //element not found
            return "element not found";
        return String.valueOf(lift);
    }
}
