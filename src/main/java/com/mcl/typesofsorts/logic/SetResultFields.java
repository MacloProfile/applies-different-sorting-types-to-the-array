package com.mcl.typesofsorts.logic;

//a class for interacting with the fields of the target window
public class SetResultFields {
    private static String course;
    private static String result;

    public SetResultFields(String first, String second) {
        course = first;
        result = second;
    }

    public static String getCourse() {
        return course;
    }

    public static String getResult() {
        return result;
    }
}
