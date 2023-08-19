package com.kodilla.stream.fibonacci;

public class Fibonacci {


    public static int getFibonacciValue(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return getFibonacciValue(n - 2) + getFibonacciValue(n - 1);
        }
    }

}
