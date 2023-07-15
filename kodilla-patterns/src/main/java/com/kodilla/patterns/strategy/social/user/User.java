package com.kodilla.patterns.strategy.social.user;

import com.kodilla.patterns.strategy.social.publisher.SocialPublisher;

public sealed class User permits Millenials, YGeneration, ZGeneration {

    String username;
    protected SocialPublisher socialPublisher;

    void sharePost() {
        socialPublisher.share();
    }

    public User(String username) {
        this.username = username;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
