package com.kodilla.patterns.strategy.social.user;

import com.kodilla.patterns.strategy.social.publisher.TwitterPublisher;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        Millenials millenials = new Millenials("john");
        YGeneration yGeneration = new YGeneration("gafdss");
        ZGeneration zGeneration = new ZGeneration("gga");

        millenials.sharePost();
        yGeneration.sharePost();
        zGeneration.sharePost();
    }

    @Test
    void testIndividualSharingStrategy() {
        Millenials millenials = new Millenials("john");
        millenials.setSocialPublisher(new TwitterPublisher());
        millenials.sharePost();
    }
}
