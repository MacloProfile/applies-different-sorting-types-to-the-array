package com.mcl.typesofsorts.logic.search;

import com.mcl.typesofsorts.Visualization.ViewSearch;
import com.mcl.typesofsorts.logic.sorts.Quick;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.util.Arrays;

public class Binary extends ViewSearch {

    //search the input number
    public static String binarySearch(int[] array, int target) {
        //Binary search needs a sorted array. Sort the array in one of the fastest ways
        Quick.quickSort(array);

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (array[middle] == target) {
                return String.valueOf(middle);
            } else if (array[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return "element not found";
    }

    //visualization
    @Override
    public void start() {
        Timeline timeline = LinearSearchAnimation(array);
        timeline.setCycleCount(1);
        timeline.play();
        super.start();
    }

    private Timeline LinearSearchAnimation(int[] array) {
        Timeline timeline = new Timeline();
        for (int i = 0; i < 4; i++) {
            int finalI = i;
            KeyFrame keyFrame = new KeyFrame(Duration.millis(speedChart * i + 300), event -> {
                if (finalI == 0) {
                    for (int j = 0; j < 5; j++) {
                        rectangles[j].setFill(Color.RED);
                    }
                } else if (finalI == 1) {
                    for (int j = 5; j < 8; j++) {
                        rectangles[j].setFill(Color.RED);
                    }
                } else if (finalI == 2) {
                    rectangles[9].setFill(Color.RED);
                } else {
                    rectangles[8].setFill(Color.GREEN);
                }
            });
            timeline.getKeyFrames().add(keyFrame);
        }
        return timeline;
    }
}