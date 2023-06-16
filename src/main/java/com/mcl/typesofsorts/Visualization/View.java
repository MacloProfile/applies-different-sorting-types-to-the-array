package com.mcl.typesofsorts.Visualization;

import com.mcl.typesofsorts.logic.Main;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;

public class View {
    protected int arraySize = 20;

    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
    }

    protected int[] array = new int[arraySize];
    protected Rectangle[] rectangles = new Rectangle[arraySize];

    protected void start() {
        Stage stage = new Stage();
        randomArray(array, arraySize);
        createRectangles();

        HBox hBox = new HBox(3);
        hBox.getChildren().addAll(rectangles);

        Scene scene = new Scene(hBox);
        stage.setTitle("Sort Visualization");
        stage.setScene(scene);
        stage.show();
    }

    protected void randomArray(int[] array, int arraySize) {
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(201);
        }
    }

    protected void repositioningRectangle(int point1, int point2, Rectangle[] rectangles) {
        double revise = rectangles[point1].getHeight();
        rectangles[point1].setHeight(rectangles[point2].getHeight());
        rectangles[point2].setHeight(revise);
    }

    protected void repositioningElements(int point1, int point2, int[] array) {
        int temp = array[point1];
        array[point1] = array[point2];
        array[point2] = temp;
    }

    protected void createRectangles() {
        for (int i = 0; i < arraySize; i++) {
            rectangles[i] = new Rectangle(15, array[i], Color.PURPLE);
        }
    }
}

