package com.mcl.typesofsorts.logic.features;

import com.mcl.typesofsorts.logic.search.Binary;
import com.mcl.typesofsorts.logic.search.Linear;
import com.mcl.typesofsorts.logic.sorts.Bubble;
import com.mcl.typesofsorts.logic.sorts.Insertion;
import com.mcl.typesofsorts.logic.sorts.Merge;
import com.mcl.typesofsorts.logic.sorts.Quick;

import java.io.IOException;

public class Graph {

    //visualization a chart
    public static void graph(String searchOrSort) throws IOException {
        switch (searchOrSort) {
            case ("Linear Search"):
                Linear linear = new Linear();
                linear.start();
                break;
            case ("Binary Search (only sorted)"):
                Binary binary = new Binary();
                binary.start();
                break;
            case ("Bubble Sort"):
                Bubble bubble = new Bubble();
                bubble.start();
                break;
            case ("Insertion Sort"):
                Insertion insertion = new Insertion();
                insertion.start();
                break;
            case "Merge Sort":
                Merge merge = new Merge();
                merge.start();
                break;
            case ("Quick Sort"):
                Quick quick = new Quick();
                quick.start();
                break;
            default:
                break;
        }
    }
}
