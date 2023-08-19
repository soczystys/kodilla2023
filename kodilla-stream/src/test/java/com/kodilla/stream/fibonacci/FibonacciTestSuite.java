package com.kodilla.stream.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTestSuite {

    @Test
    void testFibonacci() {
        int result0 = Fibonacci.getFibonacciValue(0);
        int result1 = Fibonacci.getFibonacciValue(1);
        int result2 = Fibonacci.getFibonacciValue(2);
        int result3 = Fibonacci.getFibonacciValue(3);
        int result4 = Fibonacci.getFibonacciValue(4);
        int result9 = Fibonacci.getFibonacciValue(9);
        int result10 = Fibonacci.getFibonacciValue(10);
        int result11 = Fibonacci.getFibonacciValue(11);

        assertEquals(0, result0);
        assertEquals(1, result1);
        assertEquals(1, result2);
        assertEquals(2, result3);
        assertEquals(3, result4);

        assertEquals(34, result9);
        assertEquals(55, result10);
        assertEquals(89, result11);
    }
}
