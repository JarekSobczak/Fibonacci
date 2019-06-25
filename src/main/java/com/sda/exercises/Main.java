package com.sda.exercises;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Arrays.stream(Fibonacci.arrayCreate(23))
                .forEach(li-> System.out.print(li+" "));


    }
}
