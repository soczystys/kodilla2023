package com.kodilla.patterns.strategy.social.publisher;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public void share() {
        System.out.println("inside method share [FacebookPublisher]");
    }
}
