package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        World earth = new World();

        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");

        europe.addCountry(new Country("Germany", new BigDecimal("84270625")));
        europe.addCountry(new Country("France", new BigDecimal("68042591")));
        europe.addCountry(new Country("Spain", new BigDecimal("48196693")));
        europe.addCountry(new Country("Italy", new BigDecimal("58803163")));

        asia.addCountry(new Country("China", new BigDecimal("1411750000")));
        asia.addCountry(new Country("India", new BigDecimal("1392329000")));
        asia.addCountry(new Country("Japan", new BigDecimal("124500000")));
        asia.addCountry(new Country("Pakistan", new BigDecimal("220425254")));

        earth.addContinent(europe);
        earth.addContinent(asia);

        BigDecimal result = earth.getPeopleQuantity();

        Assertions.assertEquals(new BigDecimal("3408317326"), result);
    }
}
