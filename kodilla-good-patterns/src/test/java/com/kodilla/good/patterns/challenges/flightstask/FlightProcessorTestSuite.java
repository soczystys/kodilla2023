package com.kodilla.good.patterns.challenges.flightstask;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class FlightProcessorTestSuite {

    @Test
    void getAllFlightsFromTest() {
        String from = "Gdańsk";
        String to = "Wrocław";
        LocalDateTime fromDateTime = LocalDateTime.of(LocalDate.of(2023, 7, 6), LocalTime.of(14, 20));
        LocalDateTime krakowArrivalDateTime = LocalDateTime.of(LocalDate.of(2023, 7, 6), LocalTime.of(15,40));
        LocalDateTime krakowDepartureDateTime = LocalDateTime.of(LocalDate.of(2023, 7, 6), LocalTime.of(16,10));
        LocalDateTime toDateTime = LocalDateTime.of(LocalDate.of(2023, 7, 6), LocalTime.of(17,0));
        Map<String, ArrivalDeparture> directLocations = new HashMap<>();
        directLocations.put("Kraków", new ArrivalDeparture(krakowArrivalDateTime, krakowDepartureDateTime));

        Flight flight = new Flight(fromDateTime, from, toDateTime, to, directLocations);

        from = "Gdańsk";
        to = "Warszawa";
        fromDateTime = LocalDateTime.of(LocalDate.of(2023, 7, 6), LocalTime.of(7, 20));
        toDateTime = LocalDateTime.of(LocalDate.of(2023, 7, 6), LocalTime.of(10,0));
        directLocations = new HashMap<>();

        Flight flight2 = new Flight(fromDateTime, from, toDateTime, to, directLocations);


        from = "Kraków";
        to = "Gdańsk";
        fromDateTime = LocalDateTime.of(LocalDate.of(2023, 7, 6), LocalTime.of(7, 20));
        toDateTime = LocalDateTime.of(LocalDate.of(2023, 7, 6), LocalTime.of(10,0));
        directLocations = new HashMap<>();

        Flight flight3 = new Flight(fromDateTime, from, toDateTime, to, directLocations);


        FlightProcessor flightProcessor = new FlightProcessor();
        flightProcessor.addFlight(flight);
        flightProcessor.addFlight(flight2);
        flightProcessor.addFlight(flight3);

        var flights = flightProcessor.getAllFlightsFrom("Kraków");

        Assertions.assertEquals(2, flights.size());

    }

    @Test
    void getAllFlightsToTest() {
        String from = "Gdańsk";
        String to = "Wrocław";
        LocalDateTime fromDateTime = LocalDateTime.of(LocalDate.of(2023, 7, 6), LocalTime.of(14, 20));
        LocalDateTime krakowArrivalDateTime = LocalDateTime.of(LocalDate.of(2023, 7, 6), LocalTime.of(15,40));
        LocalDateTime krakowDepartureDateTime = LocalDateTime.of(LocalDate.of(2023, 7, 6), LocalTime.of(16,10));
        LocalDateTime toDateTime = LocalDateTime.of(LocalDate.of(2023, 7, 6), LocalTime.of(17,0));
        Map<String, ArrivalDeparture> directLocations = new HashMap<>();
        directLocations.put("Kraków", new ArrivalDeparture(krakowArrivalDateTime, krakowDepartureDateTime));

        Flight flight = new Flight(fromDateTime, from, toDateTime, to, directLocations);

        from = "Gdańsk";
        to = "Warszawa";
        fromDateTime = LocalDateTime.of(LocalDate.of(2023, 7, 6), LocalTime.of(7, 20));
        toDateTime = LocalDateTime.of(LocalDate.of(2023, 7, 6), LocalTime.of(10,0));
        directLocations = new HashMap<>();

        Flight flight2 = new Flight(fromDateTime, from, toDateTime, to, directLocations);


        from = "Warszawa";
        to = "Kraków";
        fromDateTime = LocalDateTime.of(LocalDate.of(2023, 7, 6), LocalTime.of(7, 20));
        toDateTime = LocalDateTime.of(LocalDate.of(2023, 7, 6), LocalTime.of(10,0));
        directLocations = new HashMap<>();

        Flight flight3 = new Flight(fromDateTime, from, toDateTime, to, directLocations);


        FlightProcessor flightProcessor = new FlightProcessor();
        flightProcessor.addFlight(flight);
        flightProcessor.addFlight(flight2);
        flightProcessor.addFlight(flight3);

        var flights = flightProcessor.getAllFlightsTo("Kraków");

        Assertions.assertEquals(2, flights.size());
    }


}
