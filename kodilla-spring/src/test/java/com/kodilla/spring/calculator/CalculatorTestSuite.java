package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    @Test
    void testCalculations() {
        double addResult = calculator.add(2.3, 4.4);
        double subResult = calculator.sub(2.3, 4.4);
        double mulResult = calculator.mul(2, 4);
        double divResult = calculator.div(2, 4);

        Assertions.assertEquals(6.7, addResult, 0.01);
        Assertions.assertEquals(-2.1, subResult, 0.01);
        Assertions.assertEquals(8, mulResult, 0.01);
        Assertions.assertEquals(0.5, divResult, 0.01);
    }
}
