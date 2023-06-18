package com.mcl.typesofsorts.logic.features;

import com.mcl.typesofsorts.Application;
import com.mcl.typesofsorts.logic.Main;

import java.io.IOException;

public class Errors {

    public static void checkErrors(String searchOrSort, String inputArray, String findNumber) throws IOException {
        if (searchOrSort.equals("")) {
            Application.error("specify sorting type or search type");
            Main.flagResult = false;
        }
        else if (inputArray.equals("")) {
            Application.error("Empty input array");
            Main.flagResult = false;
        }
        else if (searchOrSort.equals("Linear Search") || searchOrSort.equals("Binary Search (only sorted)")){
            try {
                Integer.parseInt(findNumber);
            } catch (Exception e) {
                Application.error("Invalid number to look for");
                Main.flagResult = false;
            }
        }
    }
}
