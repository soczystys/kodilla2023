package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //When
        double avg = ArrayOperations.getAverage(array);

        //Then
        Assertions.assertEquals(5, avg);
    }
}
