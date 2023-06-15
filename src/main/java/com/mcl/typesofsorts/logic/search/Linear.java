package com.mcl.typesofsorts.logic.search;

import java.util.Arrays;
import java.util.Objects;

public class Linear {
    public static String linearSearch(String[] array, String target) {
        int target1 = Integer.parseInt(target);
        int[] array1 = Arrays.stream(array)
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == target1) {
                return String.valueOf(i);
            }
        }
        //element not found
        return "element not found";
    }
}
