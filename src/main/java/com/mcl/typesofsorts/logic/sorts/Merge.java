package com.mcl.typesofsorts.logic.sorts;

import com.mcl.typesofsorts.Visualization.View;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import java.util.Arrays;

public class Merge extends View {
    private Timeline timeline = new Timeline();

    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return;
        }

        int middle = array.length / 2;
        int[] leftSide = new int[middle];
        int[] rightSide = new int[array.length - middle];

        System.arraycopy(array, 0, leftSide, 0, middle);
        System.arraycopy(array, middle, rightSide, 0, array.length - middle);

        mergeSort(leftSide);
        mergeSort(rightSide);
        part(leftSide, rightSide, array);
    }

    private static void part(int[] left, int[] right, int[] array) {
        int a = 0;
        int b = 0;
        int c = 0;

        while (a < left.length && b < right.length) {
            if (left[a] <= right[b]) {
                array[c++] = left[a++];
            } else {
                array[c++] = right[b++];
            }
        }

        while (a < left.length) {
            array[c++] = left[a++];
        }

        while (b < right.length) {
            array[c++] = right[b++];
        }
    }

    //visualization
    @Override
    public void start() {
        super.start();
        mergeSortView(array, 0, arraySize - 1);
    }

    private void mergeSortView(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSortView(array, left, mid);
            mergeSortView(array, mid + 1, right);

            merge(array, left, mid, right);
        }
    }

    private void merge(int[] array, int left, int mid, int right) {
        int[] temp = Arrays.copyOfRange(array, left, right + 1);
        int a = 0, b = mid - left + 1, c = left;

        while (a <= mid - left && b <= right - left) {
            if (temp[a] <= temp[b]) {
                array[c++] = temp[a++];
            } else {
                array[c++] = temp[b++];
            }
        }

        while (a <= mid - left) {
            array[c++] = temp[a++];
        }

        while (b <= right - left) {
            array[c++] = temp[b++];
        }

        swap(array);
    }

    private void swap(int[] array) {
        timeline = new Timeline();
        for (int i = 0; i < array.length; i++) {
            final int index = i;
            KeyFrame keyFrame = new KeyFrame(Duration.millis(speedChart * i), event -> {
                rectangles[index].setHeight(array[index]);
            });
            timeline.getKeyFrames().add(keyFrame);
        }
        timeline.play();
    }
}