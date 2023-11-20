package com.mcl.typesofsorts.logic.sorts;

import com.mcl.typesofsorts.logic.sorts.general.Swap;

public class Selection {

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minElement = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minElement])
                    minElement = j;
            }
            Swap.swapper(array, i, minElement);
        }

        return array;
    }
}
