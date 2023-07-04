package com.kodilla.good.patterns.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieStoreTestSuite {
    @Test
    void getMoviesAsStringTest() {
        MovieStore movieStore = new MovieStore();

        String moviesString = movieStore.getMoviesAsString();

        Assertions.assertTrue(moviesString.contains("Żelazny Człowiek"));
        Assertions.assertTrue(moviesString.contains("Iron Man"));

        Assertions.assertTrue(moviesString.contains("Mściciele"));
        Assertions.assertTrue(moviesString.contains("Avengers"));

        Assertions.assertTrue(moviesString.contains("Błyskawica"));
        Assertions.assertTrue(moviesString.contains("Flash"));
    }
}
