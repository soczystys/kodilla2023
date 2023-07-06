package com.kodilla.good.patterns.challenges.flightstask;

import java.util.ArrayList;
import java.util.List;

public class FlightProcessor {
    List<Flight> flightList = new ArrayList<>();

    public void addFlight(Flight flight) {
        flightList.add(flight);
    }

    public List<Flight> getAllFlightsFrom(String location) {
        return flightList.stream()
                .filter(flight -> flight.checkIfDeparturesFrom(location))
                .toList();
    }

    public List<Flight> getAllFlightsTo(String location) {
        return flightList.stream()
                .filter(flight -> flight.checkIfArrivesAt(location))
                .toList();
    }
}
