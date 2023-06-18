package com.mcl.typesofsorts.logic;

public class Timer {
    private static long start;
    private static long end;

    public static String getTime() {
        return String.format("%.3f", ((end - start) * 0.000001));
    }

    public static void timeStart() {
        start = System.nanoTime();
    }

    public static void timeEnd() {
        end = System.nanoTime();
    }
}
