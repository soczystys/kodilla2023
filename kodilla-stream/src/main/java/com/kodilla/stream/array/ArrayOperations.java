package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .forEachOrdered(n -> System.out.println(numbers[n]));

        OptionalDouble average = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average();

        if (average.isPresent()) {
            return average.getAsDouble();
        } else {
            return 0;
        }
    }
}
