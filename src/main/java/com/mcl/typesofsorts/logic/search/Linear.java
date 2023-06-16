package com.mcl.typesofsorts.logic.search;

import com.mcl.typesofsorts.Visualization.ViewSearch;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class Linear extends ViewSearch{
    //search the input number
    public static String linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return String.valueOf(i);
            }
        }
        //element not found
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
        for (int i = 0; i < arraySize; i++) {
            final int index = i;
            KeyFrame keyFrame = new KeyFrame(Duration.millis(speedChart * i), event -> {
                if (array[index] == target) {
                    rectangles[index].setFill(Color.GREEN);
                    //completes the work when finding the number
                    timeline.stop();
                } else {
                    rectangles[index].setFill(Color.RED);
                }
            });
            timeline.getKeyFrames().add(keyFrame);
        }
        return timeline;
    }
}
