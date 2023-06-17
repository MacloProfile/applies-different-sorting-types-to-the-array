package com.mcl.typesofsorts.logic;

import com.mcl.typesofsorts.HelloApplication;
import java.io.IOException;
import java.util.Arrays;

public class Errors {

    protected static boolean checkErrors(String searchOrSort, String inputArray, String findNumber) throws IOException {
        if (searchOrSort.equals(""))
            HelloApplication.error("specify sorting type or search type");
        else if (inputArray.equals(""))
            HelloApplication.error("Empty input array");
        else if (searchOrSort.equals("Linear Search") || searchOrSort.equals("Binary Search")){
            try {
                Integer.parseInt(findNumber);
            } catch (Exception e) {
                HelloApplication.error("Invalid number to look for");
                return false;
            }
            return true;
        } else {
            return true;
        }
        return false;
    }
}
