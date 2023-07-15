package com.kodilla.patterns.strategy.social.user;

import com.kodilla.patterns.strategy.social.publisher.FacebookPublisher;

public non-sealed class Millenials extends User {
    public Millenials(String username) {
        super(username);
        this.socialPublisher = new FacebookPublisher();
    }
}
