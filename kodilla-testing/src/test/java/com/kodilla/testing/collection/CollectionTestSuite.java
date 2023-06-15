package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @DisplayName("when created OddNumbersExterminator, " +
            "then exterminate should return empty list"
    )
    @Test
    void testOddNumbersExterminatorEmptyList() {

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> list = new ArrayList<>();

        //When
        List<Integer> result = oddNumbersExterminator.exterminate(list);

        //Then
        Assertions.assertEquals(new ArrayList<Integer>(), result);


    }

    @DisplayName("when created OddNumbersExterminator, " +
            "then exterminate should return list without odd numbers"
    )
    @Test
    void testOddNumbersExterminatorNormalList() {

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> list = Arrays.asList(3, 4, 5, 6, 7, 8, 9);

        //When
        List<Integer> result = oddNumbersExterminator.exterminate(list);

        //Then
        Assertions.assertEquals(Arrays.asList(4, 6, 8), result);

    }

    @BeforeEach
    void beforeTestCase(TestInfo testInfo) {
        System.out.println("BeforeEach method: " + testInfo.getTestMethod());
    }

    @AfterEach
    void afterTestCase(TestInfo testInfo) {
        System.out.println("AfterEach method: " + testInfo.getDisplayName());
    }

}
