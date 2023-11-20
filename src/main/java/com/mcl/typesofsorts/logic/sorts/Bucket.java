package com.mcl.typesofsorts.logic.sorts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Bucket {

    public static int[] bucketSort(int[] array) {
        int minVal = Arrays.stream(array).min().orElseThrow();
        int maxVal = Arrays.stream(array).max().orElseThrow();

        double bucketRange = (double) (maxVal - minVal) / array.length;

        ArrayList<Integer>[] buckets = new ArrayList[array.length];
        for (int i = 0; i < array.length; i++)
            buckets[i] = new ArrayList<>();

        for (int num : array) {
            int index = (int) ((num - minVal) / bucketRange);
            index = Math.min(index, buckets.length - 1);
            buckets[index].add(num);
        }

        for (ArrayList<Integer> bucket : buckets)
            Collections.sort(bucket);

        int index = 0;
        for (ArrayList<Integer> bucket : buckets) {
            for (int num : bucket)
                array[index++] = num;
        }
    return array;
    }
}
