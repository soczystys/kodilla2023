package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("Berlin", "Warsaw");
        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("route not available for now");
        } finally {
            System.out.println("method findFlight invoked");
        }
        System.out.println("route available");
    }
}
