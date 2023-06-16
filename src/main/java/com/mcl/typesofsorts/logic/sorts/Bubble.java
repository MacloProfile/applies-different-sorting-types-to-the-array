package com.mcl.typesofsorts.logic.sorts;

import com.mcl.typesofsorts.Visualization.View;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import java.util.Arrays;

public class Bubble extends View {

    //sort the input array
    public static String bubbleSort(int[] array) {
        int length = array.length;
        boolean swapped;
        for (int i = 0; i < length - 1; i++) {
            swapped = false;
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
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
                int id = j;

                KeyFrame keyFrame = new KeyFrame(Duration.millis(400 * (j + i)), event -> {
                    if (array[id] > array[id + 1]) {
                        repositioningElements(id, id + 1, array);
                        repositioningRectangle(id, id + 1, rectangles);
                    }
                });

                timeline.getKeyFrames().add(keyFrame);
            }
        }

        timeline.play();
    }
}
