package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airportAvailability = new HashMap<>();
        airportAvailability.put("Los Angeles", true);
        airportAvailability.put("Warsaw", true);
        airportAvailability.put("Stockholm", true);
        airportAvailability.put("Berlin", true);

        boolean departureIsInMap = false;
        boolean arrivalIsInMap = false;

        for (Map.Entry<String, Boolean> entry: airportAvailability.entrySet()) {
                if (entry.getValue().equals(false)) {
                    throw new RouteNotFoundException();
                } else if (entry.getKey().equals(flight.getArrivalAirport())) {
                    arrivalIsInMap = true;
                } else if (entry.getKey().equals(flight.getDepartureAirport())) {
                    departureIsInMap = true;
                }
        }
        if (!departureIsInMap || !arrivalIsInMap) {
            throw new RouteNotFoundException();
        }
    }
}
