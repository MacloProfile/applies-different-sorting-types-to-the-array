package com.mcl.typesofsorts.logic.search;

import java.util.Objects;

public class Linear {
    public static String linearSearch(String[] array, String target) {
        for (int i = 0; i < array.length; i++) {
            if (Objects.equals(array[i], target)) {
                return String.valueOf(i);
            }
        }
        //element not found
        return "element not found";
    }
}
