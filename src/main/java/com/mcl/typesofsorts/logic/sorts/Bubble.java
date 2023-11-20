package com.mcl.typesofsorts.logic.sorts;

import com.mcl.typesofsorts.Visualization.View;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import java.util.Arrays;

public class Bubble extends View {

    //bubble sort
    public static String bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return Arrays.toString(array);
    }

    //visualization
    @Override
    public void start() {
        super.start();
        bubbleSortView();
    }

    public void bubbleSortView() {
        Timeline timeline = new Timeline();
        for (int i = 0; i < arraySize - 1; i++) {
            for (int j = 0; j < arraySize - i - 1; j++) {
                //Only a final copy of a variable can be used inside a lambda expression
                final int id = j;
                KeyFrame frame = new KeyFrame(Duration.millis(speedChart * (j + i)), event -> {
                    if (array[id] > array[id + 1]) {
                        repositioningElements(id, id + 1, array);
                        repositioningRectangle(id, id + 1, rectangles);
                    }
                });
                timeline.getKeyFrames().add(frame);
            }
        }
        timeline.play();
    }
}
