package com.kodilla.good.patterns.challenges.flightstask;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Objects;

public class Flight {

    private LocalDateTime departure;
    private String from;

    private LocalDateTime arrival;
    private String destination;

    private Map<String, ArrivalDeparture> directLocations;

    public Flight(LocalDateTime departure, String from, LocalDateTime arrival, String destination, Map<String, ArrivalDeparture> directLocations) {
        this.departure = departure;
        this.from = from;
        this.arrival = arrival;
        this.destination = destination;
        this.directLocations = directLocations;
    }

    boolean checkIfArrivesAt(String arrivalString) {
        return destination.equals(arrivalString) || directLocations.containsKey(arrivalString);
    }

    boolean checkIfDeparturesFrom(String departureString) {
        return from.equals(departureString) || directLocations.containsKey(departureString);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return departure.equals(flight.departure) && from.equals(flight.from) && arrival.equals(flight.arrival) && destination.equals(flight.destination) && Objects.equals(directLocations, flight.directLocations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departure, from, arrival, destination, directLocations);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departure=" + departure +
                ", from='" + from + '\'' +
                ", arrival=" + arrival +
                ", destination='" + destination + '\'' +
                ", directLocations=" + directLocations +
                '}';
    }
}
