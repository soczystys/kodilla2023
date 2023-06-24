package com.kodilla.exception.nullpointer;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User("user1");

        Optional<User> userOptional = Optional.ofNullable(user);

        userOptional.ifPresent(u -> System.out.println(u.getName()));
    }
}
