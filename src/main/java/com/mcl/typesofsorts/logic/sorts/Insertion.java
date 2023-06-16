package com.mcl.typesofsorts.logic.sorts;

import com.mcl.typesofsorts.Visualization.View;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

import java.util.Arrays;

public class Insertion extends View {

    //sort the input array
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

    //visualization
    @Override
    public void start() {
        super.start();
        insertionSortView();
    }
    
    private void insertionSortView() {
        Timeline timeline = new Timeline();
        for (int i = 1; i < arraySize; i++) {
            //Only a final copy of a variable can be used inside a lambda expression
            final int id = i;
            KeyFrame frame = new KeyFrame(Duration.millis(400 * i), event -> {
                int index = array[id];
                int j = id - 1;

                while (j >= 0 && array[j] > index) {
                    array[j + 1] = array[j];
                    repositioningRectangle(j, j + 1, rectangles);
                    j--;
                }
                array[j + 1] = index;
            });
            timeline.getKeyFrames().add(frame);
        }
        timeline.play();
    }

}
