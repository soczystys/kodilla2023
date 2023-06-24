package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    void testProbablyIWillThrowException() {
        SecondChallenge secondChallenge = new SecondChallenge();

        assertAll(
//                if (x >= 2 || x < 1 || y == 1.5) { throw new Exception(); }
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 5)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 2)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(3, 1.5))
        );
    }

}
