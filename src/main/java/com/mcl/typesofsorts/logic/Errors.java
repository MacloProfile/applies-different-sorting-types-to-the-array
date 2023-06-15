package com.mcl.typesofsorts.logic;

import com.mcl.typesofsorts.HelloApplication;
import java.io.IOException;

public class Errors {

    protected static boolean checkErrors(String searchOrSort, String inputArray) throws IOException {
        if (searchOrSort.equals(""))
            HelloApplication.error("specify sorting type or search type");
        else if (inputArray.equals(""))
            HelloApplication.error("Empty input array");
        else {
            try {
                String[] array = inputArray.split(" ");
            } catch (Exception e) {
                HelloApplication.error("The list is incorrect. Make sure there are only numbers and they are separated" +
                        " by a space");
            }
            return true;
        }
        return false;
    }
}
