package com.sda.exercises;

public class Fibonacci {

    public static Long[] arrayCreate(int n) {
        Long[] array = new Long[n];
        int length = array.length;

        if (length > 0) {
            array[0] = 0L;
        }
        if (length > 1) {
            array[1] = 1L;
        }

        for (int i = 2; i < length; i++) {
            array[i] = array[i - 2] + array[i - 1];
        }
        return array;
    }

}
