package com.mcl.typesofsorts.logic.search;

public class Binary {
    public static String binarySearch(String[] array, String target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (Integer.parseInt(array[mid]) == Integer.parseInt(target)) {
                return String.valueOf(mid);
            } else if (Integer.parseInt(array[mid]) < Integer.parseInt(target)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return "element not found";
    }
}
