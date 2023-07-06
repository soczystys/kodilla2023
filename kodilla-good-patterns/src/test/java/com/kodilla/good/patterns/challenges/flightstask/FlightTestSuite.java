package com.kodilla.good.patterns.challenges.flightstask;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FlightTestSuite {

    @Test
    void checkIfArrivesAtTest() {
        String from = "Gdańsk";
        String to = "Wrocław";
        LocalDateTime fromDateTime = LocalDateTime.of(LocalDate.of(2023, 7, 6), LocalTime.of(14, 20));
        LocalDateTime krakowArrivalDateTime = LocalDateTime.of(LocalDate.of(2023, 7, 6), LocalTime.of(15,40));
        LocalDateTime krakowDepartureDateTime = LocalDateTime.of(LocalDate.of(2023, 7, 6), LocalTime.of(16,10));
        LocalDateTime toDateTime = LocalDateTime.of(LocalDate.of(2023, 7, 6), LocalTime.of(17,0));
        Map<String, ArrivalDeparture> directLocations = new HashMap<>();
        directLocations.put("Kraków", new ArrivalDeparture(krakowArrivalDateTime, krakowDepartureDateTime));

        Flight flight = new Flight(fromDateTime, from, toDateTime, to, directLocations);
        assertTrue(flight.checkIfArrivesAt("Kraków"));
        assertFalse(flight.checkIfArrivesAt("Gdańsk"));
        assertTrue(flight.checkIfArrivesAt("Wrocław"));
    }

    @Test
    void checkIfDeparturesFromTest() {
        String from = "Gdańsk";
        String to = "Wrocław";
        LocalDateTime fromDateTime = LocalDateTime.of(LocalDate.of(2023, 7, 6), LocalTime.of(14, 20));
        LocalDateTime krakowArrivalDateTime = LocalDateTime.of(LocalDate.of(2023, 7, 6), LocalTime.of(15,40));
        LocalDateTime krakowDepartureDateTime = LocalDateTime.of(LocalDate.of(2023, 7, 6), LocalTime.of(16,10));
        LocalDateTime toDateTime = LocalDateTime.of(LocalDate.of(2023, 7, 6), LocalTime.of(17,0));
        Map<String, ArrivalDeparture> directLocations = new HashMap<>();
        directLocations.put("Kraków", new ArrivalDeparture(krakowArrivalDateTime, krakowDepartureDateTime));

        Flight flight = new Flight(fromDateTime, from, toDateTime, to, directLocations);
        assertTrue(flight.checkIfDeparturesFrom("Kraków"));
        assertTrue(flight.checkIfDeparturesFrom("Gdańsk"));
        assertFalse(flight.checkIfDeparturesFrom("Wrocław"));
    }

}
