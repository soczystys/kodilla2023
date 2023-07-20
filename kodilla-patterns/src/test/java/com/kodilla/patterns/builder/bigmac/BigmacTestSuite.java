package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {

    @Test
    void test() {
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .burgers(1)
                .bun("bun")
                .sauce("sauce")
                .ingredient("ingredient1")
                .ingredient("ingredient2")
                .build();

        System.out.println(bigmac);

        assertEquals(2, bigmac.getIngredients().size());
        assertEquals(1, bigmac.getBurgers());
        assertEquals("bun", bigmac.getBun());
        assertEquals("sauce", bigmac.getSauce());
    }
}
