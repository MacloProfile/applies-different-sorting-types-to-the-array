package com.mcl.typesofsorts.logic;

import com.mcl.typesofsorts.logic.features.Timer;

//a class for interacting with the fields of the target window
public class SetResultFields {
    private static String method;
    private static String course;
    private static String result;
    private static String runtime;

    public SetResultFields(String first, String second, String third) {
        course = first;
        result = second;
        method = third;
        runtime = Timer.getTime();
    }

    public static String getCourse() {
        return course;
    }

    public static String getResult() {
        return result;
    }

    public static String getRuntime() {
        return runtime;
    }

    public static String getMethod() {
        return method;
    }

}
