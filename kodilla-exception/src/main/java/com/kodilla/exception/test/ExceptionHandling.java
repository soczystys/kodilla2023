package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(5, 2);
        } catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println("caught exception: " + e);
        } finally {
            System.out.println("inside finally block");
        }
    }

}
