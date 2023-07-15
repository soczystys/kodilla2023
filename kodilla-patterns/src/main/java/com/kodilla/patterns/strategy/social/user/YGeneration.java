package com.kodilla.patterns.strategy.social.user;

import com.kodilla.patterns.strategy.social.publisher.SnapchatPublisher;

public non-sealed class YGeneration extends User {
    public YGeneration(String username) {
        super(username);
        this.socialPublisher = new SnapchatPublisher();
    }
}
