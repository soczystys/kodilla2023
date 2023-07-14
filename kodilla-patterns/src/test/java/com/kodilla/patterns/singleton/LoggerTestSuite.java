package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    void testGetLastLog() {
        String stringToLog = "test log";
        Logger logger = Logger.INSTANCE;
        logger.log(stringToLog);

        String result = logger.getLastLog();

        assertEquals(stringToLog, result);

    }
}
