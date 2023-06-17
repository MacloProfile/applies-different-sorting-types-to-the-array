package com.mcl.typesofsorts.Visualization;

import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;

public class ViewSearch{
    protected static final int arraySize = 10;
    protected static int target;
    protected int[] array = generateRandomArray();
    protected int speedChart = 555;
    protected Rectangle[] rectangles;

    public void start() {
        Stage stage = new Stage();
        Group group = new Group();
        rectangles = new Rectangle[arraySize];

        createRectangles(group, array);

        Scene scene = new Scene(group, arraySize * 40, 220);
        stage.setTitle("Search Visualization");
        stage.setScene(scene);
        stage.show();
    }

    private void createRectangles(Group group, int[] array) {
        for (int i = 0; i < arraySize; i++) {
            rectangles[i] = new Rectangle(30, array[i] * 3);
            rectangles[i].setX(i * 40);
            rectangles[i].setY(200 - rectangles[i].getHeight());
            rectangles[i].setFill(Color.WHEAT);
            group.getChildren().add(rectangles[i]);
        }
    }
    //random array and searching number
    protected int[] generateRandomArray() {
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = (int) (Math.random() * 50);
        }
        target = array[(int) (Math.random() * 10)];
        return array;
    }
}
