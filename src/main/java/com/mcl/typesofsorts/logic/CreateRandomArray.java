package com.mcl.typesofsorts.logic;

import com.mcl.typesofsorts.HelloApplication;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class CreateRandomArray {
    private static int[] ints;
    private static String string;
    private StringJoiner joiner = new StringJoiner(" ");

    //created array
    public static String create(String values, boolean order) throws IOException {
        int count = 0;
        try {
            count = Integer.parseInt(values);
        } catch (Exception e) {
            HelloApplication.error("Invalid random array values");
            Main.flagResult = false;
        }
        ints = new int[count];
        if (order)
            return orderArray();
        return randomArray();
    }

    //array by order
    private static String orderArray() {
        Arrays.setAll(ints, i -> i);
        return Arrays.stream(ints)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
    }
    //random array
    private static String randomArray() {
        ThreadLocalRandom random = ThreadLocalRandom.current();

        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(0, 100000 + 1);
        }

        return Arrays.stream(ints)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
    }
}
