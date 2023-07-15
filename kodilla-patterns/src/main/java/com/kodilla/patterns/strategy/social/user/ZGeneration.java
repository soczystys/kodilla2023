package com.kodilla.patterns.strategy.social.user;

import com.kodilla.patterns.strategy.social.publisher.TwitterPublisher;

public non-sealed class ZGeneration extends User {
    public ZGeneration(String username) {
        super(username);
        this.socialPublisher = new TwitterPublisher();
    }
}
